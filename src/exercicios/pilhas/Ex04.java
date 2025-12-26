package exercicios.pilhas;

import estruturadedados.pilhas.Pilha;

import java.util.Stack;

public class Ex04 {
    public static void main(String[] args) {

        //Repita o mesmo processo do exercício anterior, prem utilizando a classe Stack da Api Java.
        //1. Crie uma pilha com capacidade para 20 livros;
        //2. Insira quantos livros que quiser livros na pilha. Cada livro contem nome, isbn, ano de lancamento e autor.
        //3. Crie um exemplo para utilizar cada metodo da classe Pilha

        Stack<Livros> pilha = new Stack<Livros>();

        Livros livro1 = new Livros();
        livro1.setNome("Estrutura de Dados e Algoritmos");
        livro1.setAutor("Guilherme");
        livro1.setAnoLancamento(2024);
        livro1.setIsbn("ASDFGHJ1");

        Livros livro2 = new Livros();
        livro2.setNome("Entendendo Algoritmos");
        livro2.setAutor("Guilherme");
        livro2.setAnoLancamento(2023);
        livro2.setIsbn("QWERTRET2");

        Livros livro3 = new Livros();
        livro3.setNome("Tudo de Java");
        livro3.setAutor("Daniel");
        livro3.setAnoLancamento(2020);
        livro3.setIsbn("ZXZVVCB3");

        Livros livro4 = new Livros();
        livro4.setNome("SQLite");
        livro4.setAutor("Mathes");
        livro4.setAnoLancamento(2020);
        livro4.setIsbn("DJSNGSDJON4");

        System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.isEmpty());

        System.out.println("Empilhando livros na pilha:");

        pilha.push(livro1);
        pilha.push(livro2);
        pilha.push(livro3);
        pilha.push(livro4);

        System.out.println(pilha.size() + "livros foram empilhados:");
        System.out.println(pilha);

        System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.isEmpty());

        System.out.println("Espiando o topo da pilha: " + pilha.peek());

        System.out.println("Desempilhando livros da pilha:");

        while (!pilha.isEmpty()){
            System.out.println("Desempilhando livro: " + pilha.pop());
        }

        System.out.println("Todos os livros foram empilhados, pilha vazia: " + pilha.isEmpty());
    }

}
