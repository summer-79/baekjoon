/*
* n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
*/
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int sum, n;
        sum = 0;
        n = s.nextInt();
        for(int i = 0; i<n;)
            sum += ++i;
        System.out.println(sum);
    }
}