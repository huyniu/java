package baitap;

import java.util.Scanner;

public class bt01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhập bán kính của hình tròn: ");
        double radius = Double.parseDouble(sc.nextLine());

        double S = Math.PI * radius * radius;

        System.out.println("Diện tích hình tròn có bán kính " + radius + " là: " + S);
        sc.close();
    }
}
