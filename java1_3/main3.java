package java1_3;

public class main3 {
    public static void main(String[] args) {
        int[] nums={1, 2, 3, 4, 5};
        int result=0;
        for( int m: nums){
            result+=m;
        }
        System.out.println("Sum: "+result);
        System.out.println("Balance: "+result/nums.length);
    }
}
