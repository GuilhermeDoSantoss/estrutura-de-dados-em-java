package estruturadedados;

import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }
   /* public void adiciona(String elemento){
        for (int i=0; i<this.elementos.length; i++){
            if (this.elementos[i] == null){
                this.elementos[i] = elemento;
                break;
            }
        }
    }

    public void adiciona(String elemento) throws Exception {

        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vetor já está cheio, não é posssível adicionar mais elementos");
        }



        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
    }
} */

    public boolean adiciona(String elemento) {

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
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



