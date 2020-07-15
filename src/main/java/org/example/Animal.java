package org.example;

public class Animal implements IAnimal,IDog {
    String name;
    int tuoi;
    int soChan;

    public void themDongVat(){
        System.out.println("Them dong vat vao trong danh sach...");
    }

    public Animal(){
        System.out.println("Khoi tao ham tao Animal...");
    }

    public void tinhTuoi(){}

    public void timKiemThongTin(){}

    @Override // đa kế thừa - 1 lớp có thể kế thừa nhiều interface
    public void demCho() {

    }
}
