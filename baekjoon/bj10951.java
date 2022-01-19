/*
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args){

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        int a, b;
        try{
            for(int i = 0; (input=buffer.readLine())!=null; i++){
                a = (int)input.charAt(0)-48;
                b = (int)input.charAt(2)-48;
                System.out.println(a+b);
            }
        }catch(IOException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}