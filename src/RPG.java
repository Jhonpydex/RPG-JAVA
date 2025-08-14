import jogo.EventoAleatorio;
import jogo.Jogador;
import jogo.RPGClasses;
import java.util.Scanner;
/*Objetivo do main agora:
Anunciar o nome do jogo.
Mostrar as classes disponíveis (de forma dinâmica, sem repetir código).
Permitir que o jogador escolha uma classe.
Criar o personagem com base na escolha.
Preparar o terreno pro loop principal (que virá depois).*/
public class RPG{
    public static void main(String[] args){
        Jogador jogador = new Jogador();
        Scanner sc = new Scanner(System.in);
        System.out.println("Seja Bem Vindo ao Catári");
        System.out.println("Qual o seu nome Jovem Guerreiro: ");
        jogador.nome = sc.nextLine();
        System.out.println("Seja Bem Vindo "+ jogador.nome);
        System.out.println("Agora Escolha a sua classe:\n1- Guerreiro\n2- Mago\n3- Arqueiro\n4-Assasino\n" +
                "Aviso: E caso não escolha nada você se tornará um andarilho, e a difulcudade irá aumentar Drásticamente!");
        int classeEscolhida = sc.nextInt();
        RPGClasses.AplicarClasse(jogador, classeEscolhida);
        jogador.exibirStatus();
        boolean jogando = true;
        while(jogando){
            System.out.println("Escolha uma das opções: \n1- Ver Status\n2- Explorar\n 3- Sair");
            int opcoes = sc.nextInt();
            switch (opcoes){
                case 1:
                    jogador.exibirStatus();
                    break;
                case 2:
                    System.out.println("Explorando a Area: ");
                    EventoAleatorio.Evento(jogador);
                    break;
                case 3:
                    System.out.println("Encerrando sessão!");
                    jogando = false;
                    break;
                default:
                    System.out.println("Numero inválido, digite uma das opções!");
            }
        }
    }
}
