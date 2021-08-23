package QuestionFour;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    Produto produto = new Produto();
        Scanner imp = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        produto.valor= imp.nextDouble();
        if(produto.valor>=300 || produto.valor<400){
            System.out.println("valor produto: "+produto.valor);
            produto.dec = 0.1;
            System.out.println("valor desconto: "+produto.dec);
            produto.desgeral = (produto.valor*produto.dec)+ produto.valor;
            System.out.println("valor geral com desconto: "+produto.desgeral);
        }
        if(produto.valor>=400|| produto.valor<500){
            System.out.println("valor produto: "+produto.valor);
            produto.dec = 0.2;
            System.out.println("valor desconto: "+produto.dec);
            produto.desgeral = (produto.valor*produto.dec)+ produto.valor;
            System.out.println("valor geral com desconto: "+produto.desgeral);
        }
        if(produto.valor>=500 || produto.valor<600){
            System.out.println("valor produto: "+produto.valor);
            produto.dec = 0.3;
            System.out.println("valor desconto: "+produto.dec);
            produto.desgeral = (produto.valor*produto.dec)+ produto.valor;
            System.out.println("valor geral com desconto: "+produto.desgeral);
        }
        if(produto.valor>=600 || produto.valor<700){
            System.out.println("valor produto: "+produto.valor);
            produto.dec = 0.4;
            System.out.println("valor desconto: "+produto.dec);
            produto.desgeral = (produto.valor*produto.dec)+ produto.valor;
            System.out.println("valor geral com desconto: "+produto.desgeral);
        }
        if(produto.valor>=700 || produto.valor<800){
            System.out.println("valor produto: "+produto.valor);
            produto.dec = 0.5;
            System.out.println("valor desconto: "+produto.dec);
            produto.desgeral = (produto.valor*produto.dec)+ produto.valor;
            System.out.println("valor geral com desconto: "+produto.desgeral);
        }
        if(produto.valor>=800 || produto.valor<900){
            System.out.println("valor produto: "+produto.valor);
            produto.dec = 0.6;
            System.out.println("valor desconto: "+produto.dec);
            produto.desgeral = (produto.valor*produto.dec)+ produto.valor;
            System.out.println("valor geral com desconto: "+produto.desgeral);
        }
        if(produto.valor>=900 || produto.valor<1000){
            System.out.println("valor produto: "+produto.valor);
            produto.dec = 0.7;
            System.out.println("valor desconto: "+produto.dec);
            produto.desgeral = (produto.valor*produto.dec)+ produto.valor;
            System.out.println("valor geral com desconto: "+produto.desgeral);
        }
        if(produto.valor>=1000 || produto.valor<1100){
            System.out.println("valor produto: "+produto.valor);
            produto.dec = 0.8;
            System.out.println("valor desconto: "+produto.dec);
            produto.desgeral = (produto.valor*produto.dec)+ produto.valor;
            System.out.println("valor geral com desconto: "+produto.desgeral);
        }
        if(produto.valor>=1100 || produto.valor<1200){
            System.out.println("valor produto: "+produto.valor);
            produto.dec = 0.9;
            System.out.println("valor desconto: "+produto.dec);
            produto.desgeral = (produto.valor*produto.dec)+ produto.valor;
            System.out.println("valor geral com desconto: "+produto.desgeral);
        }
        if(produto.valor>=1200 || produto.valor<1300){
            System.out.println("valor produto: "+produto.valor);
            produto.dec = 1.0;
            System.out.println("valor desconto: "+produto.dec);
            produto.desgeral = (produto.valor*produto.dec)+ produto.valor;
            System.out.println("valor geral com desconto: "+produto.desgeral);
        }
    }
}
