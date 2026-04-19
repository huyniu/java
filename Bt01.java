package baitapss3;
import java.util.Scanner;
public class Bt01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tên khách hàng: ");
        String tenKhachHang = scanner.nextLine();

        System.out.print("Tên sản phẩm: ");
        String tenSanPham = scanner.nextLine();

        System.out.print("Giá sản phẩm (VNĐ): ");
        double giaSanPham = scanner.nextDouble();

        System.out.print("Số lượng mua: ");
        int soLuong = scanner.nextInt();

        System.out.print("Khách có thẻ thành viên không? (true/false): ");
        boolean isThanhVien = scanner.nextBoolean();

        double thanhTien = giaSanPham * soLuong;

        double giamGia = isThanhVien ? (thanhTien * 0.10) : 0;

        double tienSauGiamGia = thanhTien - giamGia;
        double vat = tienSauGiamGia * 0.08;

        double tongThanhToan = thanhTien - giamGia + vat;
        System.out.println("          HÓA ĐƠN THANH TOÁN            ");
        System.out.printf("%-20s: %s\n", "Tên khách hàng", tenKhachHang);
        System.out.printf("%-20s: %s\n", "Tên sản phẩm", tenSanPham);
        System.out.printf("%-20s: %d\n", "Số lượng", soLuong);
        System.out.printf("%-20s: %,.0f VNĐ\n", "Đơn giá", giaSanPham);
        System.out.printf("%-20s: %,.0f VNĐ\n", "Thành tiền", thanhTien);
        System.out.printf("%-20s: %,.0f VNĐ\n", "Giảm giá (Thành viên)", giamGia);
        System.out.printf("%-20s: %,.0f VNĐ\n", "Thuế VAT (8%)", vat);
        System.out.printf("%-20s: %,.0f VNĐ\n", "TỔNG THANH TOÁN", tongThanhToan);

        scanner.close();
    }
}
