package com.tutorialspoint;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaCollection {
	List addressList;
	Set addressSet;
	Map addressMap;
	Properties addressPro;
	
	public List getAddressList() {
		System.out.println("addressList:" + addressList);
		return addressList;
	}
	public void setAddressList(List addressList) {
		this.addressList = addressList;
	}
	public Set getAddressSet() {
		System.out.println("addressSet:" + addressSet);
		return addressSet;
	}
	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}
	public Map getAddressMap() {
		System.out.println("addressMap:" + addressMap);
		return addressMap;
	}
	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}
	public Properties getAddressPro() {
		System.out.println("addressPro:" + addressPro);
		return addressPro;
	}
	public void setAddressPro(Properties addressPro) {
		this.addressPro = addressPro;
	}
	
	
	
}
