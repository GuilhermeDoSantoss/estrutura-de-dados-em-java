package exercicios.pilhas;

import estruturadedados.pilhas.Pilha;

public class Ex06 {
    public static void main(String[] args) {

        //Escreva um programa para verificar se uma expressão matemática tem os parenteses agrupados de forma correta, isto é:
        //1. se o número de parenteses à esquerda e à direita são iguais e;
        //2. se todo parênse aberto é seguido posteriomente por um fechamento de parêntese
        //3. veja alguns exemplos:
        //As expressões ((A + B) ou A + B (violam a condição 1
        //As expressões )A + B(-C ou (A + B)) - (C + D violam a condição 2
        //A expressão ((A + B) + D) está ok

        imprimeResultado("A + B");
        imprimeResultado("A + B (C - D)");
        imprimeResultado("{[()]} [] () {}");
        imprimeResultado("{[(]} [] () {}");
        imprimeResultado("A + B + C - D)");
    }

    public static void imprimeResultado(String expressao){
        System.out.println(expressao + " está balanceado? " + verificaSimbolosBalanceados(expressao));
    }

    final static String ABRE = "([{";
    final static String FECHA = ")]}";
;
    public static boolean verificaSimbolosBalanceados(String expressao){

        boolean balanceado = true;
        Pilha<Character> pilha = new Pilha<>();
        int index = 0;
        char simbolo, topo;

        while (index < expressao.length() && balanceado){
            simbolo = expressao.charAt(index);

            if (ABRE.indexOf(simbolo) > -1){
                pilha.empilha(simbolo);

            } else if (FECHA.indexOf(simbolo) > -1){
                if (pilha.estaVazia()){
                    return false;
                } else {
                    topo = pilha.desempilha();

                    if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)){
                        return false;
                    }
                }
            }

            index++;
        }

        return true;
    }
}
