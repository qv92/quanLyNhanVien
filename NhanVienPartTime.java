public class NhanVienPartTime extends NhanVien{
    int soGioLamViec;

    public NhanVienPartTime() {
    }
    public NhanVienPartTime(int id , String name , int age , int phoneNumber , String email,int soGioLamViec){
        super(id,name,age,phoneNumber,email);
        this.soGioLamViec=soGioLamViec;
    }
    public NhanVienPartTime(int soGioLamViec) {
        this.soGioLamViec = soGioLamViec;
    }

    public int getSoGioLamViec() {
        return soGioLamViec;
    }

    public void setSoGioLamViec(int soGioLamViec) {
        this.soGioLamViec = soGioLamViec;
    }
    public int luongNVparttime(){
        int x ;
        x = 100000*soGioLamViec;
        return x;

    }

    @Override
    public String toString() {
        return "NhanVienPartTime{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", soGioLamViec=" + soGioLamViec +
                '}';
    }
}
