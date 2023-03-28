import java.util.Random;
import java.util.Scanner;
public class game
{
public static void main(String[] args) {
final int scissor = 0;
final int rock = 1;
final int paper = 2;
Scanner sc = new Scanner(System.in);
Random random = new Random();
System.out.print("Scissor (0), rock (1), paper (2): ");
int player = sc.nextInt();
if (player == 0 || player == 1 || player == 2) {
int computer = random.nextInt(3);
switch (player) {
case 0:
if (computer == scissor)
{
System.out.println("It's a draw");
}
else if (computer == rock)
{
System.out.println("You lost");
}
else if (computer == paper)
{
System.out.println("You won");
}
break;
case 1:
if (computer == scissor)
{
System.out.println("You won");
}
else if (computer == rock)
{
System.out.println("Its a draw");
}
else if (computer == paper)
{
System.out.println("You lost");
}
break;
case 2:
if (computer == scissor)
{
System.out.println("You lost");
}
else if (computer == rock)
{
System.out.println("You won");
}
else if (computer == paper)
{
System.out.println("It's a draw");
}
break;
}
}
else
{
System.out.println("Computer has won because your input is an invalid input");
}
}
}
