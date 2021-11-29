package avaliacao.exercicio3;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int divertido = 0;
        int chateado = 0;

        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();

        for( int i = 0; i < frase.length(); i++) {
           if(frase.charAt(i) == ':') {
               String chave = frase.substring(i, i + 3);
               if(chave.equals(":-)")) {
                   divertido++;
               }else if(chave.equals(":-(")) {
                   chateado++;
               }
           }
        }
        if(divertido > chateado) {
            System.out.println("Divertido");
        }else if(divertido < chateado) {
            System.out.println("Chateado");
        }else {
            System.out.println("Neutro");
        }

        sc.close();
    }
}
