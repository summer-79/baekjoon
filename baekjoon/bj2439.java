/*
첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 0; i<n; i++) {
            for (int j = 0; j < n-i-1; j++)
                System.out.print(" ");
            for (int j = n-i-1; j < n; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}