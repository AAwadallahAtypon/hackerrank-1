import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day_9_recursion {
    private static int factorial(int n){
        
        if(n > 1){ // recursive case
            return  n * factorial(n - 1);
        }
        else{ // base case n = 1
            return 1;
        }
}
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n = scan.nextInt();
        int sum = factorial(n);
        System.out.print(sum);
    }
}
