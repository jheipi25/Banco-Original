package BANCO;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class MANIPULAÇÃO {
    public static void main(String[]args){

        Banco banco = new Banco();


        int resposta = 1;

        while (resposta == 1){
            Scanner teclado = new Scanner(System.in);
            System.out.println("BEM- VINDO AO BANCO DO NORDESTE!");
            System.out.println("QUAL A OPÇÃO VOCÊ DESEJA? ");
            System.out.println("1 - LISTAR TODAS AS CONTAS DO BANCO");
            System.out.println("2 - CRIAR UMA CONTA NO BANCO");
            System.out.println("3 - ALTERAR DADOS DE UMA CONTA ");
            System.out.println("4 - REMOVER UMA CONTA NO BANCO");
            System.out.println("5 GERAR RELATORIO");
            System.out.println("6 SACAR");
            int input = Integer.parseInt(teclado.nextLine());
            switch (input){
                case 1:
                    System.out.println(banco);
                    break;

                case 2:
                    System.out.println("VOCE DESEJA CRIAR QUAL CONTA:  " + "[1] CONTA NORMAL" + "[2] CONTA ESPECIAL");
                    int tipo_de_conta = Integer.parseInt(teclado.nextLine());
                    if(tipo_de_conta == 1){
                        System.out.println("DIGITE O IDENTIFICADOR:  ");
                        String identificador = teclado.nextLine();
                        System.out.println("DIGITE O SALDO:  ");
                        String saldo = teclado.nextLine();
                        System.out.println("DIGITE O NOME:  ");
                        String nome = teclado.nextLine();
                        System.out.println("DIGITE O CPF:   ");
                        String CPF = teclado.nextLine();
                        System.out.println("DIGITE EMAIL: ");
                        String email = teclado.nextLine();
                        ContaNormal conta_normal_nova = new ContaNormal(Integer.parseInt(saldo), new Pessoa(nome,CPF,email), Integer.parseInt(identificador));
                        banco.adicionar(conta_normal_nova);
                    }else if(tipo_de_conta == 2){
                        System.out.println("DIGITE O IDENTIFICADOR:  ");
                        String identificador2 = teclado.nextLine();
                        System.out.println("DIGITE O SALDO:  ");
                        String saldo2 = teclado.nextLine();
                        System.out.println("DIGITE O NOME:  ");
                        String nome2 = teclado.nextLine();
                        System.out.println("DIGITE O CPF:   ");
                        String CPF2 = teclado.nextLine();
                        System.out.println("DIGITE EMAIL: ");
                        String email2 = teclado.nextLine();

                        ContaEspecial conta_especial_nova = new ContaEspecial(Integer.parseInt(saldo2), new Pessoa(nome2,CPF2,email2), Integer.parseInt(identificador2));
                        banco.adicionar(conta_especial_nova);

                    }
                    break;
                case 3:
                    System.out.println("DIGITE QUAL A CONTA VOCÊ DESEJA ALTERAR: " + "[1] - CONTA NORMAL " + "[2] CONTA ESPECIAL");
                    int opção_conta = Integer.parseInt(teclado.nextLine());
                    if (opção_conta == 1){
                        System.out.println("DIGITE O IDENTIFICADOR:  ");
                        String identificador2 = teclado.nextLine();
                        System.out.println("DIGITE O SALDO:  ");
                        String saldo2 = teclado.nextLine();
                        System.out.println("DIGITE O NOME:  ");
                        String nome2 = teclado.nextLine();
                        System.out.println("DIGITE O CPF:   ");
                        String CPF2 = teclado.nextLine();
                        System.out.println("DIGITE EMAIL: ");
                        String email2 = teclado.nextLine();
                        ContaNormal conta_normal_substituta = new ContaNormal(Integer.parseInt(saldo2), new Pessoa(nome2,CPF2,email2), Integer.parseInt(identificador2));
                        int identificador_input = teclado.nextInt();
                        banco.alterar(identificador_input,conta_normal_substituta);
                        banco.adicionar(conta_normal_substituta);
                    }else if (opção_conta == 2){
                        System.out.println("DIGITE O IDENTIFICADOR:  ");
                        String identificador = teclado.nextLine();
                        System.out.println("DIGITE O SALDO:  ");
                        String saldo = teclado.nextLine();
                        System.out.println("DIGITE O NOME:  ");
                        String nome = teclado.nextLine();
                        System.out.println("DIGITE O CPF:   ");
                        String CPF = teclado.nextLine();
                        System.out.println("DIGITE EMAIL: ");
                        String email = teclado.nextLine();
                        ContaEspecial conta_especial_substituta = new ContaEspecial(Integer.parseInt(saldo), new Pessoa(nome,CPF,email), Integer.parseInt(identificador));
                        int identificador_input = teclado.nextInt();
                        banco.alterar(identificador_input,conta_especial_substituta);
                    }
                break;
                case 4:
                    int identificador_removedor = teclado.nextInt();
                    banco.remover(identificador_removedor);


                case 5:
                    try{
                        PrintStream escrever = new PrintStream("RELATORIO DO BANCO.txt");
                        for (Conta conta: banco.getContas()){
                                escrever.println("\t" + "Nome" + "\t" + "\t" + "Cpf" + "\t" + "\t" + "\t" + "Email" + "\t" + "\t" + "\t" + "Saldo" + "\t" + "Identficador_Conta" + "\t" + "Limite");
                            escrever.println(conta.getPessoa().getNome() + "\t" + conta.getPessoa().getCpf() + "\t" + conta.getPessoa().getEmail() + "\t" + conta.getSaldo() + conta.getIdentificador_conta());
                        }


                    }catch (FileNotFoundException e){
                        System.out.println("NÃO FOI POSSIVEL CRIAR O ARQUIVO");
                    }



                case 6:
                    System.out.print("QUAL A CONTA VOCÊ DESEJA SACAR " + "[1] CONTA NORMAL" + "[2] CONTA ESPECIAL");
                    int conta_desejada = teclado.nextInt();
                    }




            }


        }




    }




