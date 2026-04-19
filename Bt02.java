package baitapss3;
import java.util.Scanner;
public class Bt02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soHocVien = 0;
        double tongDiem = 0;
        double diemCaoNhat = -1;
        double diemThapNhat = 11;

        while (true) {
            // Hiển thị Menu
            System.out.println("\n********* MENU*********");
            System.out.println("1.      Nhập điểm học viên");
            System.out.println("2.      Hiển thị thống kê");
            System.out.println("3.      Thoát");
            System.out.print("Lựa chọn của bạn: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.print("Nhập điểm (hoặc nhập -1 để dừng): ");
                        double diem = scanner.nextDouble();

                        if (diem == -1) {
                            break;
                        }

                        if (diem < 0 || diem > 10) {
                            System.out.println("Cảnh báo: Điểm không hợp lệ! Vui lòng nhập điểm từ 0 đến 10.");
                            continue;
                        }

                        String hocLuc = "";
                        if (diem >= 0 && diem < 5) {
                            hocLuc = "Yếu";
                        } else if (diem >= 5 && diem < 7) {
                            hocLuc = "Trung Bình";
                        } else if (diem >= 7 && diem < 8) {
                            hocLuc = "Khá";
                        } else if (diem >= 8 && diem < 9) {
                            hocLuc = "Giỏi";
                        } else if (diem >= 9 && diem <= 10) {
                            hocLuc = "Xuất sắc";
                        }

                        System.out.println("=> Xếp loại học lực: " + hocLuc);

                        tongDiem += diem;

                        if (soHocVien == 0) {
                            diemCaoNhat = diem;
                            diemThapNhat = diem;
                        } else {
                            if (diem > diemCaoNhat) diemCaoNhat = diem;
                            if (diem < diemThapNhat) diemThapNhat = diem;
                        }

                        soHocVien++; // Tăng biến đếm số học viên
                    }
                    break;

                case 2:
                    if (soHocVien == 0) {
                        System.out.println("Chưa có dữ liệu!");
                    } else {
                        double diemTrungBinh = tongDiem / soHocVien;
                        System.out.println("Số học viên đã nhập : " + soHocVien);
                        System.out.printf("Điểm trung bình     : %.2f\n", diemTrungBinh);
                        System.out.println("Điểm cao nhất       : " + diemCaoNhat);
                        System.out.println("Điểm thấp nhất      : " + diemThapNhat);
                    }
                    break;

                case 3:
                    System.out.println("\nĐã thoát chương trình. Tạm biệt!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập 1, 2 hoặc 3.");
            }
        }
    }
}
