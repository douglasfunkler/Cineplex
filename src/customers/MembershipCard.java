package customers;

//This interface was designed to provide methods for customers only
public interface MembershipCard {

	//This methods will have to be implemented by Adults and Others classes
	public Boolean checkCondition(Boolean condition);
}
