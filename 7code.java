import java.util.Random;
public class card
{
public static void main(String[] args)
{
int card = new Random().nextInt(12);
int suit = new Random().nextInt(3);
String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
String[] cards = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
System.out.println("The card you picked is " + cards[card] + " of " + suits[suit]);
}
}
