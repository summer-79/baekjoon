/*
알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        String input = s.next();
        int i, idx;
        int [] count = new int[26];
        Arrays.fill(count, -1);

        for(i = 0; i<input.length(); i++) {
            idx = (int) input.charAt(i) - 97;
            if(count[idx]==-1)  count[idx]=i;
        }

        for(i = 0; i<count.length; i++)
            System.out.print(count[i] + " ");

    }
}
