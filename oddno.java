import java.util.*;

public class oddno {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int i=sc.nextInt();
        for(int j=1; j<=i; j++){
            if (j%2!=0){
                System.out.println(j);
            }
        }
    }

    
}