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



        //jeito mais simples de fazer um IF com 1 condição
        int a, b;
        a = 6;
        b = 6;

        // condição recebe a é igual a b, caso sim escreve verdadeiro, caso não escreve falso
        String condicao = a == b ? "verdadeiro" : "falso";
        System.out.println(condicao);



        //operadores relacionais
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("Numero 1 é igual ao numero 2? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("Numero 1 é maior que numero 2? " + simNao);

        simNao = numero1 < numero2;
	    System.out.println("Numero 1 é menor que numero 2? " + simNao);

        simNao = numero1 >= numero2;
        System.out.println("Numero 1 é maior ou igual que numero 2? " + simNao);

        simNao = numero1 <= numero2;
        System.out.println("Numero 1 menor ou igual que numero 2? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("Numero 1 é diferente de numero 2? " + simNao);
    


        String nome1 = "Alexandre";
        String nome2 = "Alexandre";

        System.out.println(nome1 == nome2);




        //Operadores lógicos
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras!");
        } 

        if(condicao1 || condicao2){
            System.out.println("Uma das duas condições é verdadeira!");
        } 

        if(condicao1 && (7>4)){
            System.out.println("As duas condições são verdadeiras!");
        } 

        System.out.println("Fim do teste de operadores lógicos");


    }


}