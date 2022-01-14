/*
*
* 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
*  */
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt();
        System.out.printf("%.16f", (double)a/b);
    }
}
