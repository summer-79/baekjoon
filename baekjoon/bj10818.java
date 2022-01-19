/*
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.*/

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int min = 9999999, max = -1;
        int n = s.nextInt();
        int input;
        for(int i = 0; i<n; i++) {
            input =s.nextInt();
            if(input>max) max = input;
            if(input<min) min = input;
        }
        System.out.print(min + " " + max);
    }
}
