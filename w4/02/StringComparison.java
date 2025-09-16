// StringComparison.java

// showing why you never use == or != with strings
void main() {
	String a = "hello";
	String b = "hello";
	String c = IO.readln("Enter a value for c: ");
	
	IO.println("a is \"" + a + "\"");
	IO.println("b is \"" + b + "\"");
	IO.println("c is \"" + c + "\"");

	// this seems to work
	IO.println("a == b is " + (a == b));
	IO.println("a != b is " + (a != b));
	IO.println("a.equals(b) is " + a.equals(b));
	IO.println("!a.equals(b) is " + !a.equals(b));

	// this doesn't work
	IO.println("a == c is " + (a == c));
	IO.println("a != c is " + (a != c));
	IO.println("a.equals(c) is " + a.equals(c));
	IO.println("!a.equals(c) is " + !a.equals(c));
}
