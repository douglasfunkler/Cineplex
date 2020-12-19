package customers;

//This is a subclass extending Customers which contains all of the important data and it is
// implementing a method from an Interface to check the age and condition of the customer
public class Adults extends Customers implements MembershipCard {

    @Override
    //This method must return the value of the variable condition being passed as a parameter.
    public Boolean checkCondition(Boolean condition) {

        if (getAge() >= 18 && isSpecial() == false) {
            condition = true;
        } else {
            condition = false;
        }
        return condition;

    }

}
