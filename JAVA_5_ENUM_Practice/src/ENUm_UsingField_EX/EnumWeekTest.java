package ENUm_UsingField_EX;

public class EnumWeekTest {
	Day day;

	public EnumWeekTest(Day day) {
		super();
		this.day = day;
	}

	public void tellNameOfDay() {
		switch (day) {
		case MONDAY:
			System.out.println("Mon day is wishing Day.");
			break;
		case TUESDAY:
			System.out.println("Walk out day.");
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are best.");
			break;
		case FRIDAY:
			System.out.println("Jumma Day.");
			break;
		default:
			System.out.println("Midweek days are so-so.");

		}
	}

	public static void main(String[] args) {
		EnumWeekTest firstDay = new EnumWeekTest(Day.MONDAY);
		firstDay.tellNameOfDay();
		EnumWeekTest thirdDay = new EnumWeekTest(Day.WEDNESDAY);
		thirdDay.tellNameOfDay();
		EnumWeekTest fifthDay = new EnumWeekTest(Day.FRIDAY);
		fifthDay.tellNameOfDay();
		EnumWeekTest sixthDay = new EnumWeekTest(Day.SATURDAY);
		sixthDay.tellNameOfDay();
		EnumWeekTest seventhDay = new EnumWeekTest(Day.SUNDAY);
		seventhDay.tellNameOfDay();

	}
}
