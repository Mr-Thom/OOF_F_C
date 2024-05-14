/*NOMES: Thômas e Daniel
TURMA: 302 INFO

PERSONAGEMDAO: Classe responsável CRUD das classe Personagem
 */
package persistencia;

import entidades.Historico;
import entidades.Personagem;
import entidades.Peso;
import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonagemDAO implements DAO {

    private static PersonagemDAO pdao;
    private static Connection conexao;

    public static PersonagemDAO getInstance() {
        if (pdao == null) {
            pdao = new PersonagemDAO();
        }
        return pdao;
    }

    private PersonagemDAO() {
        ConexaoBD conexaoBD;

        try {
            conexaoBD = ConexaoBD.getInstance();
            conexao = ConexaoBD.getConexao();
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro = " + ex);
        } catch (SQLException ex) {
            //Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro = " + ex);
        }

    }

    @Override
    public boolean inserir(Object obj) {
        if (obj != null && obj instanceof Personagem) {

            int quantPersonagens = 0;

            try {
                String sql = "SELECT * FROM personagem";
                Statement stmt = conexao.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    quantPersonagens++;
                }
            } catch (Exception e) {
                System.out.println("Erro = " + e);
                return false;
            }

            if (quantPersonagens < 3) {

                Personagem p = (Personagem) obj;

                HistoricoDAO historico = HistoricoDAO.getInstance();

                if (historico.inserir(p)) {
                    int idHistorico = p.getHistorico().getId();
                    int idPersonagem;
                    String nome = p.getNome();
                    int idade = p.getIdade();
                    int codAvatar = p.getCod_avatar();
                    int peso = p.getPeso().getCod();
                    boolean aposentado = p.isAposentado();

                    String sql = "INSERT INTO personagem (nome, idade, peso, avatar, aposentado, id_historico) VALUES (?, ?, ?, ?, ?, ?)";

                    try {
                        PreparedStatement pstmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                        pstmt.setString(1, nome);
                        pstmt.setInt(2, idade);
                        pstmt.setInt(3, peso);
                        pstmt.setInt(4, codAvatar);
                        pstmt.setBoolean(5, aposentado);
                        pstmt.setInt(6, idHistorico);

                        pstmt.executeUpdate();

                        ResultSet rs1 = pstmt.getGeneratedKeys();
                        if (rs1.next()) {
                            idPersonagem = rs1.getInt(1);
                            p.setId(idPersonagem);
                        }
                        return true;
                    } catch (SQLException sqe) {
                        System.out.println("Erro no id personagem = " + sqe);
                    }
                }

            }

        }
        return false;
    }

    @Override
    public boolean excluir(Object obj
    ) {
        if (obj != null && obj instanceof String) {

            try {
                String id = (String) obj;
                int idHistorico;
                String sql = "SELECT id_historico FROM personagem WHERE id = '" + id + "'";

                Statement stmt = conexao.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                if (rs.isBeforeFirst()) {
                    rs.next();
                    idHistorico = rs.getInt(1);
                    HistoricoDAO historico = HistoricoDAO.getInstance();

                    String sql2 = "DELETE FROM personagem WHERE id = '" + id + "'";
                    Statement stmt2 = conexao.createStatement();
                    int nreg = stmt2.executeUpdate(sql2);
                    if (nreg > 0) {
                        historico.excluir(Integer.toString(idHistorico));
                        return true;
                    }
                }
            } catch (Exception e) {
                System.out.println("Erro = " + e);
            }

        }
        return false;
    }

    @Override
    public boolean editar(Object obj
    ) {
        if (obj != null && obj instanceof Personagem) {
            try {
                Personagem p = (Personagem) obj;
                String sql1 = "UPDATE personagem SET aposentado = ?  WHERE id = ?";

                PreparedStatement pstmt = conexao.prepareStatement(sql1);
                pstmt.setBoolean(1, p.isAposentado());
                pstmt.setInt(2, p.getId());

                pstmt.executeUpdate();
                HistoricoDAO historico = HistoricoDAO.getInstance();
                historico.editar(p);
                return true;
            } catch (Exception ex) {
                System.out.println("Erro = " + ex);
            }

        }
        return false;
    }

    @Override
    public Object pesquisar(Object obj
    ) {
        if (obj != null && obj instanceof String) {
            try {
                String id = (String) obj;
                String sql = "SELECT * FROM personagem WHERE id = '" + id + "'";
                Statement stmt = conexao.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                if (rs.isBeforeFirst()) { //verifica se resultou algo da pesquisa
                    rs.next();
                    int personagemId = Integer.parseInt(id);
                    String nome = rs.getString(2);
                    int idade = rs.getInt(3);
                    int peso = rs.getInt(5);
                    boolean aposentado = rs.getBoolean(7);
                    int avatar = rs.getInt(4);
                    int idHistorico = rs.getInt(6);

                    HistoricoDAO historico = HistoricoDAO.getInstance();
                    Personagem p = new Personagem(nome, idade, peso, avatar, (Historico) historico.pesquisar(Integer.toString(idHistorico)));
                    p.setId(personagemId);
                    return p;
                }
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex);
            }
        }

        return null;
    }

    public ArrayList<Personagem> pesquisarTudo() {
        ArrayList<Personagem> lista = new ArrayList<>();
        try {
            String sql = "SELECT * FROM personagem";
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt(1);
                String nome = rs.getString(2);
                int idade = rs.getInt(3);
                int avatar = rs.getInt(4);
                int peso = rs.getInt(5);
                int idHistorico = rs.getInt(6);
                boolean aposentado = rs.getBoolean(7);

                String sql2 = "SELECT * FROM historico WHERE id = '" + idHistorico + "'";
                Statement stmt2 = conexao.createStatement();
                ResultSet rs2 = stmt2.executeQuery(sql2);

                if (rs2.isBeforeFirst()) { //verifica se resultou algo da pesquisa
                    rs2.next();

                    int partidasG = rs2.getInt(3);
                    int partidasJ = rs2.getInt(2);
                    int partidasP = rs2.getInt(4);

                    Historico historico = new Historico(partidasG, partidasP, partidasJ);

                    Personagem p = new Personagem(nome, idade, peso, avatar, historico);
                    p.setId(id);
                    p.getHistorico().setId(idHistorico);
                    if (aposentado == true) {
                        p.Aposentar();
                    }
                    lista.add(p);
                }
            }
            return lista;
        } catch (SQLException sqe) {
            System.out.println("Erro = " + sqe);
        }
        return null;
    }
}
