package main;

import java.util.*;

public class Day28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String s1 = sc.nextLine();
		List<NameEmail> lst = new ArrayList<>();
		for (int i = 0; i < T; i++) {
			NameEmail ne = new NameEmail();
			String s = sc.nextLine();
			String[] r = s.split(" ");
			String g = r[1];

			if(g.endsWith("@gmail.com")){
				ne.name = r[0];
				ne.email = r[1];
				lst.add(ne);
			}


		}


		lst.sort((p1, p2) -> p1.name.compareTo(p2.name));

		lst.forEach(p -> System.out.println(p.name));

		sc.close();

	}

}

class NameEmail{
	String name;
	String email;


}
