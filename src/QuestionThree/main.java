package QuestionThree;

import java.util.Scanner;

public class main  {
    public static void main(String[] args) {
        Morador morador = new Morador();
        int cont=0;
        Scanner imp = new Scanner(System.in);
        for (int i=0; i<5; i++) {
            System.out.println("Digite o seu nome: ");
            morador.nome = imp.nextLine();
            System.out.println("Digite o numero da residencia: ");
            morador.numerores = imp.nextInt();
            System.out.println("Digite seu numero de telefone: ");
            morador.telefone = imp.nextInt();
            System.out.println("Possui cachorro na residencia? y/n");
            morador.dog = imp.nextLine();
        }
        if(morador.dog =="y"){
            System.out.println("!!Entregamos a correspondencia!!");
        }else{
            System.out.println("!!Nao entregamos a correspondencia");
          }
        if(morador.numerores % 2 != 0){
            cont++;
            System.out.println("Quantidade de casas impares: "+cont);

        }
    }

}