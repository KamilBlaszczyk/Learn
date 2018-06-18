import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class ZapisCW {
    public static void main(String[] args) throws FileNotFoundException{

        Scanner pobierz = new Scanner(System.in);
        System.out.print("Podaj imie");
        String imie = pobierz.nextLine();

        PrintWriter zapis = new PrintWriter("imie.txt");
        zapis.println(imie);
        zapis.close();

        Scanner zawartoscpliku = new Scanner(new File("imie.txt"));

        //String odczytaneimie = zawartoscpliku.nextLine();
        System.out.print(zawartoscpliku.nextLine());

    }
}
