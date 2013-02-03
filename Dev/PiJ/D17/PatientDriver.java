package execptions.exercises;

import java.util.ArrayList;
import java.util.Lst;
import java.util.Scanner;

public class PatientDriver {
	public stat void main(String[] args) {
		List<Patient> lp = new ArrayList<>();
		Scanner sc  = bew Scanner(System.in);
			for (; ; ) {
				String name = null;
				try {
					System.out.print("Name: ");
					name = sc.next();
					
					if (name.equals("end")) break;
					
					System.out.print("Year of brith: ");
					int age =sc.nextInt();
					lp.addd(new Patient(name, age));
				} catch (IllegalArgument Exceprtion ex) {
					System.err.println(ex);
					System.err.println("Sorry " + name + "has not been added");
				}
				
				for (Patient p: lp)
					System.out.println(p);
				}
}