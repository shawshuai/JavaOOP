package chap6.example.ex5.v2.impl;

import chap6.example.ex5.v2.IMobileStorage;


public class NewMobileStorage implements IMobileStorage {

	public void read() {
		System.out.println("Reading from NewMobileStorage¡­¡­");
	}
	public void write() {
		System.out.println("Writing to NewMobileStorage¡­¡­");
	}
}
