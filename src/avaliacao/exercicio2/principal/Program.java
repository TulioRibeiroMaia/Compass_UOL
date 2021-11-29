package avaliacao.exercicio2.principal;

import avaliacao.exercicio2.controller.FilmeController;
import avaliacao.exercicio2.modelo.Filme;

import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int paginas;
        int numeroFilmes;


        FilmeController filmeController = new FilmeController();

        List<Filme> filmes;

        inserirFilmes(filmeController);
        filmes = filmeController.listar();

        // menu
        System.out.println("Quantos filmes você deseja ver?: ");
        numeroFilmes = sc.nextInt();
        System.out.println("Você deseja acessar a primeira ou segunda página?: ");
        paginas = sc.nextInt();

        if(paginas == 1) {
            for( int i = 0; i < numeroFilmes; i++) {
                System.out.println(filmes.get(i));
            }
        } else if (paginas == 2) {
           for( int i = 10; i < numeroFilmes; i++) {
                System.out.println(filmes.get(i));
            }
        } else {
            System.out.println("Não existe essa página");
        }
        sc.close();
    }

    private static void inserirFilmes( FilmeController filmeController) {
        Filme filme1 = new Filme("O RESGATE DO SOLDADO RYAN","Ao desembarcar na Normandia, no dia 6 de junho de 1944, capitão Miller (Tom Hanks) recebe a missão de comandar ", 1998); filmeController.cadastrar(filme1);
        Filme filme2 = new Filme("BASTARDOS INGLÓRIOS","Em Bastardos Inglórios, na Segunda Guerra Mundial, a França está ocupada pelos nazistas. O tenente Aldo Raine (Brad Pitt)", 2009); filmeController.cadastrar(filme2);
        Filme filme3 = new Filme("ATÉ O ÚLTIMO HOMEM","Em Até o Último Homem, durante a Segunda Guerra Mundial, o médico do exército Desmond T. Doss (Andrew Garfield)", 2017); filmeController.cadastrar(filme3);
        Filme filme4 = new Filme("O MENINO DO PIJAMA LISTRADO","O menino Bruno (Asa Butterfield), de 8 anos, é filho de um oficial nazista (David Tewlis) que assume ", 2008); filmeController.cadastrar(filme4);
        Filme filme5 = new Filme("A MENINA QUE ROUBAVA LIVROS","Durante a Segunda Guerra Mundial, uma jovem garota chamada Liesel Meminger (Sophie Nélisse) sobrevive ", 2014); filmeController.cadastrar(filme5);
        Filme filme6 = new Filme("CAVALO DE GUERRA","Ted Narracot (Peter Mullan) é um camponês destemido e ex-herói de guerra. Com problemas de saúde e bebedeiras, batalha  ", 2012); filmeController.cadastrar(filme6);
        Filme filme7 = new Filme("CORAÇÕES DE FERRO","Durante o final da Segunda Guerra Mundial, um grupo de cinco soldados americanos é encarregado de atacar os nazistas dentro ", 2015); filmeController.cadastrar(filme7);
        Filme filme8 = new Filme("1917","Em 1917, os cabos Schofield (George MacKay) e Blake (Dean-Charles Chapman) são jovens soldados britânicos durante a Primeira Guerra Mundial. ", 2020); filmeController.cadastrar(filme8);
        Filme filme9 = new Filme("SNIPER AMERICANO","Adaptado do livro American Sniper: The Autobiography of the Most Lethal Sniper in U.S. Militar History, Sniper Americano conta a história real", 2019); filmeController.cadastrar(filme9);
        Filme filme10 = new Filme("PEARL HARBOR","Pouco antes do bombardeio japonês em Pearl Harbor, dois amigos que são como irmãos um para o outro se envolvem de maneira", 2001); filmeController.cadastrar(filme10);


        /*Filme filme11 = new Filme("","", ); filmeController.cadastrar(filme11);
        Filme filme12 = new Filme("","", ); filmeController.cadastrar(filme12);
        Filme filme13 = new Filme("","", ); filmeController.cadastrar(filme13);
        Filme filme14 = new Filme("","", ); filmeController.cadastrar(filme14);
        Filme filme15 = new Filme("","", ); filmeController.cadastrar(filme15);
        Filme filme16 = new Filme("","", ); filmeController.cadastrar(filme16);
        Filme filme17 = new Filme("","", ); filmeController.cadastrar(filme17);
        Filme filme18 = new Filme("","", ); filmeController.cadastrar(filme18);
        Filme filme19 = new Filme("","", ); filmeController.cadastrar(filme19);
        Filme filme20 = new Filme("","", ); filmeController.cadastrar(filme20);*/


    }

}
