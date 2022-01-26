
import java.util.Scanner;


public class adviseActivity {
    public static void main(String[] args) {
        /*
        Kullanıcıdan sıcaklık değerini girmesini isteyelim.

        Belirtilmiş olan sıcaklık değerine göre etkinlik önerisinde bulunalım.
         */

        int heat, select;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık değerini giriniz:");

        heat = input.nextInt();
        if (heat < 5) {

            System.out.print("Kayak yapabilrisiniz.");

        } else {
            System.out.print("Girmiş olduğunu sıcaklık değeri 5 ten olduğu için diğer etkinlikleride görmek ister misiniz?\n1-evet\n2-hayır\n3-seçiminiz:");
            select = input.nextInt();

            switch (select) {

                case 1:
                    System.out.print("Lütfen sıcaklık değerini tekrar giriniz:");
                    input.nextInt();
                    if (heat <= 15) {
                        System.out.println("Sinemaya gidebilirsiniz.");
                    }
                    if (heat >= 10 && heat <= 25) {
                        System.out.println("Pikniğe gidebilirsiniz.");
                    } else if (heat > 25) {
                        System.out.println("Yüzmeye gidebilirsiniz");
                        break;
                    }
            }


        }
    }


}



