package truuTuong;

public class Controller {
    public static void main(String[] args) {
        HinhHoc ht = new HinhTron();
        ht.tinhDienTich();

        ht = new HinhChuNhat();
        ht.tinhDienTich();

    }
}
