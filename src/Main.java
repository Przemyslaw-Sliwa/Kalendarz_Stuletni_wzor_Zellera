import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Zeller zeller=new Zeller();

        System.out.println("Podaj dzien: ");
        zeller.day=scanner.nextInt();
        System.out.println("Podaj miesiac: ");
        zeller.month=scanner.nextInt();
        System.out.println("Podaj rok: ");
        zeller.year=scanner.nextInt();

        System.out.println(zeller.calc());
    }
}
