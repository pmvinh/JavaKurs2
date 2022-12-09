package java1_4;

import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("size");
        int size = s.nextInt();
        int numbers [] = new int[size];
        System.out.println("enter");
        for (int i = 0; i < size; i++) {
            numbers[i] = s.nextInt();
        }
        int min= numbers[0];
        int max= numbers[0];
        for(int i=0;i<numbers.length;i++){
           if(numbers[i] < min){
               min = numbers[i];
           }
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("1)While");
        System.out.println("2)Do while");
        int chose = s.nextInt();
        switch (chose) {
            case 1 -> {
                int value1 = 0, j = 0;
                while (j < size) {
                    value1 += numbers[j];
                    j++;
                }
                System.out.println("Sum while  " + value1);
            }
            case 2 -> {
                int value2 = 0, v = 0;
                do {
                    value2 += numbers[v];
                    v++;
                } while (v < size);
                System.out.println("Sum do while " + value2);
            }
        }
        System.out.println("Min: " +min);
        System.out.println("Max: " +max);
    }
}