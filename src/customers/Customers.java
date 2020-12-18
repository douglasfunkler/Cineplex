package customers;

import java.util.*;

public class Customers {

	int id;
	String name;
	Date dob;
	String membershipcard;
	String bankCard;
	String email;

	public Customers() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getMembershipcard() {
		return membershipcard;
	}

	public void setMembershipcard(String membershipcard) {
		this.membershipcard = membershipcard;
	}

	public String getBankCard() {
		return bankCard;
	}

	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customers other = (Customers) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customers [id=" + id + ", name=" + name + ", dob=" + dob + ", membershipcard=" + membershipcard
				+ ", bankCard=" + bankCard + ", email=" + email + "]";
	}

}
