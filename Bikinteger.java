import java.math.BigInteger;

public class Bikinteger{

    public static void main(String[] args) {
        BigInteger a = new BigInteger("12000");
        BigInteger b = new BigInteger("45000");

        System.out.println("Dodawanie: "+a.add(b).toString());        System.out.print("\n");
        System.out.println("Odejmowanie: "+a.subtract(b).toString());     System.out.print("\n");
        System.out.println("Mnożenie: "+a.multiply(b).toString());     System.out.print("\n");
        System.out.println("Dzielenie "+a.divide(b).toString());     System.out.print("\n");

        System.out.println("Potęgowanie "+a.pow(5));     System.out.print("\n");
        System.out.println("Bezwzględność "+a.abs());     System.out.print("\n");

    }
}

