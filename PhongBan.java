package congty;
import java.util.Stack;
public class PhongBan {
      private String tenPhongBan;
      private int soNhanVien=0;
      public static final int SO_NV_MAX=100;
      public PhongBan(String tenPhongBan) {
    	  this.tenPhongBan = tenPhongBan;
      }
      Stack<CanBoCoHuu> stack = new Stack<>();
      public boolean themNV(CanBoCoHuu nv) {
    	  if(soNhanVien<SO_NV_MAX) {
    		  stack.push(nv);
    		  soNhanVien++;
    		  System.out.println("Them nhan vien "+nv.getTenNhanVien()+" vao phong ban "+tenPhongBan +" thanh cong");
    		  return true;
    	  }
    	  else {
    		  System.out.println("Them nhan vien "+nv.getTenNhanVien()+" vao phong ban "+tenPhongBan + " that bai vi phong ban da day");
    	  return false;
    	  }
      }
      
      public CanBoCoHuu xoaNV() {
    	  if(soNhanVien==0) System.out.println("Phong ban "+tenPhongBan+" khong con nhan vien de xoa.");
    	  else {
    		  soNhanVien--;
    		  System.out.println("Xoa nhan vien khoi phong ban "+tenPhongBan+" thanh cong");
    	  }
    	  return stack.pop();
      }
      
      public double tinhTongLuong() {
    	  double tongluong=0;
    	  for(CanBoCoHuu nv : stack) {
    		  tongluong+=nv.tinhLuong();
    	  }
    	  System.out.println("Phong ban "+tenPhongBan+" co tong luong la: "+tongluong);
    	  return tongluong;
      }
      
      public void inTTin() {
    	  System.out.println("Phong Ban "+tenPhongBan+ " co " + soNhanVien + " nhan vien:");
    	  for(CanBoCoHuu nv: stack) {
    		  nv.inTTin();
    	  }
      }
}
