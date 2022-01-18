/*
 * 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
 * */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine().toUpperCase().replace(" ","");
        int [] count = new int[27]; // 단어에서 사용된 알파벳개수 저장
        int i, len = str.length(), max = 0, onemore = 0;

        count[0] = -1;
        for(i = 0; i<len;i++)
            count[(int)str.charAt(i)-65+1]++;

        for(i = 0; i<27; i++) {
            if (count[i] >= count[max]) {
                if(count[max] == count[i])
                    onemore = 1;
                else onemore = 0;
                max = i;
            }
        }
        if(count[max] != -1 && onemore == 0)
            System.out.println((char)(65+max-1));
        else
            System.out.println("?");

    }
}
