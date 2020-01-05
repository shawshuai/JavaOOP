package chap6.example.ex5.v2.impl;

import chap6.example.ex5.v2.IMobileStorage;

public class MP3Player implements IMobileStorage {
	public void read() {
		System.out.println("Reading from MP3Player¡­¡­");
	}

	public void write() {
		System.out.println("Writing to MP3Player¡­¡­");
	}

}
