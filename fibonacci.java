import java.util.*;
public class fibonacci {
    public static void main(String args[]){
        int a=0, b=1,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term upto which you want series: ");
        int i=sc.nextInt();
        System.out.println("Series :\n"+a+"\n"+b);
        for(int j=0;j<i;j++){
            c=a+b;
            System.out.println(""+c);
            a=b;
            b=c;
        }
    }
    
}