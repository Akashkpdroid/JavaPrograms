import java.util.*;
public class dataio {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name age height address");
        String name=sc.nextLine();
        int age=sc.nextInt();
        double height=sc.nextDouble();
        sc.nextLine();
        String address=sc.nextLine();
        
        System.out.println("name is"+name+" age is " +age + " height is " + height + " address is " + address);

    }
}