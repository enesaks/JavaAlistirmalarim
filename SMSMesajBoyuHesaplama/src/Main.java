import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        * Java ile kullanıcı girdiği metinin mesaj boyunu hesaplayan program.
        * Her bir mesaj karakter sınırı 160 kelimedir.
        */

        System.out.println("Lütfen Bir Mesaj Giriniz : ");
        String mesaj = scanner.nextLine();
        int count = 0;
        for (char karakter : mesaj.toCharArray()){ // Bu döngü yerine mesaj.length de kulanılabilir.
            count++;
        }
        double smssayi = Math.ceil(count/160.0);//Math.ceil sayıyı bi üst basamağa yuvarlamaya yarar. Örnek 1.2 -> 2 gibi.

        if (count<160)
            System.out.printf("Girdiğiniz metinin boyu %d karakter. 1 SMS yer kaplar.",count);
        else
            System.out.printf("Girdiğiniz metinin boyu %d karakter.160 karakterden fazla. %d kadar SMS gerekir.",count,(int)smssayi);



    }
}