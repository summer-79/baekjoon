/*
알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.

1. 길이가 짧은 것부터
2. 길이가 같으면 사전 순으로
*/
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String []str = new String[n];
        int i, j, min;
        for(i = 0; i<n; i++)
            str[i] = s.next();
        String temp;
        for(i = 0; i<n-1; i++){
            min = i;
            for(j = i+1; j<n; j++){
                if(str[min].equals(str[j])) {
                    str[j] ="";
                    continue;
                }
                if(str[min].length()>str[j].length())
                    min = j;
                if(str[min].length()==str[j].length() && str[min].compareTo(str[j])>0)
                    min = j;
            }
            if(min != i){
                temp = str[i];
                str[i] = str[min];
                str[min] = temp;
            }
        }
        for(i = 0; i<n; i++)
            if(str[i]!="")
                System.out.println(str[i]);
    }
}
