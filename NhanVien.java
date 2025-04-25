package congty;

public class NhanVien {
	private String tenNhanVien;
    private static double luongCoBan = 1.2 ;
    private double heSoLuong;
    public static final double LUONG_MAX = 20;
    
    public NhanVien() {
        this.tenNhanVien = "NONAME";
        this.heSoLuong = 1.0;
    }

    public NhanVien(String tenNhanVien,double heSoLuong){
        this.tenNhanVien=tenNhanVien;
        this.heSoLuong=heSoLuong;
    }

    public String getTenNhanVien() {
		return tenNhanVien;
	}

	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}

	public static double getLuongCoBan() {
		return luongCoBan;
	}

	public static void setLuongCoBan(double luongCoBan) {
		if(luongCoBan>0) {
		NhanVien.luongCoBan = luongCoBan;
	    }
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		if(heSoLuong>0) {
		this.heSoLuong = heSoLuong;
		}
	}

	public static double getLuongMax() {
		return LUONG_MAX;
	}

	public double tinhLuong(){
        return luongCoBan*this.heSoLuong;
    }

    public void inTTin(){
        System.out.print("Nhan vien " + this.tenNhanVien +" co: "
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
