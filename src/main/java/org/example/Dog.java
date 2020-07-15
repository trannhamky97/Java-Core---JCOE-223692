package org.example;

public class Dog extends Animal implements IDog {
    String mauLong;

    public void xoaMotDoiTuongDog(){

    }
    //override ghi đè - xảy ra trong mối quan hệ kế thừa
    public void themDongVat(){
        System.out.println("Them mot con cho vao trong danh sach...");
    }
}
