/*
N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args){

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        try{
            int n = Integer.parseInt(buffer.readLine());
            String input = buffer.readLine();
            for(int i = 0; i<n;i++){
                sum += (int)input.charAt(i)-48;
            }
        }catch(IOException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println(sum);
    }
}