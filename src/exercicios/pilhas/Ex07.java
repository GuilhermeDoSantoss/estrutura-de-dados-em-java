package exercicios.pilhas;

import java.util.Stack;

public class Ex07 {
    public static void main(String[] args) {

        //Usando a classe Pilha ou Stack,
        //desenvolva um agoritmo que  faça a conversão de numeros decimais para binário

        imprimeResultado(2);
        imprimeResultado(4);
        imprimeResultado(10);
        imprimeResultado(25);
        imprimeResultado(10035);

    }

    public static void imprimeResultado(int numero){
        System.out.println(numero + " em binário é: " + decimalBinario(numero));
    }

    public static String decimalBinario(int numero){

        Stack<Integer> pilha = new Stack<>();
        String numeroBinario = "";
        int resto;

        while (numero > 0){
            resto = numero % 2;
            pilha.push(resto);
            numero /= 2;
        }

        while (!pilha.isEmpty()){
            numeroBinario += pilha.pop();
        }

        return numeroBinario;
    }
}
