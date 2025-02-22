package Ball;

public class Player {

	    private int number;
	    private float x, y, z = 0.0f;

	    public Player(int number, float x, float y) {
	        this.number = number;
	        this.x = x;
	        this.y = y;
	    }

	    public void move(float xDisp, float yDisp) {
	        this.x += xDisp;
	        this.y += yDisp;
	    }

	    public void jump(float zDisp) {
	        this.z += zDisp;
	    }

	    public boolean near(Ball ball) {
	        float distance = (float) Math.sqrt(Math.pow(ball.getX() - x, 2) + Math.pow(ball.getY() - y, 2));
	        return distance < 8;
	    }

	    public void kick(Ball ball) {
	        if (near(ball)) {
	            ball.setXYZ(ball.getX(), ball.getY(), 5.0f); // Assume kicking lifts ball to z=5
	            System.out.println("Ball kicked by player " + number);
	        } else {
	            System.out.println("Ball is too far to kick.");
	        }
	    }
	}
