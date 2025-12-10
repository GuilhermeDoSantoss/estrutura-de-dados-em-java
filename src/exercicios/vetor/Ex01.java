package exercicios.vetor;

import estruturadedados.vetor.Lista;

public class Ex01 {
    public static void main(String[] args) {

        //Melhore a classe Lista e implemente o metodo contem,
        //semelhante ao metodo contais da classe ArrayList.

        Lista<String> lista = new Lista<String>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("D");

        System.out.println(lista.contem("A"));
        System.out.println(lista.contem("B"));
        System.out.println(lista.contem("D"));
    }
}