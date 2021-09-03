package QuestionFour;

public class Produto {

    Double valor;
    Double dec;
    Double desgeral;

    public void descg(){
        if(valor>=300 && valor<400){
            System.out.println("valor produto: "+valor);
            dec = (valor*1.0)/100;
            System.out.println("valor desconto: "+dec);
            desgeral =valor-dec;
            System.out.println("valor geral com desconto: "+desgeral);
        }
        else  if(valor>=400 && valor<500){
            System.out.println("valor produto: "+valor);
            dec = (valor*2.0)/100;
            System.out.println("valor desconto: "+dec);
            desgeral =valor-dec;
            System.out.println("valor geral com desconto: "+desgeral);
        }
        else if(valor>=500 && valor<600){
            System.out.println("valor produto: "+valor);
            dec = (valor*3.0)/100;
            System.out.println("valor desconto: "+dec);
            desgeral =valor-dec;
            System.out.println("valor geral com desconto: "+desgeral);
        }
        else if(valor>=600 && valor<700){
            System.out.println("valor produto: "+valor);
            dec = (valor*4.0)/100;
            System.out.println("valor desconto: "+dec);
            desgeral =valor-dec;
            System.out.println("valor geral com desconto: "+desgeral);
        }
        else if(valor>=700 && valor<800){
            System.out.println("valor produto: "+valor);
            dec = (valor*5.0)/100;
            System.out.println("valor desconto: "+dec);
            desgeral =valor-dec;
            System.out.println("valor geral com desconto: "+desgeral);
        }
        else if(valor>=800 && valor<900){
            System.out.println("valor produto: "+valor);
            dec = (valor*6.0)/100;
            System.out.println("valor desconto: "+dec);
            desgeral =valor-dec;
            System.out.println("valor geral com desconto: "+desgeral);
        }
        else if(valor>=900 && valor<1000){
            System.out.println("valor produto: "+valor);
            dec = (valor*7.0)/100;
            System.out.println("valor desconto: "+dec);
            desgeral =valor-dec;
            System.out.println("valor geral com desconto: "+desgeral);
        }
        else if(valor>=1000 && valor<1100){
            System.out.println("valor produto: "+valor);
            dec = (valor*8.0)/100;
            System.out.println("valor desconto: "+dec);
            desgeral =valor-dec;
            System.out.println("valor geral com desconto: "+desgeral);
        }
        else if(valor>=1100 && valor<1200){
            System.out.println("valor produto: "+valor);
            dec = (valor*9.0)/100;
            System.out.println("valor desconto: "+dec);
            desgeral =valor-dec;
            System.out.println("valor geral com desconto: "+desgeral);
        }
        else if(valor>=1200 ){
            System.out.println("valor produto: "+valor);
            dec = (valor*10.0)/100;
            System.out.println("valor desconto: "+dec);
            desgeral =valor-dec;
            System.out.println("valor geral com desconto: "+desgeral);
        }

    }
}
