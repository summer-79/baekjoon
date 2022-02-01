/*
* 한수는 지금 (x, y)에 있다. 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다. 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
* */
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int x, y, w, h, a, b, res;
        x = s.nextInt();
        y = s.nextInt();
        w = s.nextInt();
        h = s.nextInt();
        a = Math.abs(x-w);
        b = Math.abs(y-h);
        a = a<x?a:x;
        b = b<y?b:y;
        res = a<b?a:b;
        System.out.println(res);
    }
}