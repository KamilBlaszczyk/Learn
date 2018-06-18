import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ZapisDoPliku{
    public static void main(String[] args) throws FileNotFoundException{
        PrintWriter zapis = new PrintWriter("ala.txt");
        zapis.println("Ala ma kota, a kot ma Alę");
        zapis.close();
    }
}