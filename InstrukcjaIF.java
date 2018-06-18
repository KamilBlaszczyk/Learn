import java.util.Scanner;

public class InstrukcjaIF {

    public static void main(String[] args){

        Scanner wprowadz = new Scanner(System.in);
        System.out.print("Podaj swoje imie");
        String imie = wprowadz.nextLine();

        if("pola".equals(imie.toLowerCase()))
            System.out.println("Czesc"+" "+imie);
        else if("kamil".equalsIgnoreCase(imie))
            System.out.println("Czesc"+" "+imie);
        else if("fabian".equalsIgnoreCase(imie))
            System.out.println("Czesc"+" "+imie);
        else
            System.out.println("Nie znam cię smieciu");

    }

}
