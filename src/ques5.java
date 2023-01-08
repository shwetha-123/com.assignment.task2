import java.util.Scanner;
public class ques5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        if(x>=90){
            System.out.println("Grade A");
        }
        else if (x>=75){
            System.out.println("Grade B");
        }
        else if(x>=65){
            System.out.println("Grade C");
        }
    }
}
