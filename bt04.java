package baitap;

import java.util.Scanner;

public class bt04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều rộng: ");
        float width = Float.parseFloat(sc.nextLine());
        System.out.print("Nhập chiều dài: ");
        float height = Float.parseFloat(sc.nextLine());

        float S = width * height;
        float C = 2 * (width + height);

        System.out.println("Kích thước đã nhập: Rộng = " + width + ", Dài = " + height);
        System.out.println("Diện tích: " + S);
        System.out.println("Chu vi: " + C);

        sc.close();

    }
}
