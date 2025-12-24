package teste.pilha;

import estruturadedados.pilhas.Pilha;

public class AulaPilha15 {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>();

        System.out.println(pilha.estaVazia());

        pilha.empilha(1);

        System.out.println(pilha.estaVazia());
    }
}
