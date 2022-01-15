/*
 * Byteland Airlines recently extended their aircraft fleet with a new model of a plane. The new acquisition has n1 rows of seats in the business class and n2 rows in the economic class. In the business class each row contains k1 seats, while each row in the economic class has k2 seats.

Write a program which:

reads information about available seats in the plane,
calculates the sum of all seats available in that plane,
writes the result.
*/
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int [] arr = new int[4];
        for(int i = 0; i<4; i++)
            arr[i] = s.nextInt();
        System.out.println(arr[0]*arr[1]+arr[2]*arr[3]);
    }
}
