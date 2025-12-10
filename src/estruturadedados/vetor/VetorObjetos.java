package estruturadedados.vetor;

public class VetorObjetos {

    private Object[] elementos;
    private int tamanho;

    public VetorObjetos(int capacidade) {
        // Inicializa o array interno com a capacidade indicada
        this.elementos = new Object[capacidade];

        // Define que o vetor começa vazio
        this.tamanho = 0;
    }

    public boolean adiciona(Object elemento) {

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
    public boolean adiciona(int posicao, Object elemento){

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
            Object[] elementosNovos = new String[this.elementos.length * 2];

            // Copia os elementos existentes para o novo array ampliado
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }

            // Substitui o array antigo pelo novo, agora com mais capacidade
            this.elementos = elementosNovos;
        }
    }

    public Object busca(int posicao) {
        // Valida se a posição está dentro do range permitido (>=0 e < tamanho)
        if (!(posicao >= 0 && posicao < tamanho)) {
            // Lança exceção quando a posição é inválida
            throw new IllegalArgumentException("Posição inválida");
        }
        // Retorna o elemento localizado na posição solicitada
        return this.elementos[posicao];
    }

    public int busca(Object elemento){
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

    // B D E F F -> posição a ser removida é 1 (G)
    // 0 1 2 3 4 -> tamanho do vetor é 5
    // vetor[1] = vetor[2]
    // vetor[2] = vetor[3]
    // vetor[3] = vetor[4]
    public void remove(int posicao){
        // Valida se a posição está dentro do range permitido (>=0 e < tamanho)
        if (!(posicao >= 0 && posicao < tamanho)) {
            // Lança exceção quando a posição é inválida
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < this.tamanho-1; i++){
            this.elementos[i] = this.elementos[i+1];
            // Realoca os elementos à direita, deslocando tudo uma posição para a esquerda
            // Isso elimina o "buraco" deixado pelo elemento removido
        }
        this.tamanho--;
        // Decrementa o tamanho lógico do array, ajustando o índice final válido
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



