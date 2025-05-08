package congty;
import congty.CongTy;
public class GiamDoc extends CanBoCoHuu implements QuanLy {
    private double phuCap;
    public GiamDoc(String tenNhanVien, double heSoLuong, double phuCap){
        super(tenNhanVien, heSoLuong);
        this.phuCap=phuCap;
    }
    public double tinhHoaHong(){
        return 0.05*CongTy.loiNhuan;
    }

    public double tinhLuong(){
        return super.tinhLuong() + phuCap + tinhHoaHong();
    }
}
