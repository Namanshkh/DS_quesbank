import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = factorial(n);
        System.out.println(x);
    }

    public static int factorial(int n){
        if(n==0)
        {
            return 1;
        }
        int temp = n*factorial(n-1);
        return temp ;
    }

}
