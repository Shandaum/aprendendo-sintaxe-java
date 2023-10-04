package edu.alexandre.operadores;


public class Operadores {
    
    public static void main(String[] args) throws Exception{
    
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3; //resto
        double resultado = (10 * 7) + (20/4); //operação igual na matemática básica

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(modulo);
        System.out.println(resultado);
                
        // + quando é com string serve como concatenação
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);

        //teste de concatenar string e int com depuração 
        // o ponto tem que ser numa linha de código, não pode ser comentário
        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);


        //unários
        int numero = 5;

        numero = - numero; //deixar o numero negativo
        System.out.println(numero);


        numero = numero * -1; //deixar o numero positivo, pois só o + é considerado um operador matemático
        System.out.println(numero);

        numero ++; //incrementar o valor de 1 em 1
        System.out.println(numero);

        numero --; //decrementar o valor de 1 em 1
        System.out.println(numero);


        boolean variavel = true;
        System.out.println(variavel);
        
        variavel = !variavel; //inverter varivel booleana
        System.out.println(variavel);

    }
}