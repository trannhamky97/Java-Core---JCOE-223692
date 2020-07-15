package org.example;

import java.util.ArrayList;

public class Buoi6 {
    public static void main(String[] args) {
        //String[] myClass = new String[4];

        //Array list - không cần cấp phát bộ nhớ, mảng tự tăng
        //Nhược điểm: tốn thời gian khi Remove
        ArrayList<String> lstMyClass = new ArrayList<String>();
        lstMyClass.add("Hien");
        lstMyClass.add("Duy");
        lstMyClass.add("Huyen");
        lstMyClass.add("Ky");

        for (int i = 0; i < lstMyClass.size(); i++) {
            System.out.println(lstMyClass.get(i));
        }

        //foreach: khai báo biến s có cùng kiểu dữ liệu với danh sách
        for (String s : lstMyClass) {
            System.out.println(s);
            if (s.equals("Huyen")) {
                break;
            }
        }
    }
}
