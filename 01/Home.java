// Home.java

void main() {
	// TODO: make this work for everybody using user input
	var username = "zach";

	IO.println("  Linux: /home/" + username);
	
	IO.print("    Mac: /Users/");
	IO.println(username);

	IO.print("Windows: /c/Users/");
	IO.println(username);

	IO.print("      or C:\\Users\\");
	IO.println(username);
	
	// reassignment changes value stored in variable
	//username = "jake";

	//IO.print("  Linux: /home/");
	//IO.println(username);
	
	//IO.print("    Mac: /Users/");
	//IO.println(username);

	//IO.print("Windows: /c/Users/");
	//IO.println(username);

	//IO.print("      or C:\\Users\\");
	//IO.println(username);
}
