/*
 * JOI군은 카드 게임을 하고 있다. 이 카드 게임은 5회의 게임으로 진행되며, 그 총점으로 승부를 하는 게임이다.
 * JOI군의 각 게임의 득점을 나타내는 정수가 주어졌을 때, JOI군의 총점을 구하는 프로그램을 작성하라.
 *
 */
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int sum = s.nextInt();
        for(int i = 0; i<4; i++)
            sum += s.nextInt();
        System.out.println(sum);
    }
}
