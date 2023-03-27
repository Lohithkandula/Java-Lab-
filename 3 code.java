import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the subtotal and a gratuity rate: ");
double subtotal = sc.nextDouble();
double per = sc.nextDouble();
double gratuity = subtotal*(per/100);
double total = subtotal + gratuity;
System.out.printf("The gratuity is: $%.2f and total is: $" + total, gratuity);
}
}
