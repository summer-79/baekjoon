/*
지민이는 자신의 저택에서 MN개의 단위 정사각형으로 나누어져 있는 M×N 크기의 보드를 찾았다. 어떤 정사각형은 검은색으로 칠해져 있고, 나머지는 흰색으로 칠해져 있다. 지민이는 이 보드를 잘라서 8×8 크기의 체스판으로 만들려고 한다.

체스판은 검은색과 흰색이 번갈아서 칠해져 있어야 한다. 구체적으로, 각 칸이 검은색과 흰색 중 하나로 색칠되어 있고, 변을 공유하는 두 개의 사각형은 다른 색으로 칠해져 있어야 한다. 따라서 이 정의를 따르면 체스판을 색칠하는 경우는 두 가지뿐이다. 하나는 맨 왼쪽 위 칸이 흰색인 경우, 하나는 검은색인 경우이다.

보드가 체스판처럼 칠해져 있다는 보장이 없어서, 지민이는 8×8 크기의 체스판으로 잘라낸 후에 몇 개의 정사각형을 다시 칠해야겠다고 생각했다. 당연히 8*8 크기는 아무데서나 골라도 된다. 지민이가 다시 칠해야 하는 정사각형의 최소 개수를 구하는 프로그램을 작성하시오.
*/
import java.util.Scanner;

public class Main {
    public static boolean check(char F, char L, int n, String chess, int i, int j) {
        char chr = chess.charAt(j);
        if (i % 2 == 1 && j % 2 == 1 && chr != F)
            return true;
        if (i % 2 == 1 && j % 2 == 0 && chr != L)
            return true;
        if (i % 2 == 0 && j % 2 == 1 && chr != L)
            return true;
        if (i % 2 == 0 && j % 2 == 0 && chr != F)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        String[] chess = new String[n];
        int i, j, x, y, white_first, black_first, min=100;
        s.nextLine();
        for (i = 0; i < n; i++)
            chess[i] = s.next();

        int[][] white = new int[n][m];
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (check('W', 'B', n, chess[i], i, j))
                    white[i][j]++;
            }
        }
        int[][] black = new int[n][m];
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (check('B', 'W', n, chess[i], i, j))
                    black[i][j]++;
            }
        }

        for (i = 0; i < n-7; i++) {
            for(j = 0; j<m-7; j++) {
                white_first = 0;
                for(x = 0; x<8; x++)
                    for(y=0;y<8;y++)
                        if(white[i+x][j+y]==1) white_first++;
                if(min>white_first) min = white_first;
            }
        }

        for (i = 0; i < n-7; i++) {
            for(j = 0; j<m-7; j++) {
                black_first = 0;
                for(x = 0; x<8; x++)
                    for(y=0;y<8;y++)
                        if(black[i+x][j+y]==1) black_first++;
                 if(min>black_first) min = black_first;
            }
        }
        System.out.print(min);
    }
}