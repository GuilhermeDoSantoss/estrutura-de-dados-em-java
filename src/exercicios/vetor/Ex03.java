package exercicios.vetor;

import estruturadedados.vetor.Lista;

public class Ex03 {
    public static void main(String[] args) {

        //Melhore a classe Lista e implemente o metodo remove(T elemento),
        //onde sera possivel remover um elemento da lista passando o mesmo como parametro

        Lista<String> lista = new Lista<String>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");

        System.out.println(lista);

        lista.remove("A");

        System.out.println(lista);

        lista.remove("E");

        System.out.println(lista);

        lista.remove("C");

        System.out.println(lista);
    }
}
