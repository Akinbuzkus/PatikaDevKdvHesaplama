
import java.util.Scanner;


public class KDV {
    public static void main(String[] args) {
        System.out.println("KDV HESAPLAMA SİSTEMİNE HOŞ GELDİNİZ...");
        
        Scanner Scan=new Scanner(System.in);
        double tutar,kdvOranı,kdvTutar,kdvliTutar;
        
        System.out.print("Lütfen Hesaplamak istediğiniz KDV tutarını Giriniz :");
        tutar=Scan.nextDouble();
        
        if(tutar>1000){
            kdvOranı=0.8;
            kdvTutar=tutar*kdvOranı;
            kdvliTutar=tutar+kdvTutar;
            System.out.println("KDV'siz Tutar :"+tutar);
            System.out.println("KDV Oranı :"+kdvOranı);
            System.out.println("KDV Tutarı :"+kdvTutar);
            System.out.println("KDV li Fiyatı :"+kdvliTutar);
            
          
            System.out.println("Girdiğiniz Tutar 1000 Tl den Büyük oldugu için 0.8 den Hesaplanmıstır ");
        }
        else{
            kdvOranı=0.18;
            kdvTutar=tutar*kdvOranı;
            kdvliTutar=tutar+kdvTutar;
            System.out.println("KDV'siz Tutar :"+tutar);
            System.out.println("KDV Oranı :"+kdvOranı);
            System.out.println("KDV tutarı :"+kdvTutar);
            System.out.println("KDV li Fiyatı :"+kdvliTutar);
            
        }
    
        
        
    }
}
