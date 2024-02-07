import java.util.Scanner;

public class testVone {

    /* versao do bing  */


    public static void main(String[] args) {
        String nameHero = "";
        int xpHero = 0;

        Scanner scanner = new Scanner(System.in);

        for (;;) {
            System.out.println("Olá heroi, qual o seu nome? ");
            if(scanner.hasNextInt()){
                scanner.nextInt(); // descarta a entrada numérica
            } else {
                nameHero = scanner.next();
                break; // sai do loop quando um nome válido é inserido
            }
        }

        System.out.println("Qual o seu xp? ");
        if(scanner.hasNextInt()){
            xpHero = scanner.nextInt();
        }

        String msgResult = "O Herói de nome " + nameHero + " está no nível: ";

        if(xpHero <= 1000){
            System.out.println(msgResult + "Ferro");
        }else if(xpHero >= 1001 && xpHero <= 2000){
            System.out.println(msgResult + "Bronze");
        }else if(xpHero >= 2001 && xpHero <= 5000){
            System.out.println(msgResult + "Prata");
        }else if(xpHero >= 5001 && xpHero <= 7000){
            System.out.println(msgResult + "Ouro");
        }else if(xpHero >= 7001 && xpHero <= 8000){
            System.out.println(msgResult + "Platina");
        }else if(xpHero >= 8001 && xpHero <= 9000){
            System.out.println(msgResult + "Ascendente");
        }else if(xpHero >= 9001 && xpHero <= 10000){
            System.out.println(msgResult + "Imortal");
        }else if(xpHero >= 10001){
            System.out.println(msgResult + "Radiante");
        }

        scanner.close();
    }
}