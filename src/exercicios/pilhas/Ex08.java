package exercicios.pilhas;

import java.util.Stack;

public class Ex08 {
    public static void main(String[] args) {

        //Usando a classe Pilha ou Stack,
        //desenvolva um algoritmo que resolva o quebra cabeça Torre de Hanoi

        Stack<Integer> original = new Stack<>();
        Stack<Integer> dest = new Stack<>();
        Stack<Integer> aux = new Stack<>();

        original.push(3);
        original.push(2);
        original.push(1);

        torreDeHanoi(original.size(), original, dest, aux);

    }

    public static void torreDeHanoi(int n, Stack<Integer> original,
                                    Stack<Integer> dest, Stack<Integer> aux){

        if (n > 0){
            torreDeHanoi(-1, original, aux, dest);
            dest.push(original.pop());
            System.out.println("-------");
            System.out.println("Original: " + original);
            System.out.println("Destino: " + dest);
            System.out.println("Aux: " + aux);
            torreDeHanoi(n-1, aux, dest, original);

        }
    }


}
