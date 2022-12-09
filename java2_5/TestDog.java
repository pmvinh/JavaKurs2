package java2_5;

import java.util.Scanner;

public class TestDog {
    public static void main(String[] args) {
        Dog[] list = new Dog[4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of dogs");
        int j = sc.nextInt();
        sc.nextLine();
        String tempName;
        int tempAge;
        for(int i = 0; i < j; i++){
            System.out.println("Enter the dog's name");
            tempName = sc.nextLine();
            System.out.println("Enter the dog's age");
            tempAge = sc.nextInt();
            list[i] = new Dog(tempName, tempAge);
            sc.nextLine();
        }
        System.out.println("Age of dog 1 "+ list[0].getName() + " In human counting: " + list[0].toHumanAge());
        System.out.println("Age of dog 2 "+ list[1].getName() + " In human counting: " + list[1].toHumanAge());
        System.out.println("Age of dog 3 "+ list[2].getName() + " In human counting: " + list[2].toHumanAge());
        System.out.println("Age of dog 4 "+ list[3].getName() + " In human counting: " + list[3].toHumanAge());
        System.out.println("Age of dog 5 "+ list[4].getName() + " In human counting: " + list[4].toHumanAge());
    }
}