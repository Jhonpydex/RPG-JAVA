package jogo;
//4
public class Inimigo extends Personagem{
    public Inimigo(String nome, String classe, int ataque, int defesa, int hp){
        this.nome = nome;
        this.classe = classe;
        this.ataque = ataque;
        this.defesa = defesa;
        this.hp = hp;
    }
    public void statusInimigo(){
        System.out.println("Nome: "+ nome);
        System.out.println("Classe: "+ classe);
        System.out.println("Ataque: "+ ataque);
        System.out.println("Defesa: "+ defesa);
        System.out.println("HP: "+ hp);
    }
}
