package QuestionOne;

import java.util.Scanner;

public class Main extends Colaborador {
    public static void main(String[] args) {
        Colaborador colaborador = new Colaborador();
        Scanner imp = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        colaborador.nome = imp.nextLine();
        System.out.println("Digite sua matricula: ");
        colaborador.matricula = imp.nextInt();
        System.out.println("Ensino Basico concluido?\n 1=sim ou 2=nao");
       colaborador.ensbasic = imp.nextInt();
        if (colaborador.ensbasic==1){
            System.out.println("Digite sua escola: ");
            colaborador.colegio= imp.nextLine();

        }else{
            System.out.println(colaborador.matricula);

        }
        System.out.println("Ensino superior completo? \n 1=sim ou 2=nao");
        colaborador.enssup = imp.nextInt();
        if (colaborador.enssup==1){
            System.out.println("Digite sua universidade: ");
            colaborador.universidade=imp.nextLine();
        }
    }
}
