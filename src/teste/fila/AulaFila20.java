package teste.fila;

import estruturadedados.filas.Fila;

public class AulaFila20 {
    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<Integer>();

        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        System.out.println(fila.estaVazia());
        System.out.println(fila.tamanho());

        System.out.println(fila.toString());
    }
}
