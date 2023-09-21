package conexao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TesteConexao {

    public static void main(String[] args) {

        ConexaoDAO dao = new ConexaoDAO();
        try {
            PreparedStatement p = dao.conectaBD().prepareStatement("select * from funcionarios");
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("nome"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

//            ConexaoDAO con = new ConexaoDAO();
//            String sql = "select * from funcionarios";
//            PreparedStatement stm = con.getConexaoDAO().prepareStatement(sql);
//            ResultSet rs = stm.executeQuery();
//            while (rs.next()) {
//                
//                
//                String nome = rs.getString("nome");
//                String cpf = rs.getString("cpf");
//                String sexo = rs.getString("sexo");
//                String idade = rs.getString("sexo");
//                
//                String mdq = nome + " - " + cpf + " - " + sexo + " - " + idade ;
//                System.out.println(mdq);
//              
//            }
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
    }
}
