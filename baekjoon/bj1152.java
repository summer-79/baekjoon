/*
* 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int sum = 0, pre_blank = 1;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == ' ')
                pre_blank = 1;
            else if(pre_blank == 1) {
                sum++;
                pre_blank = 0;
            }
        }
        System.out.println(sum);
    }
}
