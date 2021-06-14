import java.util.Scanner;

public class Manager {
    public static NhanVienFullTime[] create(NhanVienFullTime[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Id:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập Name:");
        String name = sc.nextLine();
        System.out.println("Nhập Age:");
        int age = sc.nextInt();
        System.out.println("Nhập PhoneNumber:");
        int phoneNumber = sc.nextInt();
        System.out.println("Nhập email");
        String email = sc.next();
        System.out.println("Nhập tiền thưởng");
        int tienThuong = sc.nextInt();
        System.out.println("Nhập tiền phạt");
        int tienPhat = sc.nextInt();
        System.out.println("Nhập lương cứng");
        int luongCung = sc.nextInt();
        NhanVienFullTime nhanVienFullTime = new NhanVienFullTime(id,name,age,phoneNumber,email,tienThuong,tienPhat,luongCung);
        NhanVienFullTime[] arrNew = new NhanVienFullTime[arr.length+1];

        for (int i = 0;i<arr.length;i++) {
            arrNew[i] = arr[i];
        }

        arrNew[arrNew.length-1] = nhanVienFullTime;

        return arrNew;
    }
    public  static NhanVienFullTime[] delete(NhanVienFullTime[] arr,int num){
       NhanVienFullTime[] arrNew = new NhanVienFullTime[arr.length-1];
        for (int i = 0; i < num; i++) {
            arrNew[i]=arr[i];
        }
        for (int j=num ; j< arrNew.length-1;j++ ){
            arrNew[j]=arr[j+1];
        }
        return arrNew;
    }
    public static NhanVienPartTime[] create1(NhanVienPartTime[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Id:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập Name:");
        String name = sc.nextLine();
        System.out.println("Nhập Age:");
        int age = sc.nextInt();
        System.out.println("Nhập PhoneNumber:");
        int phoneNumber = sc.nextInt();
        System.out.println("Nhập email");
        String email = sc.nextLine();
        System.out.println("Nhập số giờ làm việc");
        int soGioLamViec = sc.nextInt();
        NhanVienPartTime nhanVienPartTime = new NhanVienPartTime(id,name,age,phoneNumber,email,soGioLamViec);
        NhanVienPartTime[] arrNew = new NhanVienPartTime[arr.length+1];

        for (int i = 0;i<arr.length;i++) {
            arrNew[i] = arr[i];
        }

        arrNew[arrNew.length-1] = nhanVienPartTime;

        return arrNew;
    }

}