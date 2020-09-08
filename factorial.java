import java.util.*;
public class factorial {
    public static void main(String args[]){
        int temp=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for factorial: ");
        int i=sc.nextInt();
        for(int k=1; k<=i; k++){
            temp = temp*k;
        }
        System.out.println(temp);


}
}