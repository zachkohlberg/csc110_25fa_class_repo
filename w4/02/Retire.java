// week 4 practice example

void main() {
	// ask user for age
	int age = Integer.parseInt(IO.readln("What is your age? "));
	
	// print whether they can retire
	if (age >= 67) {
		// can retire
		IO.println("You can retire now.");
	} else {
		// can't retire
		IO.println("Get back to work!");
	}
}
