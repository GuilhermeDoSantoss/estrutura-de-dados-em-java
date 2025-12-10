package teste.vetor;

import java.util.ArrayList;

public class AulaVetor12 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();
        // Instancia uma lista dinâmica do tipo String para armazenar elementos

        arrayList.add("A");
        // Adiciona o elemento "A" ao final da lista

        arrayList.add("C");
        // Adiciona o elemento "C" ao final da lista

        System.out.println(arrayList);
        // Imprime a lista atual: [A, C]

        arrayList.add(1, "B");
        // Insere o elemento "B" na posição 1 (desloca os demais para a direita)

        System.out.println(arrayList);
        // Imprime a lista atual: [A, B, C]

        boolean existe = arrayList.contains("A");
        // Verifica se "A" está presente na lista e retorna true/false

        if (existe){
            System.out.println("Elemento existe!");
            // Caso o elemento exista, imprime mensagem de confirmação
        } else {
            System.out.println("Elemento não existe!");
            // Caso o elemento não exista, informa ausência
        }

        int pos = arrayList.indexOf("B");
        // Busca o índice do elemento "B". Se não existir, retorna -1

        if (pos > -1){
            System.out.println("Elemento existe!");
            // Se o índice for maior que -1, significa que foi encontrado
        } else {
            System.out.println("Elemento não existe!");
            // Caso contrário, o elemento não está presente
        }

        System.out.println(arrayList.get(2));
        // Recupera o elemento da posição 2 e imprime (no caso, "C")

        arrayList.remove(0);
        // Remove o elemento da posição 0 ("A")

        arrayList.remove("B");
        // Remove o elemento "B" diretamente pelo valor

        System.out.println(arrayList);
        // Imprime a lista atualizada (restará apenas ["C"])

        System.out.println(arrayList.size());
        // Imprime o tamanho atual da lista (1)

    }
}
