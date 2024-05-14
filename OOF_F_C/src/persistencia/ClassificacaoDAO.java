/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidades.*;
import entidades.Peso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author 08050520
 */
public class ClassificacaoDAO implements DAO {

    private static ClassificacaoDAO pdao;
    private static Connection conexao;

    public static ClassificacaoDAO getInstance() {
        if (pdao == null) {
            pdao = new ClassificacaoDAO();
        }
        return pdao;
    }

    private ClassificacaoDAO() {
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
        if (obj != null && obj instanceof Classificado) {

            Classificado c = (Classificado) obj;

            String nome = c.getNome();
            int idade = c.getIdade();
            Peso peso = c.getPeso();
            int partJ = c.getPartidasJogadas();
            int partG = c.getPartidasGanhas();
            int partP = c.getPartidasPerdidas();

            String sql = "INSERT INTO classificacao (nome, idade, peso, partidas_jogadas, partidas_ganhas, partidas_perdidas) VALUES (?, ?, ?, ?, ?, ?)";

            try {
                PreparedStatement pstmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                pstmt.setString(1, nome);
                pstmt.setInt(2, idade);
                pstmt.setInt(3, peso.getCod());
                pstmt.setInt(4, partJ);
                pstmt.setInt(5, partG);
                pstmt.setInt(6, partP);

                pstmt.executeUpdate();
                return true;
            } catch (SQLException sqe) {
                System.out.println("Erro no id personagem = " + sqe);
            }

        }
        return false;
    }

    @Override
    public Object pesquisar(Object obj) {
        TreeSet<Classificado> lista = new TreeSet<Classificado>();
        if (obj != null & obj instanceof String) {
            try {
                String nomeParametro = (String) obj;

                String sql = "SELECT * FROM classificacao WHERE nome LIKE ('" + nomeParametro + "%')";
                Statement stmt = conexao.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                if (rs.isBeforeFirst()) {
                    while (rs.next()) {
                        String nome = rs.getString(2);
                        int idade = rs.getInt(3);
                        int peso = rs.getInt(4);
                        int partJ = rs.getInt(5);
                        int partG = rs.getInt(6);
                        int partP = rs.getInt(7);

                        Classificado c = new Classificado(nome, idade, peso, partJ, partG, partP);
                        lista.add(c);
                    }
                    TreeSet<Classificado> tree = (TreeSet<Classificado>) this.pesquisarTudo();
                    Iterator i = lista.iterator();
                    Iterator i2 = tree.iterator();
                    while (i.hasNext()) {
                        Classificado classificado = (Classificado) i.next();

                        while (i2.hasNext()) {
                            Classificado classificado2 = (Classificado) i2.next();
                            if (classificado.equals(classificado2)){
                                classificado.setPosicao(classificado2.getPosicao());
                                break;
                            }
                        }
                    }
                    return lista;
                }
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex);
            }
        }
        return null;
    }

    @Override
    public boolean editar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean excluir(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public TreeSet<Classificado> pesquisarTudo() {
        TreeSet<Classificado> lista = new TreeSet<Classificado>();
        try {
            String sql = "SELECT * FROM classificacao";
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String nome = rs.getString(2);
                int idade = rs.getInt(3);
                int peso = rs.getInt(4);
                int partJ = rs.getInt(5);
                int partG = rs.getInt(6);
                int partP = rs.getInt(7);

                Classificado c = new Classificado(nome, idade, peso, partJ, partG, partP);
                lista.add(c);

            }
            Iterator i = lista.iterator();
            int cont = 1;
            while (i.hasNext()) {
                Classificado classificado = (Classificado) i.next();
                classificado.setPosicao(cont);
                cont++;
            }
            return lista;
        } catch (SQLException sqe) {
            System.out.println("Erro = " + sqe);
        }
        return null;
    }

}
