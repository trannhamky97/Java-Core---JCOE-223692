package truuTuong;

public abstract class HinhHoc {
    int chieuDai;
    int chieuRong;
    int banKinh;

    public void tinhChuVi(){
        System.out.println("Chu vi hinh hoc ...");
    }

    public abstract void tinhDienTich();
}
