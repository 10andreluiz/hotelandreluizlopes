package conexao;

import dados.bean.Fornecedores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FFornecedores {

    private ConexaoDAO mysql = new ConexaoDAO();
    private Connection conn = mysql.conectaBD();
    private String sSQL = "";
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {

        DefaultTableModel modelo;
        String[] titulos = {"ID", "NOME", "DESCRICAO", "RUA", "BAIRRO", "NUMERO", "CIDADE", "UF", "EMAIL", "TELEFONE", "CEP"};
        String[] registro = new String[8];
        totalregistros = 0;

        modelo = new DefaultTableModel(null, titulos);
        sSQL = "SELECT * FROM funcionarios WHERE nome LIKE '%" + buscar + "%' ORDER BY ID";

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("NOME");
                registro[2] = rs.getString("DESCRICAO");
                registro[3] = rs.getString("RUA");
                registro[4] = rs.getString("BAIRRO");
                registro[5] = rs.getString("NUMERO");
                registro[6] = rs.getString("CIDADE");
                registro[7] = rs.getString("UF");
                registro[8] = rs.getString("EMAIL");
                registro[9] = rs.getString("TELEFONE");
                registro[10] = rs.getString("CEP");

                modelo.addRow(registro);
                totalregistros++;
            }

            rs.close();
            st.close();

            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public boolean inserir(Fornecedores dts) {
        sSQL = "insert into quartos (nome, descricao, rua, bairro, numero, cidade, uf, email, telefone, cpf)"
                + "values(?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sSQL);
            preparedStatement.setString(1, dts.getNome());
            preparedStatement.setString(2, dts.getDescricao());
            preparedStatement.setString(4, dts.getBairro());
            preparedStatement.setInt(5, dts.getNumero());
            preparedStatement.setString(6, dts.getCidade());
            preparedStatement.setString(7, dts.getUf());
            preparedStatement.setString(8, dts.getEmail());
            preparedStatement.setInt(9, dts.getTelefone());
            preparedStatement.setString(10, dts.getCep());

            int n = preparedStatement.executeUpdate();
            if (n != 0) {
                return true;

            } else {

                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;

        }

    }

    public boolean atualizar(Fornecedores dts) {
        sSQL = "UPDATE fornecedores SET nome=?, descricao=?, rua=?, bairro=?, numero=?, cidade=?, uf=?, email=?, telefone=?, cep=? WHERE id=?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sSQL);
            preparedStatement.setString(1, dts.getNome());
            preparedStatement.setString(2, dts.getDescricao());
            preparedStatement.setString(3, dts.getRua());
            preparedStatement.setString(4, dts.getBairro());
            preparedStatement.setInt(5, dts.getNumero());
            preparedStatement.setString(6, dts.getCidade());
            preparedStatement.setString(7, dts.getUf());
            preparedStatement.setString(8, dts.getEmail());
            preparedStatement.setInt(9, dts.getTelefone());
            preparedStatement.setString(10, dts.getCep());
            preparedStatement.setInt(11, dts.getId_fornecedores());

            int n = preparedStatement.executeUpdate();
            if (n != 0) {
                return true;

            } else {

                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;

        }

    }

    public boolean deletar(Fornecedores dts) {
        sSQL = "delete from fornecedores where id fornecedores=?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sSQL);
            preparedStatement.setInt(1, dts.getId_fornecedores());

            int n = preparedStatement.executeUpdate();
            if (n != 0) {
                return true;

            } else {

                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;

        }

    }
}
