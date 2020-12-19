package customers;

import java.util.*;

//This class holds all of the important data of a customer and acts as a parent class for Adults and Others classes
public class Customers {

    //All necessary variables being declared
    int id;
    String name;
    int age;
    String membershipcard;
    String bankCard;
    String email;
    boolean special = false;

    //Constructor method
    public Customers() {

    }

    //Getters and setters for all attributes
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public boolean isSpecial() {
        return special;
    }

    public void setSpecial(boolean special) {
        this.special = special;
    }

    //Generates a hashcode for this class ensuring the uniqueness of a given customer
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    //Overridden method to compare objects and make it sure its uniqueness
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

    //This overridden method will return the String of the Customer object
    @Override
    public String toString() {
        return "Customers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", membershipcard='" + membershipcard + '\'' +
                ", bankCard='" + bankCard + '\'' +
                ", email='" + email + '\'' +
                ", special=" + special +
                '}';
    }
}
