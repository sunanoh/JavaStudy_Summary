package javaStudy.exercise.doItJava.inheritance;

import java.util.ArrayList;

public class CustomerTest1 {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer lee = new Customer(10010, "이순신");
		Customer shin = new Customer(10020, "신사임당");
		Customer hong = new GoldCustomer(10030, "홍길동");
		Customer youl = new GoldCustomer(10040, "이율곡");
		Customer kim = new VIPCustomer(10050,  "김유신",  12345);
		
		customerList.add(lee);
		customerList.add(shin);
		customerList.add(hong);
		customerList.add(youl);
		customerList.add(kim);
		
		System.out.println("============고객정보 출력============");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfor());
		}
		
		System.out.println("====== 할인율과 보너스 포인트 계산========");
		int price = 10000;
		
		for(Customer i : customerList) {
			int cost = i.calcPrice(price);
			System.out.println(i.getCustomerName() + " 님이  " + cost + "원 지불하셨습니다. ");
			System.out.println(i.getCustomerName() + " 님의 현재 보너스 포인트는 "+ i.bonusPoint + " 점 입니다.");
		}
	}

}
