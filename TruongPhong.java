package congty;

public class TruongPhong extends CanBoCoHuu {
      private double phuCap;
         
      public TruongPhong(String tenNhanVien,double heSoLuong,double phuCap) {
    	  super(tenNhanVien,heSoLuong);
    	  this.phuCap=phuCap;
    	
      }
    
	public double tinhLuong(){
		return super.tinhLuong() + phuCap;
	}
	
}
