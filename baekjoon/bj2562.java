/*
9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.

예를 들어, 서로 다른 9개의 자연수

3, 29, 38, 12, 57, 74, 40, 85, 61

이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int i, n = 9, max = 0;
        int [] number = new int[n];

        for(i=0; i<n;i++) {
            number[i] = s.nextInt();
            if (number[i] > number[max])
                max = i;
        }
        System.out.println(number[max]);
        System.out.println(max+1);
    }
}