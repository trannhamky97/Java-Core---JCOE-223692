package org.example;

import java.awt.*;

public class DemoLoop {
    public static void main( String[] args ) {
//        for(int i = 0; i<10 ; i++){
//            System.out.println("Vong lap thu: " + (i+1));
//        }
        int i = -1;
//        while (i<10){
//            System.out.println("So chan: "+i);
//            i+=2;
//        }

        do{
           System.out.println(i);
           i+= 2;
        }while (i> 0 && i <10);
    }

}
