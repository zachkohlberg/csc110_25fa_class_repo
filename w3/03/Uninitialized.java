void main() {
	// x is initialized
	int x = 5;
	// y is uninitialized
	int y;
	
	// can't do either of these because y is uninitialized
	int sum = x + y;
	IO.println(x + y);
}
