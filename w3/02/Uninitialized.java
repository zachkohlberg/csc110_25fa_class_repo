void main() {
	int x = 5;
	// uninitialized variable
	int y;

	// can't use y because it's uninitialized
	int sum = x + y;
	IO.println(x + y);
}
