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
        Filme filme11 = new Filme("HOMEM-ARANHA NO ARANHAVERSO","Em Homem-Aranha no Aranhaverso, Miles Morales é um jovem negro do Brooklyn que se tornou o Homem-Aranha inspirado",2019); filmeController.cadastrar(filme11);
        Filme filme12 = new Filme("MEU MALVADO FAVORITO","A pirâmide de Gizé foi roubada, sendo substituída por uma imensa réplica a gás. O feito é considerado o roubo do século",2010); filmeController.cadastrar(filme12);
        Filme filme13 = new Filme("UP - ALTAS AVENTURAS","Carl Fredricksen (Edward Asner) é um vendedor de balões que, aos 78 anos, está prestes a perder a casa em que sempre viveu",2009); filmeController.cadastrar(filme13);
        Filme filme14 = new Filme("DIVERTIDA MENTE","Riley é uma garota divertida de 11 anos de idade, que deve enfrentar mudanças importantes em sua vida",2015); filmeController.cadastrar(filme14);
        Filme filme15 = new Filme("TÁ DANDO ONDA","Cadu Maverick (Shia LaBeouf) é um jovem pinguim, que tem o lendário surfista Big Z como ídolo.", 2007); filmeController.cadastrar(filme15);
        Filme filme16 = new Filme("O PODEROSO CHEFINHO 2 - NEGÓCIOS DA FAMÍLIA","O Poderoso Chefinho 2 - Negócios da Família acompanha novamente os irmãos Tim e Ted, agora adultos e vivendo", 2021); filmeController.cadastrar(filme16);
        Filme filme17 = new Filme("SPACE JAM: UM NOVO LEGADO","Em Space Jam: Um Novo Legado, a inteligência artificial, Al G (Dom Cheadle) sequestra o filho de Lebron James", 2021); filmeController.cadastrar(filme17);
        Filme filme18 = new Filme("MADAGASCAR","O leão Alex (Ben Stiller) é a grande atração do zoológico do Central Park, em Nova York.", 2005); filmeController.cadastrar(filme18);
        Filme filme19 = new Filme("RIO","Blu (Jesse Eisenberg) é uma arara azul que nasceu no Rio de Janeiro mas, capturada na floresta, foi parar na fria Minnesota",2011 ); filmeController.cadastrar(filme19);
        Filme filme20 = new Filme("O PEQUENO PRÍNCIPE","Uma garota acaba de se mudar com a mãe, uma controladora obsessiva que deseja definir antecipadamente todos",2015 ); filmeController.cadastrar(filme20);


    }

}
