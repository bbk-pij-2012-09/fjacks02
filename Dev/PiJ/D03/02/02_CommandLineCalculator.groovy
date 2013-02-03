String str = System.console().readLine()
double d1, d2
char c, op;
int i = 0
while (i < str.length()) {
	c = str.charAt(i)
	if (c == "+"||c == "-"||c == "*"||c == "/") {
		d1 = Double.parseDouble(str.substring(0, i))
		op =  c
		d2 = Double.parseDouble(str.substring(i + 1, str.length()))
	}
	i++
}

if (op == "+") {
	r = d1 + d2
} else if (op == "-") {
	r = d1 - d2
} else if (op == "*") {
	r = d1 * d2
} else {
	r = d1 / d2
}
println r