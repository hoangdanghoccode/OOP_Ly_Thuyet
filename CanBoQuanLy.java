package congty;
import congty.CanBoCoHuu;
import congty.QuanLy;
import congty.CongTy;
public class CanBoQuanLy extends CanBoCoHuu implements QuanLy{
    public CanBoQuanLy(String tenNhanVien,double heSoLuong){
        super(tenNhanVien, heSoLuong);
    }
    public double tinhHoaHong(){
        return 0.002*CongTy.loiNhuan;
    }

    public double tinhLuong(){
        return super.tinhLuong() + tinhHoaHong();
    }
}
