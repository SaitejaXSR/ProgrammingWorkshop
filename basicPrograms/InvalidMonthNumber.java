package basicPrograms;

public class InvalidMonthNumber extends RuntimeException {
	public String toString() {
		return "Invalid number... number should be between 1 and 12";
	}

}
