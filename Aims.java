package congty;

public class Aims {
    public static void main(String[] args) {
        CongTy congTy = new CongTy();

        NhanVien nv1 = new CanBoCoHuu("Nguyen Van A", 10);
        NhanVien nv2 = new CanBoHopDong("Tran Thi B", 8_000);
        NhanVien nv3 = new TruongPhong("Le Van C", 9, 500);
        NhanVien nv4 = new GiamDoc("Pham Thi D", 12, 2000);
        NhanVien nv5 = new CanBoQuanLy("Do Van E", 11);

        congTy.themNV(nv1);
        congTy.themNV(nv2);
        congTy.themNV(nv3);
        congTy.themNV(nv4);
        congTy.themNV(nv5);

        System.out.println("\n== Thong tin nhan vien ==");
        congTy.inThongTin();

        System.out.println("\n== Tong luong cong ty ==");
        System.out.println(congTy.tinhTongLuong());
    }
}
