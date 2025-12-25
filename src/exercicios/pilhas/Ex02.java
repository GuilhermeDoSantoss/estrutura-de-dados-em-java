package exercicios.pilhas;

import estruturadedados.pilhas.Pilha;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        //Escreva um programa que leia 10 numeros. Para cada numero lido,
        //verifique e codifique de acordo com as regras a seguir:
        //1. se o numero for par, empilhe na pilha chamada par;
        //2. se o numero for impar, empilhe na pilha chamada impar;
        //3. se o numero for 0, desempilhe um elemento de cada pilha.
        //Caso alguma pilha esteja vazia, mostre uma mensagem de erro na tela.
        //Ao final do programa desempilhe todos os elementos das duas puilhas, imprimindo na tela

        Pilha<Integer> par = new Pilha<Integer>();
        Pilha<Integer> impar = new Pilha<Integer>();

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i <= 10; i++) {

            System.out.println("Entre com um número: ");

            int num = scan.nextInt();

            if (num == 0){

                // pilha par

                Integer desempilhado = par.desempilha();

                if (desempilhado == null){
                    System.out.println("Pilha par vazia");
                } else {
                    System.out.println("Desempilhando da pilhar par: " + desempilhado);
                }

                //pilha ímpar

                desempilhado = impar.desempilha();

                if (desempilhado == null){
                    System.out.println("Pilha ímpar vazia");
                } else {
                    System.out.println("Desempilhando da pilhar ímpar: " + desempilhado);
                }
            }

            else if (num % 2 == 0){

                System.out.println("Número par, empilhando na pilha par: " + num);
                par.empilha(num);
            } else {
                System.out.println("Número ímpar, empilhando na pilha ímpar: " + num);
                impar.empilha(num);
            }
        }

        System.out.println("Desempilhando todos os numeros da pilha par");

        while (!par.estaVazia()){
            System.out.println("Desempilhando da pilha par: " + par.desempilha());
        }

        System.out.println("Desempilhando todos os numeros da pilha ímpar");

        while (!impar.estaVazia()){
            System.out.println("Desempilhando da pilha ímpar: " + par.desempilha());
        }
    }
}
