package QuestionThree;

public class Main {
    public static void main(String[] args) {
        Morador morador = new Morador("Leonardo Messias",true,997446522,302);
        morador.status();
        morador.entrega();
        Morador morador1 = new Morador("Gustavo Messias",false,49856292,501);
        morador1.status();
        morador1.entrega();


    }

}


//            Scanner imp = new Scanner(System.in);
//            System.out.println("Digite o seu nome: ");
//            morador.setNome(imp.nextLine());
//            System.out.println("Digite o numero da residencia: ");
//            morador.setNumero(imp.nextInt());
//            System.out.println("Digite seu numero de telefone: ");
//            morador.setTelefone(imp.nextInt());
//            System.out.println("Possui cachorro na residencia?\n 1=sim ou 2=nao");
//            morador.setDog(imp.nextInt());