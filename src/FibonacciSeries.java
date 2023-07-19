import java.util.Scanner;

public class FibonacciSeries {
    public static int fibnoacciSeries(int num){
        if(num==0){
            return 0;
        }
        if(num==1){
            return 1;
        }
        return fibnoacciSeries(num-1)+fibnoacciSeries(num-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int num=sc.nextInt();
        int val=fibnoacciSeries(num);
        System.out.println(val);
    }
}