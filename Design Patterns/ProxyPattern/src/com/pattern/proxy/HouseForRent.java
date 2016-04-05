package com.pattern.proxy;
/**
 * 
 * 抽象角色<Subject>
 * 
 * 房屋出租接口
 * 
 * @author xubotao
 *
 */
public interface HouseForRent {
	/**
	 * 要求租金
	 */
	public void rentMoney();
	/**
	 * 带你看房
	 */
	public void showHouse();
}
