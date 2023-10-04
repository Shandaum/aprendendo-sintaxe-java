package edu.alexandre.metodos;

public class Usuario {
    
    public static void main(String[] args) throws Exception{

        SmartTv smartTv = new SmartTv();

        System.out.println("TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual " + smartTv.canal);
        System.out.println("Volume atual " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Atualiação, TV está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Atualiação, TV está ligada? " + smartTv.ligada);

        System.out.println("Canal atual " + smartTv.canal);
        
        smartTv.mudarCanal(8);
        System.out.println("Canal atual " + smartTv.canal);
        
        
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual " + smartTv.volume);

    }

}
