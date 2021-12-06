package com.elieli;

public class Classroom {

	public static void main(String[] args) {

		Wilder michMich = new Wilder("Mich Mich", false);
		Wilder jeanClaude = new Wilder("JeanClaude", true);

		System.out.println(michMich.whoAmI());
		System.out.println(jeanClaude.whoAmI());

		
	}

}
