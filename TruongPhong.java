package congty;

public class TruongPhong extends NhanVien {
      private double phuCap;
      private int soNamDuongChuc;
      
      public TruongPhong() {
    	  super();
    	  this.phuCap=0;
    	  this.soNamDuongChuc=0;
      }
      
      public TruongPhong(String tenNhanVien, double heSoLuong, double phuCap, int soNamDuongChuc) {
    	  super(tenNhanVien,heSoLuong);
    	  this.phuCap=phuCap;
    	  this.soNamDuongChuc=soNamDuongChuc;
      }

	public double getPhuCap() {
		return phuCap;
	}

	public void setPhuCap(double phuCap) {
		this.phuCap = phuCap;
	}

	public int getSoNamDuongChuc() {
		return soNamDuongChuc;
	}

	public void setSoNamDuongChuc(int soNamDuongChuc) {
		this.soNamDuongChuc = soNamDuongChuc;
	}
    
	public double tinhLuong(){
		return super.getLuongCoBan() * super.getHeSoLuong() + phuCap;
	}

	public void inTTin(){
		super.inTTin();
		System.out.println(", phu cap = " + phuCap + ", so nam duong chuc = " + soNamDuongChuc);
	}
	
}
