/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.*; // para manipulação do JDBC
/**
 *
 * @author mk
 */
public class ConexaoBD {
    
/**
 * Classe respons�vel pelo gerenciamento da conex�o com o banco de dados
 * @author Karen Borges
 */
    //Atributos para manipulação do BD
    private static String user="root";
    private static String password="";
    private static String driver="com.mysql.cj.jdbc.Driver";
    private static String url= "jdbc:mysql://localhost:3306/oof_f_c";
    private static Connection conexao;
    private static ConexaoBD conexaoBD;
    
    public static ConexaoBD getInstance() throws ClassNotFoundException, SQLException  {
         if( conexaoBD == null ) {
              conexaoBD = new ConexaoBD();
         } 
         return conexaoBD;
    }
    
    private ConexaoBD() throws ClassNotFoundException, SQLException  {
        conexao = abrirConexao();
    }
    
    private Connection abrirConexao() throws ClassNotFoundException, SQLException {
        Class.forName(driver); //carrega o drive. Pode gerar ClassNotFoundException
        conexao = DriverManager.getConnection(url, user, password); // abre a conex�o para esta URL usando o driver carregado na linha anterior
        return conexao; //Conseguiu abrir a conexao
    }
  
    public static void fecharConexao() throws SQLException{
        conexao.close();
        conexao = null;
    }

    public static Connection getConexao() {
        return conexao;
    }
      
    
    public static void main(String[] args) {
        ConexaoBD con;
        try {
            con = ConexaoBD.getInstance();
            System.out.println("Abriu conexao" + con);
            ConexaoBD.fecharConexao();
            System.out.println("Fechou conexao");
        } catch (SQLException ex) {
            System.out.println("Erro = " + ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro = " + ex);
        }
        
    }
}
