package avaliacao.exercicio2.dao;

import avaliacao.exercicio2.modelo.Filme;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmeDAO {
    private Connection connection;

    public FilmeDAO(Connection connection) {
        this.connection = connection;
    }

    public void cadastrar(Filme filme) {
        String sql = "INSERT INTO FILME (NOME,DESCRICAO,ANO) VALUES (?, ?, ?)";

        try (PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.setString(1, filme.getNome());
            pstm.setString(2,filme.getDescricao());
            pstm.setInt(3, filme.getAno());

            pstm.execute();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    public List<Filme> listar() {
        List<Filme> filmes = new ArrayList<Filme>();

        String sql = "SELECT ID, NOME, DESCRICAO, ANO FROM FILME";

        try (PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.execute();

            try(ResultSet rst = pstm.getResultSet()) {

                while (rst.next()) {
                    Filme filme = new Filme(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getInt(4));
                    filmes.add(filme);
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return filmes;
    }

}
