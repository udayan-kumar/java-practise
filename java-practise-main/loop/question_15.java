//find the greatest common divisior of two integer using a loop

package loop;

import java.util.*;


public class question_15 {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        int dividend = ud.nextInt();
        int divisor = ud.nextInt();
        
        
        // if(dividend % divisor == 0){

        // }

        while(divisor != 0){
            int value = divisor;
            divisor = dividend % divisor;
            dividend = value;
        }
        System.out.println(dividend);
    }
}

