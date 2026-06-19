package loop;

import java.util.Scanner;

public class question_13 {
    public static void main(String[] args) {
        Scanner ud = new Scanner(System.in);

        System.out.print("enter the number: ");
        int n = ud.nextInt();

        for(int i =1; i<=n; i++){
            if(n%i == 0){
              for(int j= 1; j<=i; j++){
                int div= n/j;
                System.out.println(div);
              }
                
              }
            
        }
    }
}
