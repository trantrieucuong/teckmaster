import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập tên hàng nhập kho
        System.out.print("Mời bạn nhập tên hàng nhập kho: ");
        String tenHangNhapKho = scanner.nextLine();

        // Nhập ngày tháng năm sinh
        System.out.print("Mời bạn nhập ngày tháng năm sinh (yyyy/MM/dd): ");
        String ngayThangNamSinhStr = scanner.nextLine();

        // Nhập thời gian nhập hàng
        System.out.print("Mời bạn nhập thời gian nhập hàng (yyyy/MM/dd HH:mm:ss): ");
        String thoiGianNhapHangStr = scanner.nextLine();

        // Nhập thời gian
        System.out.print("Mời bạn nhập thời gian (HH:mm:ss): ");
        String thoiGianStr = scanner.nextLine();

        // Chuyển đổi các giá trị thời gian về đúng định dạng
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

        Date ngayThangNamSinh = null;
        Date thoiGianNhapHang = null;
        Date thoiGian = null;

        try {
            ngayThangNamSinh = dateFormat.parse(ngayThangNamSinhStr);
            thoiGianNhapHang = dateTimeFormat.parse(thoiGianNhapHangStr);
            thoiGian = timeFormat.parse(thoiGianStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Hiển thị lại các giá trị
        System.out.println("Tên hàng nhập kho: " + tenHangNhapKho);
        System.out.println("Ngày tháng năm sinh: " + dateFormat.format(ngayThangNamSinh));
        System.out.println("Thời gian nhập hàng: " + dateTimeFormat.format(thoiGianNhapHang));
        System.out.println("Thời gian: " + timeFormat.format(thoiGian));
    }
}
