package BaiTap;

import org.example.Student;

import java.util.ArrayList;

public class Controller {
    public static void main(String[] args) {
        ArrayList<HocSinh> dsHocSinh = new ArrayList<HocSinh>();
        HocSinh hv1 = new HocSinh("hv01", "An", "Toan", 10.0f);
        HocSinh hv2 = new HocSinh("hv02", "Binh", "Toan", 8.0f);
        HocSinh hv3 = new HocSinh("hv03", "Chau", "Toan", 5.0f);

        dsHocSinh.add(hv1);
        dsHocSinh.add(hv2);
        dsHocSinh.add(hv3);
//        for(int i = 0; i< dsHocSinh.size(); i++){
//            System.out.println(dsHocSinh.get(i).tenHocSinh);
//        }

        for (HocSinh s : dsHocSinh) {
            System.out.println(s.tenHocSinh);
        }
    }
}
