package BANCO;

public class ContaNormal extends Conta {


    public ContaNormal(int saldo, Pessoa pessoa, int indentificador) {
        super(saldo,pessoa, indentificador);

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
            if (getSaldo() >= valor){
                setSaldo(getSaldo() - valor);
            }else {
                System.out.println("NÃO FOI POSSÍVEL SACAR");
            }
        }
    }

    @Override
    public String toString() {
        return "Tipo = " + "\t" + "[" +"ContaNormal" + "]" + "\t" + "Saldo =  " + "\t" + "[" + getSaldo() + "]" + "\t" + "Identificador = " + "\t" + "[" + getIdentificador_conta() +"]" +"\t" + "Nome = " +"\t" + "[" + getPessoa().getNome() + "]" + "\t" + "Cpf = " + "\t" + "[" + getPessoa().getCpf() + "]" + "\t" + "Email = " + "\t" + "[" + getPessoa().getEmail() + "]";


    }


}
