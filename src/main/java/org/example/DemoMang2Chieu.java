package org.example;
public class DemoMang2Chieu {

    public static void main(String[] args) {
        int[] arrayInteger = {1, 6, 2, 3, 4, 5};//{1,2,3,4,5,6}

        for (int i = 0; i < arrayInteger.length; i++) {
            for (int j = i + 1; j < arrayInteger.length; j++) {
                if (arrayInteger[i] > arrayInteger[j]) {
                    //Swap 2 elements
                    int temp = arrayInteger[i];
                    arrayInteger[i] = arrayInteger[j];
                    arrayInteger[j] = temp;
                }
            }
        }

        for(int k = 0; k< arrayInteger.length; k++){
            System.out.print(arrayInteger[k] + " ,");
        }

    }
}

