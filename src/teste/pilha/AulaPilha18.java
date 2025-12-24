package teste.pilha;

import estruturadedados.pilhas.Pilha;

import java.util.Stack;

public class AulaPilha18 {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>();

        Stack<Integer> stack = new Stack<Integer>();

        System.out.println(stack.isEmpty());

        stack.push(1); // push = empilhar
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.isEmpty()); // isempty = esta vazia

        System.out.println(stack.size()); // size = tamanho

        System.out.println(stack);

        System.out.println(stack.peek()); // peek = espiar

        System.out.println(stack.pop()); // pop = desempilha

        System.out.println(stack);


    }
}
