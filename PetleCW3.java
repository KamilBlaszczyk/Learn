import java.util.Scanner;

public class PetleCW3{
    public static void main(String[] args){
        int a;
        Scanner odczyt = new Scanner(System.in);

        System.out.println("Ustal zegar bomby, podaj liczbę sekund do wybuchu");

        for(a=odczyt.nextInt();a>0;a--)
            System.out.println("Paka eksploduje za "+a);

        System.out.println("Bum");
    }
}