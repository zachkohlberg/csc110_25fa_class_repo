// StringComparisons.java
// Show why == and != don't work with Strings
void main() {
	String a = "hello";
	String b = "hello";
	String c = IO.readln("Please enter a value for c: ");
	
	IO.println("a is \"" + a + "\"");
	IO.println("b is \"" + b + "\"");
	IO.println("c is \"" + c + "\"");
	
	// With a and b, == and != will appear to work
	// Incorrect comparisons
	IO.println("a == b is " + (a == b));
	IO.println("a != b is " + (a != b));
	// Correct comparisons
	IO.println("a.equals(b) is " + a.equals(b));
	IO.println("!a.equals(b) is " + !a.equals(b));
	
	// With a and c, == and != will not work...
	// Incorrect comparisons
	IO.println("a == c is " + (a == c));
	IO.println("a != c is " + (a != c));
	// Correct comparisons
	IO.println("a.equals(c) is " + a.equals(c));
	IO.println("!a.equals(c) is " + !a.equals(c));
}
