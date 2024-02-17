import java.util.Scanner;       // paket yang berfungsi supaya kita bisa menggunakan fungsi scanner
import java.math.BigInteger;    // paket yang berfungsi untuk perhitungan matematis dengan bilangan yang sangat besar

public class dataTypeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       // membuat scanner untuk membaca input user
        System.out.println("input how many numbers you want to check :");
        Integer jmlInput = scanner.nextInt();
        scanner.nextLine();
        String inputUser[]= new String[jmlInput];           // variabel array bertipe string sebagai penampung input user
        System.out.println("input "+jmlInput+" numbers you want to check :");
        for (int i = 0; i < jmlInput; i++) {
            inputUser[i] = scanner.nextLine();
        }
        for (int i = 0; i < jmlInput; i++) {
            BigInteger konversiInputUser = new BigInteger(inputUser[i]);
            /*
                kode di atas berfungsi untuk mengonversi string yang diperoleh
                dari input pengguna menjadi BigInteger. Setelah itu, lanjut ke kode
                di bawah, dimana input user tadi akan dicek rangenya menggunakan selection.
            */
            if (konversiInputUser.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) < 0
                || konversiInputUser.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
                System.out.println(inputUser[i] + " can't be fitted anywhere");
            } else {
                System.out.println(inputUser[i] + " can be fitted in :");
            }

            if (konversiInputUser.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0
                && konversiInputUser.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0) {
                System.out.println("* byte");
            }
            if (konversiInputUser.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0
                && konversiInputUser.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0) {
                System.out.println("* short");
            }
            if (konversiInputUser.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0
                && konversiInputUser.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {
                System.out.println("* int");
            }
            if (konversiInputUser.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0
                && konversiInputUser.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
                System.out.println("* long");
            }
        }
        if(scanner != null) {   // menutup Scanner karena telah selesai digunakan.
            scanner.close();
        }
    }
}