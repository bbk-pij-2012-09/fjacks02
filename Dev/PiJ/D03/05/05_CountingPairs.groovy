println "Enter a short string"
String s1 = System.console().readLine()
println "Enter some longer text"
String s2 = System.console().readLine()
int i1 = 0
int c = 0
boolean found;
while (i1 < s2.length()) {
	found = false
	for (i2 in 0..s1.length()-1) {
		found = s1.charAt(i2) == s2.charAt(i1)
	}
	if (found) c++
	i1++		
}
println c++