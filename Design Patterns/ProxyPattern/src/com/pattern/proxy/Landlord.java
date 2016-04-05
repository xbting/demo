package com.pattern.proxy;

/**
 * 具体主题角色,被代理者<RealSubject>
 * 
 * HouseForRentImpl
 * 房东，实现HouseForRent接口
 * 
 * @author xubotao
 *
 */
public class Landlord implements HouseForRent{

	@Override
	public void rentMoney() {
		// TODO Auto-generated method stub
		System.out.println("租金每月4300元，付三押二");
	}

	@Override
	public void showHouse() {
		// TODO Auto-generated method stub
		System.out.println("晚上7点半带你去看房子");
		
	}

}
