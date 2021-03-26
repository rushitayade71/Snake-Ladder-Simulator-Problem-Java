import java.util.Random;

public class SnakeLadder
{
	public static void main(String grgs[])
	{
		int Player1startpoint = 0;
		int player1position =0;
		int player1previousposition = 0;
		int count1 = 0;

                int Player2startpoint = 0;
                int player2position =0;
                int player2previousposition = 0;
                int count2 = 0;

		System.out.println("Welcome to the Snake Ladder Simulator Problem  " + " PlayerPlayer1startpoint:" +Player1startpoint);

		while((player1position <= 100) && (player2position <= 100)){


		Random random = new Random();
		int Die1roll = (random.nextInt(6))+1;

		//System.out.println("Die number: " +Dieroll);

		count1++;


		Random rand = new Random();
                int Check1= rand.nextInt(3);

                Random ra = new Random();
                int Die2roll = (ra.nextInt(6))+1;

                //System.out.println("Die number: " +Dieroll);

                count2++;


                Random ran = new Random();
                int Check2= ran.nextInt(3);



		player1previousposition = player1position;
		player2previousposition = player2position;

                switch (Check1)
                        {
                case 0 :
                player1position = player1position;
                //System.out.println("player same position");
		break;

                case 1 :
                player1position  = Die1roll + player1position;
                //System.out.println("player move ahead: " + Die1roll + " position.");
                break;

                case 2 :
                player1position = player1position - Die1roll;
                //System.out.println(" player move back" );
                break;

                default:
                System.out.println("Invalid option");

			}

		switch (Check2)
                        {
                case 0 :
                player2position = player2position;
                //System.out.println("player same position");
                break;

                case 1 :
                player2position  = Die2roll + player2position;
                //System.out.println("player move ahead: " + Die2roll + " positio>
                break;

                case 2 :
                player2position = player2position - Die2roll;
                //System.out.println(" player move back" );
                break;

                default:
                System.out.println("Invalid option");
			}

		if (player1position < 0){
			player1position = Player1startpoint;}

		else if (player1position > 100){
			player1position = player1previousposition;}

		else if (player1position == 100){
		break;}


		if (player2position < 0){
                        player2position = Player2startpoint;}

                else if (player2position > 100){
                        player2position = player2previousposition;}

                else if (player2position == 100){
                break;}

			}
			if ( player1position == 100 ){
			System.out.println("Player 1 Wins.");}
			else if ( player2position == 100 ){
			System.out.println("Player 2 Wins.");}

			System.out.println("Player 1 final Position: "  + player1position);
			System.out.println("Number of time Die 1 Roll: " + count1);

			System.out.println("Player 2 final Position: "  + player2position);
                        System.out.println("Number of time Die 2 Roll: " + count2);
		}
}
