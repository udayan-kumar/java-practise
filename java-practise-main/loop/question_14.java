// print the first N numbers in the fibonacci sweies

package loop;

import java.util.Scanner;

public class question_14 {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter the number: ");
        int n = ud.nextInt();
        int num = 0;
        int faccsum = 1;

        for(int i = 0; i<=n; i++){
            int facc = num+i;
            int sum = facc + faccsum;
            int finsum = sum +i;

            faccsum = i;
            
            System.out.println(finsum);
        }
    }
}
