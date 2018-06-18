import java.util.Scanner;

public class Strumienie {


    public static void main(String[] args){
        double a;               //pobiera liczbę zmiennoprzecinkową
        double b;               //pobiera liczbę zmiennoprzecinkową
        String imie;            //w nim zapiszemy swoje imie

        Scanner odczyt = new Scanner(System.in);    //Parametr konstruktora obiektu Scanner to System.in

        System.out.println("Podaj imię:");
        imie = odczyt.nextLine();
        System.out.println("Podaj pierwszą liczbę");
        a = odczyt.nextDouble();
        System.out.println("Podaj drugą liczbę");
        b = odczyt.nextDouble();

        System.out.println("Wynik dodawania: "+(a+b)+"\n");
        System.out.println("Wynik dodawania: "+(a-b)+"\n");
        System.out.println("Wynik dodawania: "+(a*b)+"\n");
        System.out.println("Wynik dodawania: "+(a/b)+"\n");
        System.out.println("Twoje imie to:"+imie);

    }

}
