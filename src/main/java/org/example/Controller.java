package org.example;

public class Controller {
    public static void main(String[] args) {
        //Student s1 = new Student(); // biến instance bộ nhớ heap
        Student s1 = new Student("HS001","Tran Van A", "Toan", 10.0f);
        Student s2 = new Student("HS002","Tran Van B", "Toan", 5.0f);
        Student s3 = new Student("HS003","Tran Van C", "Toan", 8.0f);

        Student[] myArrayString = new Student[3];
        myArrayString[0] = s1;
        myArrayString[1] = s2;
        myArrayString[2] = s3;

        for(int i=0; i< myArrayString.length; i++){
            System.out.print(myArrayString[i].tenHocSinh+" ");
            System.out.print(myArrayString[i].diem+" ");
        }

        for(int i = 0; i< myArrayString.length - 1;i++){
            for(int j = i+1;j<myArrayString.length;j++ ){
                if(myArrayString[i].diem>myArrayString[j].diem){
                    Student tmp = myArrayString[i];
                    myArrayString[i]=myArrayString[j];
                    myArrayString[j]=tmp;
                }
            }
            System.out.println();
        }
        System.out.println("Sau khi sap xep tang dan theo so diem:...");
        for(int i=0; i< myArrayString.length; i++){
            System.out.print(myArrayString[i].tenHocSinh + " ");
            System.out.print(myArrayString[i].diem+" ");
        }

    }

}
