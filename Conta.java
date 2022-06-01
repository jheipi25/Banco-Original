package BANCO;

import java.util.Objects;

public abstract class Conta {
     private int saldo;
     private int identificador_conta;
     private Pessoa pessoa;

    public Conta(int saldo, Pessoa pessoa, int identificador_conta) {
        this.saldo = saldo;
        this.identificador_conta = identificador_conta;
        this.pessoa = pessoa;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getIdentificador_conta() {
        return identificador_conta;
    }

    public void setIdentificador_conta(int identificador_conta) {
        this.identificador_conta = identificador_conta;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    abstract public void depositar(int valor, int identificador);

    abstract public void sacar(int valor,int identificador);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return identificador_conta == conta.identificador_conta;
    }

}

