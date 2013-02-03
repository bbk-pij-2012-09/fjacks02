String str = System.console().readLine();
int n1 = Integer.parseInt(str);
str = System.console().readLine();
int n2 = Integer.parseInt(str);
str = System.console().readLine();
int n3 = Integer.parseInt(str);
String r1 = "";
String r2 = "";

int p1, p2;
if (n1 > n2) && (n1 > n3) 
	if (n2 >  n3)
		r = n3 + " " + n2
	else
		r = n2 + " " + n3
	println r + " " +  n1
else
	if (n2 >  n1) && (n2 > n3)
		if (n1 > n3)
			r = n3 + " " + n1
		else
			r = n1 + " " + n3
	println r + " " +  n2
else
	if (n1 > n2)
		println n2 + " " + n1 + " " + n3
	else
		println n1 + " " + n2 + " " + n3