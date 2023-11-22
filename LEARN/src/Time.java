
public class Time {

	public static void main(String[] args) {
		System.out.println(getDurationString(60));
		System.out.println(getDurationString(240,60));
	}
	
	public static String getDurationString(int seconds)
	{
		if (seconds>0)
		{
			int minutes=seconds/60;
			return getDurationString(minutes,seconds);
		}
		
		else
		{
			return "ÏNVALIDINPUT";
		}
	}
	
	public static String getDurationString(int minutes,int seconds)
	{
		
		
		int hours=minutes/60;
		int remaining_minutes= minutes %60;
		int remaining_sec=seconds%60;
		return (hours + "hr"  +   remaining_minutes + "min"  +  remaining_sec + "sec");
		
	}

}
