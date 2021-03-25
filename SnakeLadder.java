import java.util.Random;

public class SnakeLadder
{
	public static void main(String grgs[])
	{
		int startpoint = 0;

		int playerposition =0;

		System.out.println("Welcome to the Snake Ladder Simulator Problem  " + " PlayerStartPoint:" +startpoint);


		while(playerposition <= 100){


		Random random = new Random();
		int Dieroll = (random.nextInt(6))+1;
		{
		System.out.println("Die number: " +Dieroll);
		}

		Random rand = new Random();
                int Check= rand.nextInt(3);

                switch (Check)
                        {
                case 0 :
                playerposition = playerposition;
                System.out.println("player same position");
		break;

                case 1 :
                playerposition  = Dieroll + playerposition;
                System.out.println("player move ahead: " + Dieroll + " position.");
                break;

                case 2 :
                playerposition = playerposition - Dieroll;
                System.out.println(" player move back" );
                break;

                default:
                System.out.println("Invalid option");
									}
					}
					 System.out.println("Player Win");

		}
}
