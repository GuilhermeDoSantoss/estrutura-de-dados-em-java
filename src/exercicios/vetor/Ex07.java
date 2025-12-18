package exercicios.vetor;


import teste.vetor.Contato;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex07 extends Ex06 {

    public static void main(String[] args) {

        //Utilize a classe ArrayList e desenvolva os seguintes itens:
        //1. Crie uma ArrayList utilizando a classe ArrayList da API do java;
        //2. Passe todos os contatos do vetor para o ArrayList;
        //3. Crie um exemplo para utilizar cada metodo da classe ArrayList
        //(somente os metodos que implementamos de forma similar na classe ArrayList)

        //Utilize a classe ArrayList ou Vetor e classe Contato (criada durante as aulas) e desenvolva os seguintes itens:

        //1. crie um vetor com capacidade para 20 contatos
        //2. insira 30 contatos no vetor (isso e possivel ser feito atraves de um loop)
        //crie um exemplo para utilizar cada metodo da classe ArrayList

        //criação das variáveis
        Scanner scan = new Scanner(System.in);

        // criar vetor com 20 de capacidade
        ArrayList<Contato> ArrayList = new ArrayList<Contato>(20);

        //criar e adicionar x contatos
        criarContatosDinamicamente(30, ArrayList);

        //criar um menu pro usurario escolha uma opcao
        int opcao = 1;

        while (opcao !=0){

            opcao = obterOpacaoMenu(scan);

            switch (opcao){
                case 1:
                    adicionarContatoFinal(scan, ArrayList);
                    break;
                case 2:
                    adicionarContatoPosicao(scan, ArrayList);
                    break;
                case 3:
                    obtemContatoPosicao(scan, ArrayList);
                    break;
                case 4:
                    obtemContato(scan, ArrayList);
                    break;
                case 5:
                    pesquisarUltimoIndice(scan, ArrayList);
                    break;
                case 6:
                    pesquisarContatoExiste(scan, ArrayList);
                    break;
                case 7:
                    excluirPorPosicao(scan, ArrayList);
                    break;
                case 8:
                    excluirContato(scan, ArrayList);
                    break;
                case 9:
                    imprimeTamanhoVetor(ArrayList);
                    break;
                case 10:
                    limparVetor(ArrayList);
                    break;
                case 11:
                    imprimirVetor(ArrayList);
                    break;
                default:
                    break;
            }
        }
        System.out.println("Usuário digitou 0, programa terminado!");
    }

    private static void imprimirVetor(ArrayList<Contato> ArrayList){

        System.out.println(ArrayList);
    }

    private static void limparVetor(ArrayList<Contato> ArrayList){

        ArrayList.clear();

        System.out.println("Todos os contatos do vetor foram excluídos");
    }

    private static void imprimeTamanhoVetor(ArrayList<Contato> ArrayList){

        System.out.println("Tamanho do vetor é de: " + ArrayList.size());
    }

    private static void excluirContato(Scanner scan, ArrayList<Contato> lista){

        int pos = leInformacaoInt("Entre com a posição a ser removida ", scan);

        try{

            Contato contato = lista.get(pos);

            lista.remove(contato);

            System.out.println("Contato excluído");

        } catch (Exception e){
            System.out.println("Posição inválida!");
        }
    }

    private static void excluirPorPosicao(Scanner scan, ArrayList<Contato> ArrayList){

        int pos = leInformacaoInt("Entre com a posição a ser removida ", scan);

        try{

            ArrayList.remove(pos);

            System.out.println("Contato excluído");

        } catch (Exception e){
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarContatoExiste(Scanner scan, ArrayList<Contato> lista){

        int pos = leInformacaoInt("Entre com a posição a ser pesquisada ", scan);

        try{

            Contato contato = lista.get(pos);

            boolean existe = lista.contains(contato);

            if(existe){
                System.out.println("Contato existe, seguem dados: ");
                System.out.println(contato);
            } else {
                System.out.println("Contato não existe");
            }

        } catch (Exception e){
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarUltimoIndice(Scanner scan, ArrayList<Contato> lista){

        int pos = leInformacaoInt("Entre com a posição a ser pesquisada ", scan);

        try{

            Contato contato = lista.get(pos);

            System.out.println("Contato existe, seguem dados: ");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do último índice do contato encontrado:");
            pos = lista.indexOf(contato);

            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e){
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContato(Scanner scan, ArrayList<Contato> lista){

        int pos = leInformacaoInt("Entre com a posição a ser pesquisada ", scan);

        try{

            Contato contato = lista.get(pos);

            System.out.println("Contato existe, seguem dados: ");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do contato encontrado:");
            pos = lista.get(contato);

            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e){
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContatoPosicao(Scanner scan, ArrayList<Contato> lista){

        int pos = leInformacaoInt("Entre com a posição a ser pesquisada ", scan);

        try{

            Contato contato = lista.get(pos);

            System.out.println("Contato existe, seguem dados: ");
            System.out.println(contato);

        } catch (Exception e){
            System.out.println("Posição inválida!");
        }
    }

    private static void adicionarContatoFinal(Scanner scan, ArrayList<Contato> lista){

        System.out.println("Criando um contato, entre com as informações");
        String nome = leInformacao("Entre com o nome", scan);
        String telefone = leInformacao("Entre com o telefone", scan);
        String email = leInformacao("Entre com o email", scan);

        Contato contato = new Contato(nome, telefone, email);

        lista.add(contato);

        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }

    private static void adicionarContatoPosicao(Scanner scan, ArrayList<Contato> lista){

        System.out.println("Criando um contato, entre com as informações");
        String nome = leInformacao("Entre com o nome", scan);
        String telefone = leInformacao("Entre com o telefone", scan);
        String email = leInformacao("Entre com o email", scan);

        Contato contato = new Contato(nome, telefone, email);

        int pos = leInformacaoInt("Entre com a posição a adicionar o contato!" , scan);

        try {

            lista.add(pos, contato);

            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);

        } catch (Exception e){
            System.out.println("Posição inválida, contato não adicionado");
        }
    }

    private static void criarContatosDinamicamente (int quantidade, ArrayList<Contato> lista){

        Contato contato;

        for (int i = 1; i <= quantidade; i++) {

            contato = new Contato();
            contato.setNome("Contato " + i);
            contato.setTelefone("12346789 " + i);
            contato.setEmail("contato" + i + "@email.com");

            lista.add(contato);
        }
    }
}


