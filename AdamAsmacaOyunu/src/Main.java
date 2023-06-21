import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Oyunun amacı rastgele bir kelime seçilir ve o kelimenin harflerinin yerine çizgi çizilir.
         Kullanıcıdan harf tahminleri alınır ve girilen harf kelime içerisinde varsa, doğru tahmin
         edildiği belirtilir ve kelimenin doğru tahmin edilen harflerinin çizgileri yerine yazılır.
          Eğer harf yanlış tahmin edilirse, kullanıcının hakkı bir azaltılır. Oyun, ya tüm harfler
          doğru tahmin edilinceye kadar ya da kullanıcının hakları tükeninceye kadar devam eder.
          Oyun sonunda, kullanıcının kazanıp kazanmadığı ya da doğru kelimeyi tahmin edip edemediği
          belirtilir.*/

        String kelime = "elma",tempKelime ="";
        
        ArrayList<String> kelimebul = new ArrayList<>();
        System.out.println("Adam Asmacaya Hoşgeldiniz.");
        int hak = 6,temp= 0,count = 0;
        for (int i = 0 ; i<kelime.length() ; i++) {
            System.out.print("_");
            kelimebul.add("_");
        }

        do {

            System.out.println("\nHakın : "+hak);
            System.out.print("Harf söyle:");
            String tahmin = scanner.nextLine();


            for (int i = 0; i < kelime.length(); i++) {
                if (kelime.toCharArray()[i] == tahmin.charAt(0)){
                    kelimebul.remove(i);
                    kelimebul.add(i,tahmin);
                    System.out.print(kelimebul.get(i));
                }
                else {
                    System.out.print(kelimebul.get(i));
                    count++;
                }
            }

            if (count/4 == 1){
                hak--;
                count= 0;
                if (hak == 0){
                    System.out.println("\nHakkınız Bitmiştir..");
                    break;
                }
            }else{
                count = 0;
            }


            for (int i = 0; kelime.length()>i; i++){
                tempKelime = tempKelime + kelimebul.get(i);
            }
            if (tempKelime.equals(kelime)){
                System.out.printf("\nTebikler Kazandınız Kelime %s :)",kelime);
                break;
            }else {
                tempKelime = "";
            }


        }while (hak !=0 && temp != kelime.length());



    }
}