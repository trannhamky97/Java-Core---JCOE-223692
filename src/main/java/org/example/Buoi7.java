package org.example;

public class Buoi7 {
    public void tinhChuVi(int chieuDai, int chieuRong){
        System.out.println((chieuDai+chieuRong)*2);
    }
    public void tinhChuVi(int banKinh){
        System.out.println(2*Math.PI*banKinh);
    }
    public static void main(String[] args) {
        Buoi7 a = new Buoi7();
        a.tinhChuVi(10);
        a.tinhChuVi(10,2);
    }
}
