package estruturadedados;

import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        // Inicializa o array interno com a capacidade indicada
        this.elementos = new String[capacidade];

        // Define que o vetor começa vazio
        this.tamanho = 0;
    }

   /* public void adiciona(String elemento){

    // Itera sobre todas as posições do array interno "elementos"
    for (int i = 0; i < this.elementos.length; i++) {

        // Verifica a primeira posição disponível (null) para inserir o novo elemento
        if (this.elementos[i] == null) {

            // Insere o elemento na primeira posição livre do array
            this.elementos[i] = elemento;

            // Interrompe o loop após adicionar, evitando processamento desnecessário
            break;
        }
    }
}

    public void adiciona(String elemento) throws Exception {

        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            // Aloca o elemento na próxima posição disponível do vetor

            this.tamanho++;
            // Incrementa o tamanho, já que um novo item foi inserido

        } else {
        // Caso o vetor esteja cheio, dispara uma exceção
            throw new Exception("Vetor já está cheio, não é posssível adicionar mais elementos");
        }

        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
    }
} */

    public boolean adiciona(String elemento) {

        // Verifica se ainda há capacidade no array interno
        if (this.tamanho < this.elementos.length) {

            // Insere o novo elemento na próxima posição disponível
            this.elementos[this.tamanho] = elemento;

            // Incrementa o contador de elementos para refletir o novo tamanho
            this.tamanho++;

            // Retorna sucesso da operação
            return true;
        }
        // Caso o array esteja cheio, sinaliza falha na operação
        return false;
    }

    public String busca(int posicao) {
        // Valida se a posição está dentro do range permitido (>=0 e < tamanho)
        if (!(posicao >= 0 && posicao < tamanho)) {
            // Lança exceção quando a posição é inválida
            throw new IllegalArgumentException("Posição inválida");
        }
        // Retorna o elemento localizado na posição solicitada
        return this.elementos[posicao];
    }

    public int tamanho(){
        return this.tamanho;
    }

    @Override
    public String toString() {

        //Para que serve o StringBuilder ?
        //Ele é utilizado para construção eficiente de strings mutáveis, evitando criar vários objetos String durante concatenações.
        StringBuilder s = new StringBuilder();
        //Inicializa um StringBuilder para montar a string final.
        s.append("[");

        //Adiciona o valor na string,
        //Insere a vírgula + espaço para manter o padrão da lista.
        for (int i=0; i<this.tamanho-1; i++){
            s.append (this.elementos[i]);
            s.append(", ");
        }

        //Se houver pelo menos um elemento, adiciona o último sem vírgula no final, garantindo formatação limpa.
        if (this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }

        //Fecha a estrutura da lista: ].
        s.append("]");


        return s.toString();
    }
}



