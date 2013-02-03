String str = System.console().readLine()
double d1 = Double.parseDouble(str)
str = System.console().readLine()
double d2 = Double.parseDouble(str)
println "Please enter one of the following operations:"
println "+, -, * or /"
String o = System.console().readLine()
double r
if (o == "+") {
	r = d1 + d2
} else if (o == "-") {
	r = d1 - d2
} else if (o == "*") {
	r = d1 * d2
} else {
	r = d1 / d2
}
println r