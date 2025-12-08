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

        this.aumentaCapacidade();

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

    // 0 1 2 3 4 5 6 = tamanho é 5
    // B C E F G + +
    public boolean adiciona(int posicao, String elemento){

        if (!(posicao >= 0 && posicao < tamanho)) {
            // Valida se a posição está dentro do range permitido.
            // Caso contrário, dispara exceção para evitar inconsistências no array.
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade();

        // Move todos os elementos uma posição à frente,
        // abrindo espaço no índice desejado para inserir o novo elemento.
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }

        // Insere o novo elemento exatamente na posição solicitada.
        this.elementos[posicao] = elemento;

        // Incrementa o tamanho lógico da lista, já que um novo item foi adicionado.
        this.tamanho++;

        // Retorno padrão indicando operação finalizada com sucesso.
        return true;
    }

    private void aumentaCapacidade() {
        // Verifica se o array está 100% ocupado (sem slots livres)
        if (this.tamanho == this.elementos.length) {

            // Cria um novo array com o dobro da capacidade atual
            String[] elementosNovos = new String[this.elementos.length * 2];

            // Copia os elementos existentes para o novo array ampliado
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }

            // Substitui o array antigo pelo novo, agora com mais capacidade
            this.elementos = elementosNovos;
        }
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

    public int busca(String elemento){
        // Itera sobre o array até o índice correspondente ao tamanho atual da lista
        for (int i = 0; i < this.tamanho; i++) {

            // Valida se o elemento atual é igual ao elemento buscado
            if (this.elementos[i].equals(elemento)) {

                // Retorna o índice onde o elemento foi encontrado
                return i;
            }
        }
        // Caso o loop finalize sem encontrar o elemento, retorna -1 como indicador de "não encontrado"
        return -1;
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



