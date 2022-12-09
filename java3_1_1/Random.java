package java3_1_1;

import java.lang.Math;
import java.util.Scanner;

public class Random {
    //Menu operation
    public static void menu() {
        System.out.print("\n");
        System.out.print("Menu: \n" +
                "Enter 0 if you want to exit operations\n" +
                "Enter 1 if you want to sort an array generated randomly using the random() method of the Math class\n" +
                "Enter 2 if you want to sort an array generated randomly using the Random class\n" +
                "Enter: ");
    }
    //Buble sort
    public static void bubble_Sort(int[] arr) {
        for (int i = arr.length - 1 ; i > 0 ; i--) {
            for (int j = 0 ; j < i ; j++) {
                if( arr[j] > arr[j + 1] ) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public static void arr_Math() {
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int)(Math.random() * 100);
        System.out.print("Random massiv:\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
        bubble_Sort(arr);
        System.out.print("Sort massiv:\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }

    public static void arr_Random() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.print("Random massiv:\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
        bubble_Sort(arr);
        System.out.print("Sort massiv:\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        menu();
        int pos;
        Scanner scan = new Scanner(System.in);
        do {
            pos = scan.nextInt();
            switch (pos) {
                case 0:
                    break;
                case 1:
                    arr_Math();
                    menu();
                    break;
                case 2:
                    arr_Random();
                    menu();
                    break;
                default:
                    System.out.println("Failed");
                    menu();
                    break;
            }

        }
        while (pos != 0);
    }
}
