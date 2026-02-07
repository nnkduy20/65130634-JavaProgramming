import java.util.Scanner;

public class Lab1_Bai2_ChuviDT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Nhap canh thu nhat: ");
        double a = sc.nextDouble();

        System.out.print("Nhap canh thu hai: ");
        double b = sc.nextDouble();


        double chuVi = 2 * (a + b);
        double dienTich = a * b;


        double canhNho = Math.min(a, b);


        System.out.println("Chu vi: " + chuVi);
        System.out.println("Dien tich: " + dienTich);
        System.out.println("Canh nho: " + canhNho);

        sc.close();
    }
}
