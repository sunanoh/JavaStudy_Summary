package javaStudy.exercise.doItJava.inheritance;

//상속 연습 p.234
public class VIPCustomer extends Customer {

	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public String showCustomerInfor() {
		return super.showCustomerInfor() + "담당 상담원 번호는 "+ agentID + "입니다.";
	}
	
	public int getAgentID() {
		return agentID;
	}
}
