package congty;
import congty.NhanVien;
public class CanBoHopDong extends NhanVien {
   private double luongHopDong;
   
   public CanBoHopDong(String tenNhanVien, double luongHopDong){
    super(tenNhanVien);
    this.luongHopDong=luongHopDong;
   }

   public double tinhLuong(){
    return luongHopDong;
   }
   
   public void inTTin(){
      System.out.println("Nhan vien " + super.getTenNhanVien() +" co: "
      + "luong = " + tinhLuong());
  }
}
