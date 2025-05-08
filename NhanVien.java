package congty;
public abstract class NhanVien {
    public NhanVien(String tenNhanVien){
        this.tenNhanVien=tenNhanVien;
    }
    private String tenNhanVien;
    public abstract double tinhLuong();
    public void inTTin(){};
    public String getTenNhanVien(){
        return tenNhanVien;
    }
}
