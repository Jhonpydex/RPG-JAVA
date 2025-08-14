package jogo;
//5
import jogo.inimigos_Bronze.Esqueleto;
import jogo.inimigos_Bronze.Goblin;
import jogo.inimigos_Bronze.Slime;

import java.util.Random;

public class EventoAleatorio {
    public static void Evento(Jogador jogador){
        Random rool = new Random();
     int evento = rool.nextInt(3);
        int goldAleatorio = rool.nextInt(41)+ 10;
        switch (evento) {
            case 0:
                System.out.println("Você encontrou uma poção de cura");
                jogador.pocaoCura ++;
                break;
            case 1:
                System.out.printf("Você encontrou %d de gold",goldAleatorio);
                jogador.gold += goldAleatorio;
                break;
            case 2:
                System.out.println("Você não encotrou nada!");
                break;
        }
         int evento2 = rool.nextInt(3);
        Inimigo inimigoSorteado = null;
        switch(evento2) {
            case 0: inimigoSorteado = new Slime();
            break;
            case 1: inimigoSorteado = new Goblin();
            break;
            case 2: inimigoSorteado = new Esqueleto();
            break;
        }
        System.out.println("Você encontrou um inimigo: ");
        inimigoSorteado.statusInimigo();
    }
}
