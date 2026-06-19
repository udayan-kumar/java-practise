// print the first N numbers in the fibonacci series

package loop;

import java.util.Scanner;

public class question_14 {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter the number: ");
        int n = ud.nextInt();
        int num = 0;
        int facc = 1;
        int faccsum ;
        int count=1;

        while(count!=0){
            faccsum = num +facc;
            System.out.println(faccsum);
            num = facc;
            facc= count;
            count++;
        }
    }
}
