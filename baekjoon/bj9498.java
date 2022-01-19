/*
시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args){

        try{
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            int score = Integer.parseInt(buffer.readLine());
            String grade = "";
            switch((int)score/10){
                case 10:
                    grade= "A";
                    break;
                case 9:
                    grade= "A";
                    break;
                case 8:
                    grade= "B";
                    break;
                case 7:
                    grade= "C";
                    break;
                case 6:
                    grade= "D";
                    break;
                default:
                    grade = "F";
                    break;
            }

            System.out.println(grade);
        }catch(IOException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}