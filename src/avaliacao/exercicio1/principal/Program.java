package avaliacao.exercicio1.principal;

import avaliacao.exercicio1.controller.ProdutoController;
import avaliacao.exercicio1.dao.ProdutoDAO;
import avaliacao.exercicio1.modelo.Produto;

import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProdutoController produtoController = new ProdutoController();
        int escolha;

        do {
            System.out.println("Digite 1 para cadastrar novos produtos: ");
            System.out.println("Digite 2 para atualizar o primeiro produto cadastrado: ");
            System.out.println("Digite 3 para excluir o segundo produto cadastrado: ");
            System.out.println("Digite 0 para finalizar: ");

            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    Produto produto1 = new Produto("Headset", "Headset sem fio", 5, 399.89);
                    produtoController.cadastrar(produto1);
                    Produto produto2 = new Produto("Mouse", "Mouse óptico", 7, 179.99);
                    produtoController.cadastrar(produto2);
                    Produto produto3 = new Produto("Teclado", "Teclado RGB", 9, 210.09);
                    produtoController.cadastrar(produto3);
                    System.out.println("Produtos cadastrados com sucesso!");
                    break;

                case 2:
                    Produto produtoParaAtualizar = new Produto(1, "Headset", "Headset com fio", 3, 259.79);
                    produtoController.atualizar(produtoParaAtualizar);
                    System.out.println("Produto atualizado com sucesso!");
                    break;

                case 3:
                    produtoController.excluir(2);
                    System.out.println("Produto excluido com sucesso!");
                    break;

                case 0:
                    System.out.println("Saindo da aplicação");
                    break;
            }
            List<Produto> produtos = produtoController.listar();
            for (int i = 0; i < produtos.size(); i++) {
                System.out.println(produtos.get(i));
            }
        } while (escolha != 0);

        sc.close();
    }
}
