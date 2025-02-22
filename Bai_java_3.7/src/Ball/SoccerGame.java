package Ball;

public class SoccerGame {

	    public static void main(String[] args) {
	        Ball ball = new Ball(10, 10, 0);
	        Player player = new Player(7, 12, 10);

	        System.out.println("Initial Ball Position: " + ball);
	        System.out.println("Player moves closer to the ball.");
	        player.move(-2, 0);

	        System.out.println("Is player near the ball? " + player.near(ball));
	        
	        System.out.println("Player attempts to kick the ball.");
	        player.kick(ball);

	        System.out.println("Ball Position After Kick: " + ball);
	    }
	}
