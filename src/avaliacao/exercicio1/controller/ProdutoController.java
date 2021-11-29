package avaliacao.exercicio1.controller;

import avaliacao.exercicio1.dao.ProdutoDAO;
import avaliacao.exercicio1.factory.ConnectionFactory;
import avaliacao.exercicio1.modelo.Produto;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ProdutoController {

    private ProdutoDAO produtoDAO;

    public ProdutoController() {
        Connection connection = new ConnectionFactory().recuperarConexao();
        this.produtoDAO = new ProdutoDAO(connection);
    }

    public void cadastrar(Produto produto) {
        this.produtoDAO.cadastrar(produto);
    }

    public List<Produto> listar() {
       return this.produtoDAO.listar();
    }

    public void atualizar(Produto produto) {
        this.produtoDAO.atualizar(produto);
    }

    public void excluir(int id) {
        this.produtoDAO.excluir(id);
    }

}
