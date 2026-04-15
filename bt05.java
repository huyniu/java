package baitap;
import java.util.Scanner;
public class bt05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cân nặng: ");
        double kg = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập chiều cao: ");
        double m = Double.parseDouble(sc.nextLine());

        double BMI = kg/(m*m);
        System.out.print("Chỉ số BMI: " + BMI);
    }
}
