import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var arrNhanVienFulltime = new NhanVienFullTime[1];
        var arrNhanVienPartTime = new NhanVienPartTime[1];
        arrNhanVienFulltime[0] = new NhanVienFullTime(1, "viet", 18, 9, "dfff@gmail.com", 6, 7, 8);
        arrNhanVienPartTime[0] = new NhanVienPartTime(1, "huy", 18, 9, "dffe3ff@gmail.com", 6);
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1.Thêm nhân viên full time");
            System.out.println("2.Thêm nhân viên part time");
            System.out.println("3.Liệt kê");
            System.out.println("4.Show");
            System.out.println("5.Exit");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    arrNhanVienFulltime = Manager.create(arrNhanVienFulltime);
                    break;
                case 2:
                    arrNhanVienPartTime = Manager.create1(arrNhanVienPartTime);
                    break;
                case 3 :
                    int luongTBfulltime;
                    int luongTBparttime;
                    int luongTB;
                    int sum1=0;
                    int sum = 0;
                    for (int i = 0; i < arrNhanVienFulltime.length; i++) {
                        sum+=(arrNhanVienFulltime[i].luongCung+ arrNhanVienFulltime[i].tienThuong- arrNhanVienFulltime[i].tienPhat);
                    }
                    luongTBfulltime = sum/arrNhanVienFulltime.length;
                    for (int i = 0; i < arrNhanVienPartTime.length ; i++) {
                        sum1+=100*arrNhanVienPartTime[i].soGioLamViec;
                    }
                    luongTBparttime = sum1/arrNhanVienPartTime.length;
                    luongTB = (luongTBfulltime+luongTBparttime)/2;
                    for (int i = 0; i < arrNhanVienFulltime.length; i++) {
                        if ((arrNhanVienFulltime[i].luongCung+arrNhanVienFulltime[i].tienThuong-arrNhanVienFulltime[i].tienPhat)<luongTB) {
                            System.out.println(arrNhanVienFulltime[i]);
                        }
                    }
                case 4:
                    for (NhanVienFullTime s : arrNhanVienFulltime) {
                        System.out.println(s);
                    }
                    for (NhanVienPartTime s : arrNhanVienPartTime) {
                        System.out.println(s);
                    }
                    break;
                case 5:
                    System.exit(0);
            }
        } while (true);
    }
}