package baitap;
import java.util.Scanner;
public class bt06{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vận tốc (km/h): ");
        double v= Double.parseDouble(sc.nextLine());
        System.out.print("Nhập thời gian đi (giờ): ");
        double t = Double.parseDouble(sc.nextLine());

        if (v< 0 || t < 0) {
            System.out.println("\n Dữ liệu không hợp lệ!");
        } else {
            double s = v * t;

            System.out.println("vận tốc " + v+ " km/h và thời gian " + t+ " giờ.");
            System.out.println("Quãng đường là: " + s + " km");
        }
        sc.close();
    }
}