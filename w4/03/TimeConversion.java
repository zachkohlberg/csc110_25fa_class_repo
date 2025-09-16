// for week 3 practice exercise
void main() {
	// input: seconds
	String secondsInput = IO.readln("Enter a number of seconds: ");
	int totalSeconds = Integer.parseInt(secondsInput);
	//int totalSeconds = Integer.parseInt(IO.readln("Enter a number of seconds: "));
	
	// calculations: get days, hours, minutes, leftover seconds
	int totalMinutes = totalSeconds / 60;
	int seconds = totalSeconds % 60;

	int totalHours = totalMinutes / 60;
	int minutes = totalMinutes % 60;

	int totalDays = totalHours / 24;
	int hours = totalHours % 24;

	int days = totalDays; // not going any further, but we can continue this pattern
	
	// output: days, hours, minutes, seconds
	IO.println(totalSeconds + " seconds is equal to " + days + " days, "
		+ hours + " hours, " + minutes + " minutes, and " + seconds +
		" seconds.");
}

// for testing
//3 days, 8 hours, 16 minutes, and 20 seconds
//3 days = 3 * 24 * 60 * 60 seconds
//8 hours = 8 * 60 * 60 seconds
//16 minutes = 16 * 60 seconds
//20 seconds = 20 seconds
//total = 288980 seconds
