package stringLearn.stringDemo;

public class StringFormattingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName = "kirushanthi";

		String greetingsTemplate = "Hello, dear %s! Good %s!";

		String morning = "morning";
		String afternoon = "afternoon";
		String evening = "evening";
		String formattedString = String.format(greetingsTemplate, firstName, morning);
		System.out.println(formattedString);

		System.out.printf("You have %d computers available at store", 10);
	}

}
