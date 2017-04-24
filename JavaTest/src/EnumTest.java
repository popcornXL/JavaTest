public class EnumTest {
	public static void main(String[] args) {
		for(Day day: Day.values())
            System.out.println(day.toString());
	}
	public enum Day{
		Monday,
		Sunday,
		Tuesday
	}
}
