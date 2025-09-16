// For last week 3 practice exercise
void main() {
	// input: total seconds
	String secondsInput = IO.readln("Please enter a number of seconds: ");
	int totalSeconds = Integer.parseInt(secondsInput);
	//int totalSeconds = Integer.parseInt(IO.readln("Please enter a number of seconds: "));
	
	// calculations: get current hour, minute, and second
	int totalMinutes = totalSeconds / 60;
	int seconds = totalSeconds % 60;

	int totalHours = totalMinutes / 60;
	int minutes = totalMinutes % 60;
	
	// days weren't in the problem, this is extra
	int totalDays = totalHours / 24;
	int hours = totalHours % 24;
	
	int days = totalDays; // not going any further than days
	
	// output: current hour, minute, second
	IO.println(totalSeconds + " is equal to " + days + " days, " + hours
		+ " hours, " + minutes + " minutes, and " + seconds + " seconds.");
}

//known answer for testing
//1 day, 11 hours, 4 minutes, 27 seconds
//1 day = 1 * 24 * 60 * 60 seconds
//11 hours = 11 * 60 * 60 seconds
//4 minutes = 4 * 60 seconds
//27 seconds = 27 seconds
//total = 126267 seconds
