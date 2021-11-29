package avaliacao.exercicio1.dao;

import avaliacao.exercicio1.modelo.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    private Connection connection;

    public ProdutoDAO(Connection connection) {
        this.connection = connection;
    }

    public void cadastrar(Produto produto) {
        String sql = "INSERT INTO PRODUTO (NOME, DESCRICAO, QUANTIDADE, PRECO) VALUES (?, ?, ?, ?)";

        try (PreparedStatement pstm = connection.prepareStatement(sql)) {

            pstm.setString(1, produto.getNome());
            pstm.setString(2, produto.getDescricao());
            pstm.setInt(3, produto.getQuantidade());
            pstm.setDouble(4, produto.getPreco());

            pstm.execute();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<Produto> listar()  {
        List<Produto> produtos = new ArrayList<Produto>();

        String sql = "SELECT ID, NOME, DESCRICAO, QUANTIDADE, PRECO FROM PRODUTO";

        try (PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.execute();

            try (ResultSet rst = pstm.getResultSet()) {
                while (rst.next()) {
                    Produto produto = new Produto(rst.getInt(1), rst.getString(2),
                            rst.getString(3), rst.getInt(4), rst.getDouble(5));
                    produtos.add(produto);
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return produtos;
    }
    public void atualizar(Produto produto) {

        String sql = "UPDATE PRODUTO SET NOME = ?, DESCRICAO = ?, QUANTIDADE = ?, PRECO = ? WHERE ID = ?";

        try (PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.setString(1, produto.getNome());
            pstm.setString(2, produto.getDescricao());
            pstm.setInt(3, produto.getQuantidade());
            pstm.setDouble(4, produto.getPreco());
            pstm.setInt(5, produto.getId());

            pstm.execute();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    public void excluir(int id) {
        String sql =  "DELETE FROM PRODUTO WHERE ID = ?";

        try (PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.setInt(1, id);

            pstm.execute();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
