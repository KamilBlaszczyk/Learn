public class Konwersje{
    public static void main(String[] args){
        int a = 5;
        double b = 13.5;
        int c = (int)b/a;      //Rzutowanie czyli jawna konwersja
        System.out.println(c);

        char d = 'a';
        int e = d;
        char f = (char)101;
        System.out.print(d+""+e+""+f);


    }
}