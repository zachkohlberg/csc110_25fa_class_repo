// week 4 practice example

void main() {
	int n = Integer.parseInt(IO.readln("Enter a number for the countdown: "));
	
	while (n >= 0) {
		IO.println(n + "!");
		
		n = n - 1;
	}
}
