package congty;
import java.util.Stack;
public class CongTy {
    private String tenCongTy;
    private int soNhanVien;
    public static final int SO_NV_MAX = 100;
    public static double loiNhuan = 1000;

    Stack<NhanVien> stack = new Stack<>();
    public boolean themNV(NhanVien nv) {
        if(soNhanVien<SO_NV_MAX) {
            stack.push(nv);
            soNhanVien++;
            System.out.println("Them nhan vien "+nv.getTenNhanVien()+" vao cong ty thanh cong");
            return true;
        }
        else {
            System.out.println("Them nhan vien "+nv.getTenNhanVien()+" vao cong ty that bai vi phong ban da day");
        return false;
        }
    }

    public void inThongTin(){
        System.out.println("Cong ty "+ tenCongTy + ":");
        for(NhanVien nv:stack){
            nv.inTTin();
        }
    }

    public double tinhTongLuong(){
        double sum=0;
        for(NhanVien nv:stack){
            sum+=nv.tinhLuong();
        }
        return sum;
    }
}
