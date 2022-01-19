/*
알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args){

        try{
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

            String input = buffer.readLine();
            System.out.println((int)input.charAt(0));

        }catch(IOException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}