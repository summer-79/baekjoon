/*
자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args){

        try{
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

            String input = buffer.readLine();
            int n = Integer.parseInt(input);
            for(int i = 1; i<=n; i++)
                System.out.println(i);

        }catch(IOException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}