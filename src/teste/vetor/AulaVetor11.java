package teste.vetor;

import estruturadedados.Lista;
import estruturadedados.VetorObjetos;

public class AulaVetor11{
    public static void main(String[] args) {

        Lista<Contato> vetor = new Lista<Contato>(1);

        Contato c1 = new Contato("Contato 1", "12345-6789", "contato1@email.com");

        vetor.adiciona(c1);
    }
}
