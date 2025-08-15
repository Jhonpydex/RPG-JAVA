package jogo;
//3
public class RPGClasses {
 public static void AplicarClasse(Jogador jogador, int classeEscolhida){
     switch(classeEscolhida){
         case 1:
             jogador.classe = "Guerreiro";
             jogador.ataque = 5;
             jogador.defesa = 4;
             jogador.hp = 6;
             break;
         case 2:
             jogador.classe = "Mago";
             jogador.ataque = 6;
             jogador.defesa = 3;
             jogador.hp = 4;
             break;
         case 3:
             jogador.classe = "Arqueiro";
             jogador.ataque = 4;
             jogador.defesa = 5;
             jogador.hp = 5;
             break;
         case 4:
             jogador.classe = "Assasino";
             jogador.ataque = 5;
             jogador.defesa = 6;
             jogador.hp = 4;
             break;
         default:
             jogador.classe = "Andarilho";
             jogador.ataque = 2;
             jogador.defesa = 1;
             jogador.hp = 3;
             break;
        }
    }
}
