package MyTime;

public class TestMyTime {

	    public static void main(String[] args) {
	        MyTime time = new MyTime(23, 59, 59);
	        System.out.println("Current time: " + time);
	        System.out.println("Next second: " + time.nextSecond());
	        System.out.println("Next minute: " + time.nextMinute());
	        System.out.println("Next hour: " + time.nextHour());
	        
	        time.setTime(0, 0, 0);
	        System.out.println("Reset time: " + time);
	        System.out.println("Previous second: " + time.previousSecond());
	        System.out.println("Previous minute: " + time.previousMinute());
	        System.out.println("Previous hour: " + time.previousHour());
	    }
	}
