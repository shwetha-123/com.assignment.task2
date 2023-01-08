import java.util.Scanner;
class ques10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Basic Salary :");
        int bs = input.nextInt();
        float hra,da,tot;
        if(bs<=15000)
        {
            hra = bs*0.25f;
            da = bs*0.82f;
        }
        else if(bs<=20200)
        {
            hra = bs*0.27f;
            da = bs*0.9f;
        }
        else
        {
            hra = bs*0.3f;
            da = bs*0.95f;
        }
        System.out.println("Gross Salary : "+(bs+hra+da));
    }
}