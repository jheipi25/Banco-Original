package BANCO;

import java.util.ArrayList;

public class Banco {
   private ArrayList<Conta> contas = new ArrayList<>();

    public void adicionar(Conta nova_conta){
        contas.add(nova_conta);

    }
    public void remover(int identificador) {
        Conta contaASerRemovida = null;
        for(Conta conta : contas) {
            if (conta.getIdentificador_conta() == identificador){
                contaASerRemovida = conta;
            }
        }
        contas.remove(contaASerRemovida);
    }

    public void alterar(int identificador, Conta contaAlterada) {
        int posicaoEscolhida = 0;
        int posicaoVetor = 0;
        Conta contaPegada = null;
        for(Conta conta : contas) {
            if (conta.getIdentificador_conta() == identificador){
                posicaoEscolhida = posicaoVetor;
                contaPegada = conta;
            }
            posicaoVetor++;
        }

        contas.set(posicaoEscolhida, contaAlterada);
    }


    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }





    @Override
    public String toString() {
        return "BB" + " " + "["  +
                " " + "contas " + contas;
    }


}
