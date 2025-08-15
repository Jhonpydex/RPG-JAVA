package jogo;
import java.util.ArrayList;
import java.util.List;
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
