/*
* 여러분도 알다시피 여러분의 프린터 기기는 여러분이 인쇄하고자 하는 문서를 인쇄 명령을 받은 ‘순서대로’, 즉 먼저 요청된 것을 먼저 인쇄한다. 여러 개의 문서가 쌓인다면 Queue 자료구조에 쌓여서 FIFO - First In First Out - 에 따라 인쇄가 되게 된다. 하지만 상근이는 새로운 프린터기 내부 소프트웨어를 개발하였는데, 이 프린터기는 다음과 같은 조건에 따라 인쇄를 하게 된다.

현재 Queue의 가장 앞에 있는 문서의 ‘중요도’를 확인한다.
나머지 문서들 중 현재 문서보다 중요도가 높은 문서가 하나라도 있다면, 이 문서를 인쇄하지 않고 Queue의 가장 뒤에 재배치 한다. 그렇지 않다면 바로 인쇄를 한다.
예를 들어 Queue에 4개의 문서(A B C D)가 있고, 중요도가 2 1 4 3 라면 C를 인쇄하고, 다음으로 D를 인쇄하고 A, B를 인쇄하게 된다.

여러분이 할 일은, 현재 Queue에 있는 문서의 수와 중요도가 주어졌을 때, 어떤 한 문서가 몇 번째로 인쇄되는지 알아내는 것이다. 예를 들어 위의 예에서 C문서는 1번째로, A문서는 3번째로 인쇄되게 된다.
* */
import java.util.Scanner;

class Queue{
    int front = 0, rear = 0;
    int [] que = new int[100];
    public void add(int n){
        que[front++] = n;
    }
    public int delete(){
        return que[--front];
    }
    public int show(int idx){
        return que[idx];
    }
    public void clear(){
        front = 0;
        rear = 0;
    }
}
public class bj1966 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        Queue q = new Queue();
        int n, i, m, idx, op, res, cur;
        try {
            n = s.nextInt();
            for (i = 0; i < n; i++) {
                m = s.nextInt();
                idx = s.nextInt();
                for (i = 0; i < m; i++)
                    q.add(s.nextInt());
                op = q.show(idx);

                res = 1;
                for (; q.front>0; ) {
                    cur = q.delete();
                    if (cur > op) res++;
                    else if (cur == op && idx < i)  res++;
                    else    q.add(cur);
                }
                System.out.println(res);
                q.clear();
            }
        }catch(Exception e){
            System.out.print("");
        }
    }
}