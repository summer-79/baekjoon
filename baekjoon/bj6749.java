/*
 * You know a family with three children. Their ages form an arithmetic sequence: the difference in ages between the middle child and youngest child is the same as the difference in ages between the oldest child and the middle child. For example, their ages could be 5, 10 and 15, since both adjacent pairs have a difference of 5 years.

Given the ages of the youngest and middle children, what is the age of the oldest child?
 */
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println(2*b-a);
    }
}
