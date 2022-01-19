/*
두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args){

        try{
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

            String input = buffer.readLine();
            String [] input_arr = input.split(" ");
            int a = Integer.parseInt(input_arr[0]);
            int b = Integer.parseInt(input_arr[1]);

            System.out.println(a+b);
            System.out.println(a-b);
            System.out.println(a*b);
            System.out.println(a/b);
            System.out.println(a%b);

        }catch(IOException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}