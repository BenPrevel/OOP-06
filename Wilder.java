package com.elieli;

public class Wilder {

	private String firstName;
	private boolean aware;

	public Wilder(String firstName, boolean aware) {
		this.firstName = firstName;
		this.aware = aware;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public boolean isAware() {
		return aware;
	}

	public void setAware(boolean aware) {
		this.aware = aware;
	}

	public String whoAmI() {
		if (aware) {
			return "My name is " + this.getFirstName() + " and I'm aware !";

		} else {
			return "My name is " + this.getFirstName() + " and I am not aware !";
		}
	}
}
