import java.lang.Math;
import java.util.Scanner;
public class circle
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a point with two coordinates: ");
double x2 = sc.nextInt();
double y2 = sc.nextInt();
double x1 = 0;
double y1 = 0;
double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
if (dist <= 10)
{
System.out.println("Point (" + x2 + ", " + y2 + ") " + "is in the circle");
}
else
{
System.out.println("Point (" + x2 + ", " + y2 + ") " + "is not in the circle");
}
}
}
