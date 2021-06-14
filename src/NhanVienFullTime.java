public class NhanVienFullTime extends NhanVien{
    int tienThuong;
    int tienPhat;
    int luongCung;

    public NhanVienFullTime() {
    }
    public NhanVienFullTime (int id , String name , int age , int phoneNumber , String email, int tienThuong , int tienPhat , int luongCung ){
        super(id,name,age,phoneNumber,email);
        this.tienPhat=tienPhat;
        this.tienThuong=tienThuong;
        this.luongCung=luongCung;
    }
    public NhanVienFullTime(int tienThuong, int tienPhat, int luongCung) {
        this.tienThuong = tienThuong;
        this.tienPhat = tienPhat;
        this.luongCung = luongCung;
    }

    public int getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(int tienThuong) {
        this.tienThuong = tienThuong;
    }

    public int getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(int tienPhat) {
        this.tienPhat = tienPhat;
    }

    public int getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(int luongCung) {
        this.luongCung = luongCung;
    }
    public int luongNVfulltime(){
        int x;
        x= luongCung + tienThuong - tienPhat;
        return x;
    }

    @Override
    public String toString() {
        return "NhanVienFullTime{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", tienThuong=" + tienThuong +
                ", tienPhat=" + tienPhat +
                ", luongCung=" + luongCung +
                '}';
    }
}
