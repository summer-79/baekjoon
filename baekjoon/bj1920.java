/*
N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.
* */

import java.util.Arrays;
import java.util.Scanner;

public class bj1920 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n, m, i, j, min, tmp, check;
        n = s.nextInt();
        int[] arr_n = new int[n];
        for(i = 0; i<n; i++)
            arr_n[i] = s.nextInt();
        Arrays.sort(arr_n);

        m = s.nextInt();
        int[] arr_m = new int[m];
        for(i = 0; i<m; i++)
            arr_m[i] = s.nextInt();


        int left, right, mid;
        for(i = 0; i<m; i++){
            check = 0;
            left = 0; right = n-1;
            mid = (int)(left+right)/2;
            while(left <=right){

                if(arr_m[i] == arr_n[mid]){
                    check = 1;
                    break;
                }
                if(arr_m[i]>arr_n[mid]) left = mid+1;
                if(arr_m[i]<arr_n[mid]) right = mid-1;
                mid = (int)(left+right)/2;
            }
            System.out.println(check);
        }
    }
}
