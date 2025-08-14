package jogo;
/*Etapa 1: Classe Personagem (Base)
🎯 Objetivo:
Criar a classe base com atributos comuns a todos os personagens (jogador e inimigos).
📋 O que ela precisa conter:
Atributos:
nome (String)
classe (String)
ataque (int)
defesa (int)
hp (int)
Método:
mostrarStatus() → exibe os dados do personagem.

🧠 Dica de raciocínio:
Pensa que essa classe é como um molde genérico. Tudo que é comum a
qualquer personagem vai aqui.
Você pode usar protected nos atributos se quiser que as classes
filhas acessem diretamente, ou private com
getters/setters se quiser aplicar encapsulamento.
*/
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
