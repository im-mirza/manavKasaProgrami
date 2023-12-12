import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Degiskenleri tanimladim
        float elmaFiyat=15.2f, armutFiyat=25.5f, muzFiyat=24.9f, portagalFiyat=7.5f, secilenKilo,toplamDeger;
        int secilenMeyve;

        //musteriden almak istedigi meyvenin rakamla secmesini istedim
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen almak istediginiz meyveni secin: ");
        System.out.println(" 1.Elma\n 2.Armut\n 3.Muz\n 4.Portagal");
        secilenMeyve=sc.nextInt();

        //secilen rakama gore alinacak meyveni ve o meyveden kac kg istedigini alarak ekrana yazdirdim
        switch (secilenMeyve){
        case 1:
            System.out.println("Elmanin kilosu: "+ elmaFiyat+"Tl"+" Kac kilo istiyorsunuz ?");
            secilenKilo=sc.nextFloat();
            toplamDeger=elmaFiyat*secilenKilo;
            System.out.println("Odemeniz gereken: "+toplamDeger);
            break;
        case 2:
            System.out.println("Armutun kilosu: "+ armutFiyat+"Tl"+" Kac kilo istiyorsunuz ?");
            secilenKilo=sc.nextFloat();
            toplamDeger=armutFiyat*secilenKilo;
            System.out.println("Odemeniz gereken: "+toplamDeger);
            break;
        case 3:
            System.out.println("Muzun kilosu: "+ muzFiyat+"Tl"+" Kac kilo istiyorsunuz ?");
            secilenKilo=sc.nextFloat();
            toplamDeger=muzFiyat*secilenKilo;
            System.out.println("Odemeniz gereken: "+toplamDeger);
            break;
        case 4:
            System.out.println("Portagalin kilosu: "+ portagalFiyat+"Tl"+" Kac kilo istiyorsunuz ?");
            secilenKilo=sc.nextFloat();
            toplamDeger=portagalFiyat*secilenKilo;
            System.out.println("Odemeniz gereken: "+toplamDeger);
            break;

        }
    }
}