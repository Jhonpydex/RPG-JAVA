package jogo;
import java.util.ArrayList;
import java.util.List;
/*Etapa 2: Classe Jogador (Herança + Inventário)
🎯 Objetivo:
Criar a classe que representa o jogador, herdando de Personagem.
📋 O que ela precisa conter:
Herança de Personagem
Atributos extras:
gold (int)
pocaoCura (int)
inventario (ArrayList)
Sobrescrever mostrarStatus() para incluir os novos atributos.
🧠 Dica de raciocínio:
Pensa que o jogador é um personagem com mais recursos.
Use super.mostrarStatus() e depois exiba os atributos extras.*/
//2
public class Jogador extends Personagem{
    public int gold = 0;
    public int pocaoCura = 1;
    List<String> inventario = new ArrayList<>();
@Override
    public void exibirStatus(){
    super.exibirStatus();
    System.out.println("Gold: "+ gold);
    System.out.println("Poções de Cura: "+ pocaoCura);
    System.out.println("Inventário: "+ inventario);
    }
}
