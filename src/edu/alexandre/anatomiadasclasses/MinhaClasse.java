package edu.alexandre.anatomiadasclasses;
public class MinhaClasse {
    
    public static void main (String [] args){

        System.out.print ("Hello World!!");//Exibir no terminal a mensagem


        String primeiroNome = "Alexandre";
        String ultimoNome = "Veras";

        String nomecompleto = nomeCompleto(primeiroNome, ultimoNome);

        System.out.print(nomecompleto);

    }

    public static String nomeCompleto (String primeiroNome, String ultimoNome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(ultimoNome); //concatenar nome completo
    }
}
