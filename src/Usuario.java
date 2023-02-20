public class Usuario {
    public static void main (String[] args){
        SmartTv smartTv = new SmartTv();
        // status inicial da tv
        System.out.println("Tv está ligada? " + smartTv.ligada);
        System.out.println("A tv está no canal: " +smartTv.canal);
        System.out.println("A tv está no volume: " +smartTv.volume);
        
        smartTv.ligar(); // ligou a tv
        smartTv.aumentarVolume(); 
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.mudarCanal(17);
        
        
        
        
        // status da tv após os testes
        System.out.println("Tv está ligada? " + smartTv.ligada);
        System.out.println("A tv está no canal: " +smartTv.canal);
        System.out.println("A tv está no volume: " +smartTv.volume);

    }
}
