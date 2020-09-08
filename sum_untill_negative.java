import java.util.*;
public class sum_untill_negative {
    public static void main(String args[]){
        int new_n,temp=0;
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        while(number>0){
            temp+=number;
            new_n= sc.nextInt();
            number = new_n;

      }
      System.out.println(temp);
    
}
}