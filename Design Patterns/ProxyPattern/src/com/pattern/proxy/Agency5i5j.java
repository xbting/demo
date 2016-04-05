package com.pattern.proxy;

/**
 * 代理者<Proxy>
 * 我爱我家中介
 * @author xubotao
 *
 */
public class Agency5i5j implements HouseForRent{
	private HouseForRent houseForRent;
	public Agency5i5j(HouseForRent houseForRent){
		this.houseForRent = houseForRent;
	}
	@Override
	public void rentMoney() {
		// TODO Auto-generated method stub
		System.out.println("before----中介告诉房东要价");
		houseForRent.rentMoney();
		System.out.println("after----中介告诉房东要价");
	}


	@Override
	public void showHouse() {
		// TODO Auto-generated method stub
		System.out.println("before----中介预约房东带你看房");
		houseForRent.showHouse();
		System.out.println("after----中介预约房东带你看房");
	}

}
