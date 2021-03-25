import java.util.Random;

public class SnakeLadder
{
	public static void main(String grgs[])
	{
		int startpoint = 0;
		System.out.println("Welcome to the Snake Ladder Simulator Problem  " + " PlayerStartPoint:" +startpoint);
		Random random = new Random();
		int Dieroll = (random.nextInt(6))+1;

		System.out.println("Die number: " +Dieroll);

	}
}
