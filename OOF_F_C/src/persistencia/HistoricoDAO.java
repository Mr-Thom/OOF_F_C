/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidades.Historico;
import entidades.Personagem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 08050520
 */
public class HistoricoDAO implements DAO {

    private static HistoricoDAO pdao;
    private static Connection conexao;

    public static HistoricoDAO getInstance() {
        if (pdao == null) {
            pdao = new HistoricoDAO();
        }
        return pdao;
    }

    private HistoricoDAO() {
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
            Personagem p = (Personagem) obj;

            int idHistorico;
            int ganhas = p.getHistorico().getPartidasGanhas();
            int perdidas = p.getHistorico().getPartidasPerdidas();
            int jogadas = p.getHistorico().getPartidasJogadas();

            String sql = "INSERT INTO historico (partidas_ganhas, partidas_jogadas, partidas_perdidas) VALUES (?, ?, ?)";

            try {
                PreparedStatement pstmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                pstmt.setInt(1, ganhas);
                pstmt.setInt(2, jogadas);
                pstmt.setInt(3, perdidas);
                pstmt.executeUpdate();

                ResultSet rs1 = pstmt.getGeneratedKeys();

                if (rs1.next()) {
                    idHistorico = rs1.getInt(1);
                    p.getHistorico().setId(idHistorico);
                    return true;
                }

            } catch (Exception e) {
                System.out.println("Erro = " + e);
            }
        }
        return false;
    }

    @Override
    public Object pesquisar(Object obj) {
        if (obj != null && obj instanceof String) {
            try {
                String id = (String) obj;

                String sql = "SELECT * FROM historico WHERE id = '" + id + "'";
                Statement stmt = conexao.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                if (rs.isBeforeFirst()) {
                    rs.next();

                    int partidasG = rs.getInt(3);
                    int partidasJ = rs.getInt(2);
                    int partidasP = rs.getInt(4);

                    Historico historico = new Historico(partidasG, partidasP, partidasJ);
                    historico.setId(Integer.parseInt(id));
                    return historico;
                }
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex);
            }
        }
        return null;
    }

    @Override
    public boolean editar(Object obj) {
        if (obj != null && obj instanceof Personagem) {
            try {
                Personagem p = (Personagem) obj;
                String sql2 = "UPDATE historico SET partidas_ganhas = ? WHERE id = ?;";
                String sql3 = "UPDATE historico SET partidas_jogadas = ? WHERE id = ?;";
                String sql4 = "UPDATE historico SET partidas_perdidas = ?  WHERE id = ?;";

                PreparedStatement pstmt2 = conexao.prepareStatement(sql2);
                pstmt2.setInt(1, p.getHistorico().getPartidasGanhas());
                pstmt2.setInt(2, p.getHistorico().getId());

                PreparedStatement pstmt3 = conexao.prepareStatement(sql3);
                pstmt3.setInt(1, p.getHistorico().getPartidasJogadas());
                pstmt3.setInt(2, p.getHistorico().getId());

                PreparedStatement pstmt4 = conexao.prepareStatement(sql4);
                pstmt4.setInt(1, p.getHistorico().getPartidasPerdidas());
                pstmt4.setInt(2, p.getHistorico().getId());
                pstmt2.executeUpdate();
                pstmt3.executeUpdate();
                pstmt4.executeUpdate();
                return true;
            } catch (Exception ex) {
                System.out.println("Erro = " + ex);
            }

        }
        return false;
    }

    @Override
    public boolean excluir(Object obj) {
        if (obj != null && obj instanceof String) {

            try {
                String id = (String) obj;
                String sql = "DELETE FROM historico WHERE id = '" + id + "'";
                Statement stmt = conexao.createStatement();
                int nreg = stmt.executeUpdate(sql);
                if (nreg > 0) {
                    return true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(HistoricoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return false;
    }
}
