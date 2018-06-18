import java.util.Scanner;

public class PetleCW2{
    public static void main(String[] args){
        int a;
        Scanner podana_liczba = new Scanner(System.in);

        System.out.println("Ustal zegar bomby, podaj liczbę sekund do wybuchu");
        a = podana_liczba.nextInt();

        while(a>=0){
            System.out.println("Paka eksploduje za "+a);
            a--;
        }
        System.out.println("Bum");
    }
}