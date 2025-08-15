package jogo;
//1
public class Personagem {
    public String nome;
    public String classe;
    int ataque = 0;
    int defesa = 0;
    int hp = 0;

    public void exibirStatus(){
        System.out.println("Nome: "+ nome);
        System.out.println("Classe: "+ classe);
        System.out.println("Ataque: "+ ataque);
        System.out.println("Defesa: "+ defesa);
        System.out.println("HP: "+ hp);
    }
}
