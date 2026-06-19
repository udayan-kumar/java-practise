//find the greatest common divisior of two integer using a loop

package loop;

import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class question_15 {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        int n = ud.nextInt();
        int num = ud.nextInt();

        for(int i =1; i<=n; i++){
            int rem = n%num;
            int hcf = num%rem;
            
            num = hcf;
            System.out.println(num);
        }
    }
}

