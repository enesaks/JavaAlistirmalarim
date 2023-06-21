import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        double sonuc = 0;

        Scanner scanner = new Scanner(System.in);

        //Harmonik Seri : 1+1/2+1/3+1/4+1/n .... olan sayılardır.

        System.out.println("n Sayısını Giriniz");
        n = scanner.nextInt();

        for (double i= 1; i<=n ; i++){
            sonuc += (1/i);
        }
        System.out.println("Sonuc : "+sonuc);

    }
}