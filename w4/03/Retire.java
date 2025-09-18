// week 4 practice example

void main() {
	// ask user for age
	int age = Integer.parseInt(IO.readln("How old are you? "));
	
	// tell them whether they can retire now
	if (age >= 67) {
		IO.println("Congrats on your retirement!");
	} else {
		IO.println("Back to work!");
	}
}
