package BANCO;

public class ContaEspecial extends Conta {

    private int limite_especial;
    public ContaEspecial(int saldo, Pessoa pessoa, int indentificador) {
        super(saldo,pessoa, indentificador);
        limite_especial = 3000;


    }

    @Override
    public void depositar(int valor, int identificador) {
        if (getIdentificador_conta() == identificador){
            setSaldo(valor + getSaldo());
        }
    }

    @Override
    public void sacar(int valor, int identificador) {
        if (getIdentificador_conta() == identificador){
            if (valor > limite_especial + getSaldo()){
                System.out.println("NÃO É POSSIVEL SACAR");

            }else{
                setSaldo(getSaldo() - valor);
            }

        }
    }

    public int getLimite_especial() {
        return limite_especial;

    }



    @Override
    public String toString() {
        return  "Tipo = " +  "[" + "ContaEspecial" + "]" + "\t" + "LimiteEspecial = " + "[" + limite_especial + "]" + "\t" + "Saldo = " + "[" + getSaldo() + "]" + "\t" + "Identificador = " + "\t" + "[" + getIdentificador_conta() +"]" +"\t" + "Nome = " + "\t" + "[" + getPessoa().getNome() + "]" + "\t" + "Cpf = " + "\t" + "[" + getPessoa().getCpf() + "]" + "\t" + "Email = " + "\t" + "[" + getPessoa().getEmail() + "]";

    }
}
