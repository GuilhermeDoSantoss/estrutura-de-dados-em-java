package estruturadedados;

import java.lang.reflect.Array;

public class Lista<T> {

    private T[] elementos;
    // Array interno que armazena os elementos da lista

    private int tamanho;

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        // Inicializa o array com a capacidade informada

        this.tamanho = 0;
        // Define que a lista começa vazia
    }

    public boolean adiciona(T elemento) {

        this.aumentaCapacidade();
        // Garante que existe espaço antes de inserir

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            // Insere elemento na próxima posição disponível

            this.tamanho++;
            // Atualiza o tamanho após a inserção

            return true;
            // Retorna sucesso da operação
        }

        return false;
        // Retorno padrão caso não haja espaço
    }

    // 0 1 2 3 4 5 6 = tamanho é 5
    // B C E F G + +
    public boolean adiciona(int posicao, T elemento){

        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
            // Garante integridade evitando posições inválidas
        }

        this.aumentaCapacidade();
        // Expande capacidade antes da movimentação

        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
            // Desloca todos os elementos para abrir espaço no índice alvo
        }

        this.elementos[posicao] = elemento;
        // Insere o elemento no índice solicitado

        this.tamanho++;
        // Incrementa o tamanho após a inserção

        return true;
        // Operação concluída com sucesso
    }

    private void aumentaCapacidade() {

        if (this.tamanho == this.elementos.length) {
            // Aciona expansão somente quando o array está cheio

            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            // Cria um novo array com capacidade dobrada

            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
                // Copia todos os elementos para o novo array
            }

            this.elementos = elementosNovos;
            // Substitui o array antigo pelo novo e ampliado
        }
    }

    public Object busca(int posicao) {

        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
            // Validação de segurança evitando acessos ilegais
        }

        return this.elementos[posicao];
        // Retorna o elemento exatamente na posição requisitada
    }

    public int busca(T elemento){

        for (int i = 0; i < this.tamanho; i++) {
            // Varre a lista apenas até o tamanho real

            if (this.elementos[i].equals(elemento)) {
                return i;
                // Retorna o índice onde o elemento foi encontrado
            }
        }

        return -1;
        // Retorna -1 indicando que não foi encontrado
    }

    public void remove(int posicao){

        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
            // Evita remoção em índices inexistentes
        }

        for (int i = posicao; i < this.tamanho - 1; i++){
            this.elementos[i] = this.elementos[i + 1];
            // Desloca os elementos da direita para preencher o "buraco"
        }

        this.tamanho--;
        // Ajusta o tamanho da lista após a remoção
    }

    public int tamanho(){
        return this.tamanho;
        // Expõe o tamanho atual da lista
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        // Usa StringBuilder para concatenar textos de forma performática

        s.append("[");
        // Abre a estrutura visual de lista

        for (int i = 0; i < this.tamanho - 1; i++){
            s.append(this.elementos[i]);
            // Adiciona o elemento atual

            s.append(", ");
            // Adiciona a vírgula com espaço para separação padrão
        }

        if (this.tamanho > 0){
            s.append(this.elementos[this.tamanho - 1]);
            // Adiciona o último elemento sem vírgula ao final
        }

        s.append("]");
        // Fecha o formato de lista

        return s.toString();
        // Retorna a string final construída
    }
}



