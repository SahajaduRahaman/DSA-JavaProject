package DSA.Basic;

import java.util.Scanner;

public class CheckPrime {
    public static boolean checkPrime(int n){
        if(n <= 1){
            return false;
        }
        if(n == 2){
            return true;
        }
        if(n % 2 == 0){
            return false;
        }
        for(int i = 3; i <= (int) Math.sqrt(n); i+= 2){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int sum = 0;
            int n = sc.nextInt();
            for(int i=0; i<=n; i++) {
                if (checkPrime(i)) {
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
