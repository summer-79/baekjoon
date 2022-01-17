/*
* 세 자리 수 곱셈
 */

import java.util.Scanner;

public class Main {
    static int n = 3;
    static int []arr = new int[n];

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a, sb, sum = 0, len;
        String str;

        a = s.nextInt();
        str = s.next();
        len = str.length();
        for(int i = 0; i<len; i++) {
            sb = a*((int) str.charAt(len-i-1) - 48);
            System.out.println(sb);
            sum += sb*(int)Math.pow(10, i);
        }

        System.out.println(sum);
    }
}