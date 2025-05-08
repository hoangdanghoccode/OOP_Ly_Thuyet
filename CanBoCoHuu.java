package congty;
import congty.NhanVien;

public class CanBoCoHuu extends NhanVien {
	
    private static double luongCoBan = 1.2 ;
    private double heSoLuong;
    public static final double LUONG_MAX = 20;
    
    public CanBoCoHuu(String tenNhanVien, double heSoLuong) {
        super(tenNhanVien);
        this.heSoLuong=heSoLuong;
    }

	public double tinhLuong(){
        return luongCoBan*this.heSoLuong;
    }

    public void inTTin(){
        System.out.println("Nhan vien " + super.getTenNhanVien() +" co: "
        + "luong co ban = " + luongCoBan + ", he so luong = " + this.heSoLuong
        + ", luong max = " + LUONG_MAX );
    }

    public boolean tangHeSoLuong(double a){
        if(luongCoBan*(this.heSoLuong+a)>LUONG_MAX){
            return false;
        }
        else{
            this.heSoLuong+=a;
            return true;
        }
    }
}
