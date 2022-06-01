package BANCO;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        Banco banco = new Banco();

        int repetidor = 1;
        Scanner teclado = new Scanner(System.in);
        while(repetidor == 1){

            System.out.println("BEM VINDO AO BANCO DO NORDESTE");

            System.out.println("QUAL A OPÇÃO VOCÊ DESEJA? ");
            System.out.println("1 - LISTAR TODAS AS CONTAS DO BANCO");
            System.out.println("2 - CRIAR UMA CONTA_NORMAL NO BANCO");
            System.out.println("3 - CRIAR UMA CONTA_ESPECIAL NO BANCO");
            System.out.println("4 - ALTERAR UMA CONTA");
            System.out.println("5 - DEPOSITAR EM UMA CONTA");
            System.out.println("6 - SACAR EM UMA CONTA");
            System.out.println("7 - REMOVER UMA CONTA");
            int iniciarMenu = Integer.parseInt(teclado.nextLine());
            switch (iniciarMenu){
                case 1:
                    System.out.println(banco);

                    break;

                case 2:

                        System.out.println("DIGITE O IDENTIFICADOR:  ");
                        String identificadorCriarNormal = teclado.nextLine();
                        System.out.println("DIGITE O SALDO:  ");
                        String saldoCriarNormal = teclado.nextLine();
                        System.out.println("DIGITE O NOME:  ");
                        String nomeCriarNormal = teclado.nextLine();
                        System.out.println("DIGITE O CPF:   ");
                        String CPFCriarNormal = teclado.nextLine();
                        System.out.println("DIGITE EMAIL: ");
                        String emailCriarNormal = teclado.nextLine();
                        ContaNormal conta_normal_nova = new ContaNormal(Integer.parseInt(saldoCriarNormal)
                                , new Pessoa(nomeCriarNormal,CPFCriarNormal,emailCriarNormal), Integer.parseInt(identificadorCriarNormal));
                        banco.adicionar(conta_normal_nova);
                    break;


                case 3:
                    System.out.println("DIGITE O IDENTIFICADOR:  ");
                    String identificadorCriarEspecial = teclado.nextLine();
                    System.out.println("DIGITE O SALDO:  ");
                    String saldoCriarEspecial = teclado.nextLine();
                    System.out.println("DIGITE O NOME:  ");
                    String nomeCriarEspecial = teclado.nextLine();
                    System.out.println("DIGITE O CPF:   ");
                    String cpfCriarEspecial = teclado.nextLine();
                    System.out.println("DIGITE EMAIL: ");
                    String emailCriarEspecial = teclado.nextLine();
                    ContaEspecial conta_especial_nova = new ContaEspecial(Integer.parseInt(saldoCriarEspecial),
                            new Pessoa(nomeCriarEspecial,cpfCriarEspecial,emailCriarEspecial), Integer.parseInt(identificadorCriarEspecial));
                    banco.adicionar(conta_especial_nova);
                    break;



                case 4:
                    System.out.println("PARA ALTERAR CONTA NORMAL DIGITE [1]" + "PARA ALTERAR CONTA ESPECIAL DIGITE [2]");
                    System.out.println("DIGITE O IDENTIFICADOR:  ");
                    String identificadorAlterarNormal = teclado.nextLine();
                    System.out.println("DIGITE O SALDO:  ");
                    String saldoAlterarNormal = teclado.nextLine();
                    System.out.println("DIGITE O NOME:  ");
                    String nomeAlterarNormal = teclado.nextLine();
                    System.out.println("DIGITE O CPF:   ");
                    String cpfAlterarNormal = teclado.nextLine();
                    System.out.println("DIGITE EMAIL: ");
                    String emailAlterarNormal = teclado.nextLine();
                    int Selecionador = Integer.parseInt(teclado.nextLine());
                    Conta contaAlterar = null;
                    if (Selecionador == 1){
                        contaAlterar = new ContaNormal(Integer.parseInt(saldoAlterarNormal),
                                new Pessoa(nomeAlterarNormal,cpfAlterarNormal,emailAlterarNormal), Integer.parseInt(identificadorAlterarNormal));
                    }else if (Selecionador == 2){
                        contaAlterar = new ContaEspecial(Integer.parseInt(saldoAlterarNormal),
                                new Pessoa(nomeAlterarNormal,cpfAlterarNormal,emailAlterarNormal), Integer.parseInt(identificadorAlterarNormal));
                    }
                    banco.alterar(Integer.parseInt(identificadorAlterarNormal),contaAlterar);
                    break;



                case 5:
                    System.out.println("DESEJA DEPOSITA QUANTO? : ");
                    int valorDepositar = Integer.parseInt(teclado.nextLine());
                    System.out.println("QUAL É O IDENTIFICADOR  : ");
                    int identificadorDeposito = Integer.parseInt(teclado.nextLine());

                    Conta contaPegada = null;
                    int posicaoescolhida = 0;
                    int posicaoVetor = 0;
                    for(Conta conta : banco.getContas()) {
                        if (conta.getIdentificador_conta() == identificadorDeposito){
                            contaPegada = conta;
                            posicaoescolhida = posicaoVetor;

                        }
                        posicaoVetor++;
                    }


                    contaPegada.depositar(valorDepositar ,identificadorDeposito);
                    banco.getContas().set(posicaoescolhida,contaPegada);
                    break;
                case 6:
                    System.out.println("DESEJA SACAR QUANTO? : ");
                    int valorSacar = Integer.parseInt(teclado.nextLine());
                    System.out.println("QUAL O NUMERO DO IDENTIFICADOR: ");
                    int identificadorSacar = Integer.parseInt(teclado.nextLine());
                    int posicaoVetorSacar = 0;
                    int posicaoEscolhida = 0;
                    Conta contaEscolhida = null;
                    for (Conta conta: banco.getContas()){
                        if (conta.getIdentificador_conta() == valorSacar){
                            posicaoEscolhida = posicaoVetorSacar;
                            contaEscolhida = conta;
                        }
                        posicaoVetorSacar++;
                    }
                    contaEscolhida.sacar(valorSacar,identificadorSacar);
                    banco.alterar(posicaoEscolhida,contaEscolhida);
                    break;
                case 7:
                    System.out.println("DESEJA REMOVER QUAL CONTA? :  ");
                    int IdentificadorRemover = Integer.parseInt(teclado.nextLine());
                    banco.remover(IdentificadorRemover);

                    }

            System.out.println("DESEJA REALIZAR MAIS UMA OPERAÇÃO?" + "[1] :  sim" + " Qualquer valor :  não");
            int condicaoParada = Integer.parseInt(teclado.nextLine());
            if(condicaoParada != 1){
                break;
            }

        }



    }
}

