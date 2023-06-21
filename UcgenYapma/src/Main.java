import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*Java ile kullanıcı girdiği değer kadar yıldızlar ile
        eşkenar üçgen oluşturan program.*/

        System.out.print("oluşturmak istediğiniz ucgen uzunlugunu giriniz : ");
        int n = scanner.nextInt();
        String bosluk = " ";

        int temp = n+1;
        int a = 0;

        for (int i = 0; i<n; i++){

            for (int j = 1; j<temp; j++){
                System.out.print(bosluk);
            }
            temp--;
            for (int j = 0; j<=a; j++){
                System.out.print("*");
            }
            a += 2;

            System.out.print("\n");
        }


    }
}