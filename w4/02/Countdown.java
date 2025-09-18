// week 4 practice example

void main() {
	// init
	int n = Integer.parseInt(IO.readln("Enter a number for the countdown: "));
	
	// condition
	while (n >= 0) {
		IO.println(n + "!");
		
		// update
		n = n - 1;
	}
}
