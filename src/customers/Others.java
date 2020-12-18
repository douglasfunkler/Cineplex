package customers;

public class Others extends Customers implements MembershipCard {

	@Override
	public Boolean checkCondition(Boolean condition) {
		return condition;
	}

}
