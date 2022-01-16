/*
두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
 */
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        String str;
        int res = s.nextInt() - s.nextInt();
        str = res>0?">":res==0?"==":"<";
        System.out.print(str);
    }
}