package com.pattern.proxy;

/**
 * 客户，租房者
 * @author xubotao
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HouseForRent houseForRent = new Agency5i5j(new Landlord());
		houseForRent.showHouse();
		houseForRent.rentMoney();
	}

}
