import java.util.Random;

public class SnakeLadder
{
	public static void main(String grgs[])
	{
		int startpoint = 0;

		int playerposition =0;
		int playerpreviousposition = 0;
		int count = 0;
		System.out.println("Welcome to the Snake Ladder Simulator Problem  " + " PlayerStartPoint:" +startpoint);

		while(playerposition <= 100){


		Random random = new Random();
		int Dieroll = (random.nextInt(6))+1;

		//System.out.println("Die number: " +Dieroll);

		count++;


		Random rand = new Random();
                int Check= rand.nextInt(3);

		playerpreviousposition = playerposition;

                switch (Check)
                        {
                case 0 :
                playerposition = playerposition;
                //System.out.println("player same position");
		break;

                case 1 :
                playerposition  = Dieroll + playerposition;
                //System.out.println("player move ahead: " + Dieroll + " position.");
                break;

                case 2 :
                playerposition = playerposition - Dieroll;
                //System.out.println(" player move back" );
                break;

                default:
                System.out.println("Invalid option");
									}

		if (playerposition < 0){
			playerposition = startpoint;}

		else if (playerposition > 100){
			playerposition = playerpreviousposition;}

		else if (playerposition == 100){
		break;}

					}
				System.out.println("Player final Position: "  +playerposition);
				System.out.println("Player Win");
				System.out.println("Number of time Die Roll: " +count);

		}
}
