package QuestionThree;

public class Main {
    public static void main(String[] args) {
        Morador morador = new Morador("Leonardo Messias",true,997446522,302);
        morador.status();
        morador.entrega();
        Morador morador1 = new Morador("Gustavo Barboza",false,49856292,501);
        morador1.status();
        morador1.entrega();


    }

}


