package exercicios.vetor;

import estruturadedados.vetor.Lista;

public class Ex04 {
    public static void main(String[] args) {


        //Melhore a classe Lista e implemente o metodo obtem(int posicao),
        //onde sera possivel obter o elemento dada a uma posicao do vetor.
        //Esse metodo e semelhante ao metodo get(int posicao) da classe ArrayList


        Lista<String> lista = new Lista<String>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");

        System.out.println(lista.obtem(0));
        System.out.println(lista.obtem(2));
        System.out.println(lista.obtem(4));
    }
}
