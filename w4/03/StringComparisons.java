// StringComparisons.java

void main() {
	String a = "hello";
	String b = "hello";
	String c = IO.readln("Enter a value for c: ");
	
	IO.println("a is \"" + a + "\"");
	IO.println("b is \"" + b + "\"");
	IO.println("c is \"" + c + "\"");

	// looks like == and != work
	IO.println("a == b is " + (a == b));
	IO.println("a != b is " + (a != b));
	IO.println("a.equals(b) is " + a.equals(b));
	IO.println("!a.equals(b) is " + !a.equals(b));

	// shows that == and != don't really work
	IO.println("a == c is " + (a == c));
	IO.println("a != c is " + (a != c));
	IO.println("a.equals(c) is " + a.equals(c));
	IO.println("!a.equals(c) is " + !a.equals(c));
}
