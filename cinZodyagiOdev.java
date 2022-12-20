import java.util.Scanner;

public class cinZodyagiOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dogumTarihi, cinZodyagi;
        System.out.println("Doğum tarihiniz : ");
        dogumTarihi = input.nextInt();

        cinZodyagi = dogumTarihi / 12;
        switch (dogumTarihi % 12) {
            case 0:
                System.out.println("maymun");
                break;
            case 1:
                System.out.println("horoz");
                break;
            case 2:
                System.out.println("köpek");
                break;
            case 3:
                System.out.println("domuz");
                break;
            case 4:
                System.out.println("fare");
                break;
            case 5:
                System.out.println("öküz");
                break;
            case 6:
                System.out.println("kaplan");
                break;
            case 7:
                System.out.println("tavşan");
                break;
            case 8:
                System.out.println("ejderha");
                break;
            case 9:
                System.out.println("yılan");
                break;
            case 10:
                System.out.println("at");
                break;
            case 11:
                System.out.println("koyun");
                break;
            default:
                System.out.println("Hatalı işlem yaptınız,Lütfen tekrar deneyiniz.");


        }



    }
}
