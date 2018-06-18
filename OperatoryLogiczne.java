public class OperatoryLogiczne{
    public static void main(String[] args){
        double a=4.0;
        double b=5;
        double c=2;
        double d=2;

        System.out.print((a+c)*c);      System.out.print("\n");
        System.out.print((a-b)*c);      System.out.print("\n");

        a++;
        b++;

        System.out.print(a);            System.out.print("\n");
        System.out.print(b);            System.out.print("\n");
        System.out.print(c);            System.out.print("\n");

        boolean po= (a+b)>c;
        boolean po2= a==b;
        boolean po3= (d==c)&&(b!=c);
        System.out.print(po);           System.out.print("\n");
        System.out.print(po3);           System.out.print("\n");
        System.out.print(po2);

    }
}