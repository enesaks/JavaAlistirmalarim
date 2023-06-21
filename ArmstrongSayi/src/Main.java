import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*Armstrong Sayısı
        N haneli bir sayının basamaklarının n’inci üstlerinin toplamı,
        sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.

        Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir.
        Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.*/

        char[] sayi;
        String stringSayi = "";
        double tempSonuc = 0;

        System.out.println("Sayiyi Giriniz : ");
        sayi = scanner.nextLine().toCharArray();
        int sayibasamak = sayi.length;

        for (int i = 0; i<sayibasamak; i++){
            int basamak = Character.getNumericValue(sayi[i]);
            tempSonuc = tempSonuc +Math.pow(basamak,sayibasamak);
            stringSayi = stringSayi + sayi[i];
        }

        if (tempSonuc == Integer.parseInt(stringSayi)){
            System.out.println(stringSayi+" Armstrong sayidir.");
        }
        else {
            System.out.println(stringSayi+" Armstorng sayi değildir.");
        }

    }
}