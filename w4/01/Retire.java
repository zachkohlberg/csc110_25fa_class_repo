// w4 practice example
void main() {
	// boolean expression: age >= 67
	
	int age = Integer.parseInt(IO.readln("How old are you? "));
	
	if (age >= 67) {
		IO.println("You can retire!");
	} else {
		IO.println("Get back to work!");
	}
}
