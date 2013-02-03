String input = System.console().readLine()
int n = Integer.parseInt(input)
String result = n + " is a prime number"
if (n < 2) {
	result = n + " is NOT a prime number"
} else {
	int i = 2
	while (i <= n) {
		if ((n % i == 0) && (i < n)) {
			result = n + " is NOT a prime number"
			break;
		}
		i++
	}
}
println(result)