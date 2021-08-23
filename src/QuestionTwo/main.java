package QuestionTwo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Scanner imp = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        pessoa.nome = imp.nextLine();
        while (true){
            System.out.println("\nSeja Bem Vindo "+pessoa.nome);
            System.out.println("----MENU----");
            System.out.println("Opcao 1 --- para saber a Idade");
            System.out.println("Opcao 2 --- para saber o IMC");
            System.out.println("Opcao 3 --- para sair");
            System.out.println("Escola uma opcao: ");
            int opcao = imp.nextInt();


            if (opcao == 3) {
                System.out.print("\nAté logo!");
                imp.close();
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.println("\n--Opcao para saber a idade selecionada--");
                    System.out.println("\nDigite seu ano de nascimento:");
                    pessoa.anoNasc = imp.nextInt();
                    System.out.println("Digite o ano atual: ");
                    pessoa.anoAt = imp.nextInt();
                    pessoa.idade = pessoa.anoAt - pessoa.anoNasc;
                    System.out.println("Sua idade é: ");
                    System.out.println(pessoa.idade);
                    break;

                case 2:
                    System.out.println("\n--Opcao para saber o IMC selecionada--");
                    System.out.println("\nDigite sua altura em centimetros: ");
                    pessoa.altura = imp.nextDouble();
                    System.out.println("Digite o seu pego em Kg: ");
                    pessoa.peso = imp.nextInt();
                    pessoa.imc = pessoa.peso / pessoa.altura;
                    System.out.println("Seu IMC e: " + pessoa.imc);
                    break;
                default:
                    System.out.println("\nOpcao invalida !!!");
                    System.out.println("\n!!Escolha uma opcao valida!!");

            }
        }
    }
}



