package baitap;

import java.util.Scanner;;

public class bt02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập firstNumber: ");
        int firstNumber = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập secondNumber: ");
        int secondNumber = Integer.parseInt(sc.nextLine());

        int tong = firstNumber + secondNumber;
        int hieu = firstNumber - secondNumber;
        int tich = firstNumber * secondNumber;
        int thuong = firstNumber / secondNumber;
        int phanDu = firstNumber % secondNumber;

        System.out.println("\n--- KẾT QUẢ ---");
        System.out.println("firstNumber: " + firstNumber);
        System.out.println("secondNumber: " + secondNumber);
        System.out.println("Tổng (" + firstNumber + " + " + secondNumber + ") = " + tong);
        System.out.println("Hiệu (" + firstNumber + " - " + secondNumber + ") = " + hieu);
        System.out.println("Tích (" + firstNumber + " * " + secondNumber + ") = " + tich);
        System.out.println("Thương (" + firstNumber + " / " + secondNumber + ") = " + thuong);
        System.out.println("Phần dư (" + firstNumber + " % " + secondNumber + ") = " + phanDu);
    }
}
