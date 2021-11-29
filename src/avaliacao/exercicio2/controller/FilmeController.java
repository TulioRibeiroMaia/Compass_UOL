package avaliacao.exercicio2.controller;

import avaliacao.exercicio2.factory.ConnectionFactory;
import avaliacao.exercicio2.dao.FilmeDAO;
import avaliacao.exercicio2.modelo.Filme;

import java.sql.Connection;
import java.util.List;

public class FilmeController {

    private FilmeDAO filmeDAO;

    public FilmeController() {
        Connection connection = new ConnectionFactory().recuperarConexao();
        this.filmeDAO = new FilmeDAO(connection);
    }

    public void cadastrar(Filme filme) {
        this.filmeDAO.cadastrar(filme);
    }
    public List<Filme> listar() {
        return this.filmeDAO.listar();
    }

}
