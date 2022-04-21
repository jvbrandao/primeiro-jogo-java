import java.util.Scanner;
import java.util.Random;

public class Jogo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random aleatorio = new Random();

        int numeroAleatorio;
        int numeroJogador;
        int opcaoJogo;

        System.out.println("Digite seu nome: ");

        Nome nomeJogador = new Nome(scan.nextLine());

        System.out.printf("Ok %s o jogo consiste em:", nomeJogador.getNome());
        System.out.println("\nEu vou escolher um número entre 0 e 10 e você precisa acertar o número que eu vou escolher.");
        System.out.println("Você deseja Jogar?");
        System.out.println("1 -> Sim 2-> Não");
        opcaoJogo = scan.nextInt();

        if(opcaoJogo == 1) {
            numeroAleatorio = aleatorio.nextInt(10);
            System.out.println("Eu já escolhi meu número qual vai ser o seu?");
            numeroJogador = scan.nextInt();
            while (numeroJogador != numeroAleatorio) {
                System.out.println("Você errou!");
                System.out.println("Qual seu proximo número?");
                numeroJogador = scan.nextInt();

            }
            System.out.printf("Parabéns %s você acertou", nomeJogador.getNome());
        }else{
            System.out.printf("Que pena %s, espero que um dia possamos Jogar", nomeJogador.getNome());
        }

    }
}

