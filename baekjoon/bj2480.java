import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int i, j, num, idx=-1, max = -1;
        int[] arr = new int[3];
        for(i = 0; i<3; i++)
            arr[i] = s.nextInt();

        for(i = 0; i<2; i++){
            num = 0;
            for(j = i; j<3; j++)
                if(arr[i] == arr[j])
                    num++;
            if(num>max) {
                max = num;
                idx = i;
                if(num==3) break;
            }
        }
        switch(max){
            case 1:
                i = arr[0]>arr[1]?0:1;
                j = arr[i]>arr[2]?i:2;
                System.out.println(arr[j]*100);
                break;
            case 2:
                System.out.println(1000+100*arr[idx]);
                break;
            case 3:
                System.out.println(10000+1000*arr[idx]);
                break;
        }
    }
}
