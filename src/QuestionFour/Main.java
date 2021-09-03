package QuestionFour;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Produto produto = new Produto();
        Scanner imp = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        produto.valor= imp.nextDouble();
        produto.descg();

    }
}
