import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input 1 word :");
        String inputUser1 = scanner.nextLine();
        System.out.println("input 1 more word :");
        String inputUser2 = scanner.nextLine();
        int panjangString1 = inputUser1.length();  // length berfungsi untuk menghitung banyaknya karakter dalam string tersebut
        int panjangString2 = inputUser2.length();

        /*
            substring berfungsi untuk mengambil sebagian string dari suatu string. Misal "Satria"
            akan diambil "Sat"-nya saja, maka bisa digunakan substring. toUppercase digunakan untuk
            mengkapitalisasi suatu string, sedangkan toLowerCase sebaliknya.
        */

        String kapital1 = inputUser1.substring(0,1).toUpperCase() + inputUser1.substring(1).toLowerCase();
        String kapital2 = inputUser2.substring(0,1).toUpperCase() + inputUser2.substring(1).toLowerCase();

        int jmlPanjangString = panjangString1 + panjangString2;
        Character hurufPertama1 = inputUser1.charAt(0);     //charAt digunakan untuk mengambil salah satu karakter dari string
        Character hurufPertama2 = inputUser2.charAt(0);
        int konversiAscii1 = (int) hurufPertama1;       // casting karakter menjadi integer berdasarkan ascii number
        int konversiAscii2 = (int) hurufPertama2;

        System.out.println(jmlPanjangString);

        if (konversiAscii1 > konversiAscii2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(kapital1 +" "+ kapital2);

        if(scanner != null) {
            scanner.close();
        }
    }
}