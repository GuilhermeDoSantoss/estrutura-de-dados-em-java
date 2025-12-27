package estruturadedados.filas;

import estruturadedados.EstruturaEstatica;

public class Fila extends EstruturaEstatica<T> {

    public Fila(){
        super();
    }

    public Fila(int capacidade){
        super(capacidade);
    }

    public void enfileira(T elemento){
        this.adiciona(elemento);
    }

    public T espiar(){

        if (this.estaVazia()){
            return null;
        }

        return this.elementos[0];
    }
}
