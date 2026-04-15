package baitap;

import java.util.Scanner;

public class bt03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("phân số thứ nhất");
        System.out.print("Nhập tử số (a): ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập mẫu số (b): ");
        int b = Integer.parseInt(sc.nextLine());

        System.out.println("phân số thứ hai");
        System.out.print("Nhập tử số (c): ");
        int c = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập mẫu số (d): ");
        int d = Integer.parseInt(sc.nextLine());

        int tuSoMoi = (a * d) + (b * c);
        int mauSoMoi = b * d;

        System.out.println("\n--- KẾT QUẢ ---");
        System.out.println("Phép tính: " + a + "/" + b + " + " + c + "/" + d);
        System.out.println("Tổng của hai phân số là: " + tuSoMoi + "/" + mauSoMoi);

        sc.close();
    }
}
