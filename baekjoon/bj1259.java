/*
 * 어떤 단어를 뒤에서부터 읽어도 똑같다면 그 단어를 팰린드롬이라고 한다. 'radar', 'sees'는 팰린드롬이다.

수도 팰린드롬으로 취급할 수 있다. 수의 숫자들을 뒤에서부터 읽어도 같다면 그 수는 팰린드롬수다. 121, 12421 등은 팰린드롬수다. 123, 1231은 뒤에서부터 읽으면 다르므로 팰린드롬수가 아니다. 또한 10도 팰린드롬수가 아닌데, 앞에 무의미한 0이 올 수 있다면 010이 되어 팰린드롬수로 취급할 수도 있지만, 특별히 이번 문제에서는 무의미한 0이 앞에 올 수 없다고 하자.
*  */
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        String num;
        int i, len, check;
        do{
            num = s.next();
            if(num.equals("0")) break;
            check = 0;
            len = num.length();
            for(i = 0;i<len/2; i++){
                if(num.charAt(i) != num.charAt(len-i-1)) {
                    check = 1;
                    break;
                }
            }
            if(check == 1)  System.out.println("no");
            else  System.out.println("yes");
        }while(!num.equals("0"));
    }
}