import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int sayi = input.nextInt();
        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        if (sayi == toplam) {
            System.out.println("It's a perfect number");
        } else {
            System.out.println("It's not a perfect number");
        }
    }
}
