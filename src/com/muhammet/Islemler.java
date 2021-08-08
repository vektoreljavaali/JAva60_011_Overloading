package com.muhammet;

public class Islemler {

	public double sayi1,sayi2;
	
	public void Toplam() {
		double toplam = sayi1+sayi2;
		System.out.println("Toplam...: "+toplam);
	}
	
	public void Toplam(int s1,int s2) {
		System.out.println("Tamsayý Toplam...: "+ (s1+s2));
	}
	
	public void Toplam(double sayi1,int sayi2) {
		System.out.println("Double Toplam...: "+(sayi1+sayi2));
	}
	
	public void Kaydet() {
		
	}
}
