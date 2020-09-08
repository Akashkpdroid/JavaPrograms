import java.util.*;

public class average_grade {
    public static void main(String args[]){
        int temp=1, mark=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        for(int k=0; k<5; k++){
            mark= sc.nextInt();
            temp+=mark;
        }
        temp = temp/5;
        if (temp>=90){
           System.out.println("A grade");

        }
        else if(temp>70 && temp<89){
            System.out.println("B Grade ");
        }
        else if(temp>=40 && temp<=70){
            System.out.println("C Grade ");
        }
        else{
            System.out.println("D Grade ");
        }
    }
}