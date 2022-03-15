import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// kadeve hesaplama programı
        double fiyat, kadeveoranı=0.18;
        Scanner input= new Scanner(System.in);
        System.out.print("fiyat giriniz:");
        fiyat=input.nextDouble();
        double kadevetutari=fiyat*kadeveoranı;
        double kadevelifiyat= kadevetutari+fiyat;

        System.out.println("kadevesizfiyat:"+ fiyat);
        System.out.println("kadeveoranı:"+ kadeveoranı);
        System.out.println("kadeve tutarı:"+kadevetutari);
        System.out.print("kadevelifiyat:"+ kadevelifiyat);


    }
}
