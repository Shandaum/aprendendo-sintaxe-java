package edu.alexandre.tiposvariaveis;

public class TipoVariaveis {
    
    public static void main(String[] args) throws Exception{
    
    String nome = "Alexandre";
    int idade = 26;
    double altura = 1.91;
    boolean verdadeiro = true;

    
    System.out.print(idade);
    //variaveis podem mudar durante a execução
    idade = 27;
    System.out.print("Nova idade é " + idade);

    //para a variavel ser reconhecida como constate a declaração é a seguinte

        final int DATA_NASCIMENTO = 1997;

    }
}
