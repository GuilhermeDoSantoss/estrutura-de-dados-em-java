package exercicios.pilhas;

import estruturadedados.pilhas.Pilha;


public class Ex05 {
    public static void main(String[] args) {

        //Escreva um programa que testa se uma sequencia de caracteres fornecida pelo usuario é um palíndromo,
        //ou seja, é uma palavra cuja primeira metade é simetrica à segunda metade. Veja alguns exemplos:
        //1. AABCCBAA - sim
        //2. ADDFDDA - sim
        //3. ABFFBB - não

        imprimeResultado("ADA");

        imprimeResultado("ABCD");

        imprimeResultado("AABCCBA");

        imprimeResultado("MARIA");
    }

    public static void imprimeResultado(String palavra){
        System.out.println(palavra + " é um palindromo? " + testaPalindromo(palavra));

    }

    public static boolean testaPalindromo(String palavra){

        Pilha<Character> pilha = new Pilha<>();

        for (int i = 0; i < palavra.length(); i++){
            pilha.empilha(palavra.charAt(i));
        }

        String palavraInversa = " ";
        while (!pilha.estaVazia()){
            palavraInversa += pilha.desempilha();
        }

        if (palavraInversa.equalsIgnoreCase(palavra)){
            return true;
        }

        return false;
    }
}
