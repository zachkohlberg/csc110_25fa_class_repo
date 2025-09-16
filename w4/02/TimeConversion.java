// for practice exercise in week 3
void main() {
	// input: a number of seconds
	String secondsInput = IO.readln("Enter a number of seconds: ");
	int totalSeconds = Integer.parseInt(secondsInput);
	//int totalSeconds = Integer.parseInt(IO.readln("Enter a number of seconds: "));
	
	// calculations: convert to hours, minutes, seconds
	int totalMinutes = totalSeconds / 60;
	int seconds = totalSeconds % 60;

	int totalHours = totalMinutes / 60;
	int minutes = totalMinutes % 60;

	int totalDays = totalHours / 24;
	int hours = totalHours % 24;
	
	int days = totalDays; // stopping here, but we could continue with this pattern
	
	// output: hours, minutes, seconds
	IO.println(totalSeconds + " seconds is equal to " + days + " days, "
		+ hours + " hours, " + minutes + " minutes, and " + seconds +
		" seconds.");
}

//for testing:
//3 days, 6 hours, 10 minutes, 50 seconds
//3 days = 3 * 24 * 60 * 60 seconds
//6 hours = 6 * 60 * 60 seconds
//10 minutes = 10 * 60 seconds
//50 seconds = 50 seconds
//total = 281450 seconds
