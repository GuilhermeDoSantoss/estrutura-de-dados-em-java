package exercicios.pilhas;

import estruturadedados.pilhas.Pilha;

import java.util.Scanner;

public class Ex01 {

    //Escreva um programa que leia 10 numeros. Para cada numero lido,
    //verifique e codifique de acordo com as regras a seguir:
    //1. se o numero for par, empilhe na pilha;
    //2. se o numero for impar, desimpilhe um numero da pilha. Casp a pilha esteja vazia, mostre uma mensagem
    //3. se ao final do programa a pilha nao estiver vazia, desempilhe todos os elementos, imprimindo na tela

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>();

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 10; i++){
            System.out.println("Entre com um número ");

            int num = scan.nextInt();

            if (num % 2 == 0){
                System.out.println("Empilhando o número " + num);
                pilha.empilha(num);
            } else {

                Integer desempilhado = pilha.desempilha();

                if (desempilhado == null){
                    System.out.println("Pilha está vazia");
                } else {
                    System.out.println("Número ímpar, desempilhando um elemento da pilha: " + desempilhado);
                }
            }
        }

        System.out.println("Todos os números foram lidos, desempilhando números da pilha");

        while (!pilha.estaVazia()){

                System.out.println("Desempilhando um elemento da pilha: " + pilha.desempilha());
        }

        System.out.println("Todos os elementos foram desempilhados");
    }
}
