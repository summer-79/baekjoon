/*
 * 16진수 수를 입력받아서 10진수로 출력하는 프로그램을 작성하시오.
 */
import java.util.Scanner;
import java.lang.Math;

public class bj1550 {
    public static void main(String [] args){
        int deci = 0;
        Scanner scanner = new Scanner(System.in);
        String hex = scanner.nextLine();
        int length = hex.length();

        int bridge;
        for(int i = 0; i<length; i++) {
            bridge = hex.charAt(i);
            if(47 < bridge && bridge < 58) bridge -= 48;
            else bridge -= 55;
            deci += bridge * (int)Math.pow(16, length-i-1);
        }

        System.out.println(deci);
    }
}
