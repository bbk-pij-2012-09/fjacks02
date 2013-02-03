String str = System.console().readLine();
int n1 = Integer.parseInt(str);
str = System.console().readLine()
int n2 = Integer.parseInt(str);
int q = n1;
int i = 0;
while ( q > 1 ) {
    q = q - n2;
	i++;
}
println n1 + " divided by " + n2 + " is " + i + ", remainder " + q