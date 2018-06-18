import java.util.Scanner;

public class PetleCW{
    public static void main(String[] args){
        int a;
        Scanner odczyt = new Scanner(System.in);

        System.out.println("Ustal zegar bomby, podaj liczbę sekund do wybuchu");
        a = odczyt.nextInt();

        do{
            System.out.println("Paka eksploduje za "+a);
            a--;
        }
        while(a>=0);
        System.out.println("Bum");
    }
}