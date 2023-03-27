import java.util.Scanner;
public class sum
{
public static void main(String[] args)
{
System.out.print("Enter a number between 0 and 1000: ");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int s = 0;
while (n > 0)
{
s += (n % 10);
n /= 10;
}
System.out.println("The sum of the digits is " + s);
}
}
