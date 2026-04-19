package baitapss3;
import java.util.Scanner;
public class Bt03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khởi tạo các biến lưu trữ thống kê ngoài vòng lặp
        int soNhanVien = 0;
        double tongLuong = 0;
        double luongCaoNhat = -1;
        double luongThapNhat = Double.MAX_VALUE;
        double tongTienThuong = 0;

        while (true) {
            // Hiển thị Menu
            System.out.println("\n******MENU ******");
            System.out.println("1.      Nhập lương nhân viên");
            System.out.println("2.      Hiển thị thống kê");
            System.out.println("3.      Tính tổng số tiền thưởng cho nhân viên");
            System.out.println("4.      Thoát");
            System.out.print("Lựa chọn của bạn: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.print("Nhập lương (VNĐ) (nhập -1 để dừng): ");
                        double luong = scanner.nextDouble();
                        if (luong == -1) {
                            break;
                        }

                        if (luong < 0 || luong > 500_000_000) {
                            System.out.println("Cảnh báo: Lương không hợp lệ! Vui lòng nhập từ 0 đến 500,000,000 VNĐ.");
                            continue;
                        }

                        String phanLoai = "";
                        if (luong < 5_000_000) {
                            phanLoai = "Thu nhập thấp";
                        } else if (luong < 15_000_000) {
                            phanLoai = "Thu nhập trung bình";
                        } else if (luong < 50_000_000) {
                            phanLoai = "Thu nhập khá";
                        } else {
                            phanLoai = "Thu nhập cao";
                        }
                        System.out.println("=> Phân loại: " + phanLoai);

                        double tienThuong = 0;
                        if (luong < 5_000_000) {
                            tienThuong = luong * 0.05;
                        } else if (luong < 15_000_000) {
                            tienThuong = luong * 0.10;
                        } else if (luong < 50_000_000) {
                            tienThuong = luong * 0.15;
                        } else if (luong < 100_000_000) {
                            tienThuong = luong * 0.20;
                        } else {
                            tienThuong = luong * 0.25;
                        }
                        tongTienThuong += tienThuong;

                        // Cập nhật thống kê hệ thống
                        tongLuong += luong;
                        if (soNhanVien == 0) {
                            luongCaoNhat = luong;
                            luongThapNhat = luong;
                        } else {
                            if (luong > luongCaoNhat) luongCaoNhat = luong;
                            if (luong < luongThapNhat) luongThapNhat = luong;
                        }

                        soNhanVien++;
                    }
                    break;

                case 2:
                    if (soNhanVien == 0) {
                        System.out.println("Chưa có dữ liệu");
                    } else {
                        double luongTrungBinh = tongLuong / soNhanVien;
                        System.out.println("Số nhân viên đã nhập : " + soNhanVien);
                        System.out.printf("Lương trung bình     : %,.0f VNĐ\n", luongTrungBinh);
                        System.out.printf("Lương cao nhất       : %,.0f VNĐ\n", luongCaoNhat);
                        System.out.printf("Lương thấp nhất      : %,.0f VNĐ\n", luongThapNhat);
                        System.out.printf("Tổng tiền lương      : %,.0f VNĐ\n", tongLuong);
                    }
                    break;

                case 3:
                    System.out.println("\n--- Tổng tiền thưởng ---");
                    if (soNhanVien == 0) {
                        System.out.println("Chưa có dữ liệu");
                    } else {
                        System.out.printf("Tổng số tiền thưởng cho toàn bộ nhân viên: %,.0f VNĐ\n", tongTienThuong);
                    }
                    break;

                case 4:
                    System.out.println("\nĐã thoát chương trình. Tạm biệt!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập từ 1 đến 4.");
            }
        }
    }
}
