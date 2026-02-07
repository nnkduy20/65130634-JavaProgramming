import java.util.Scanner;

public class Lab1_Bai3_TheTich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Nhap canh khoi lap phuong: ");
        double canh = sc.nextDouble();


        double theTich = Math.pow(canh, 3);


        System.out.println("The tich khoi lap phuong: " + theTich);

        sc.close();
    }
}
