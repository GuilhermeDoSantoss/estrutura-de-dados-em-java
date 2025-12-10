package exercicios.vetor;

import estruturadedados.vetor.Lista;

import java.util.ArrayList;

public class Ex05 {
    public static void main(String[] args) {

        //Melhore a classe Lista e implemente o metodo limpar,
        //onde todos os elementos da lista sao removidos.
        //Esse metodo e semelhante ao metodo clear da classe ArrayList

        ArrayList<String> arrayList = new ArrayList<String>(5);

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");

        System.out.println(arrayList);

        arrayList.clear();

        System.out.println(arrayList);


        Lista<String> lista = new Lista<String>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");

        System.out.println(lista);

        lista.limpar();

        System.out.println(lista);
    }
}
