// week 4 practice example

void main() {
	// ask user for a number (counting loop init)
	int n = Integer.parseInt(IO.readln("Enter a number for the countdown: "));
	
	// count down from number to zero (counting loop condition)
	while (n >= 0) {
		IO.println(n + "!");
		
		// decrease count (counting loop update)
		n = n - 1;
	}
	
	// it's a reversed counting loop
}
