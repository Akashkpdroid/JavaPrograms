import java.util.Scanner;
public class oddno {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the num: ");
        int n=scn.nextInt();
        for(int i=1; i<=n; i++){
            if(i%2==0){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
