/*
정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args){

        try{
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            String [] input = buffer.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int x = Integer.parseInt(input[1]);
            int number;
            String[] num = buffer.readLine().split(" ");
            for(int i = 0; i<n; i++){
                number = Integer.parseInt(num[i]);
                if(number<x)
                    System.out.print(number + " ");
            }
        }catch(IOException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}