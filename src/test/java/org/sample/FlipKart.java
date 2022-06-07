package org.sample;

import org.testng.annotations.Test;

import base.Baseclass;

public class FlipKart extends Baseclass{
	public static void main(String[] args) {
		launchBrowser("chrome");
		launchUrl("https://www.flipkart.com/");
		implicitlyWait(10);
		Login l=new Login();
        
		buttonClick(l.btnclose());
	    sendKeys(l.getTxtbox(),"iphone");
		buttonClick(l.getBtnsearch());
		String text1= getText(l.getMobile1());
		System.out.println(text1);
		String text2= getText(l.getMobile2());
		System.out.println(text2);
		String text3= getText(l.getMobile3());
		System.out.println(text3);
		String text4= getText(l.getMobile4());
		System.out.println(text4);
		String text5= getText(l.getMobile5());
		System.out.println(text5);
		String text6= getText(l.getMobile6());
		System.out.println(text6);
		String text7= getText(l.getMobile7());
		System.out.println(text7);
		String text8= getText(l.getMobile8());
		System.out.println(text8);
		String text9= getText(l.getMobile9());
		System.out.println(text9);
		String text10= getText(l.getMobile10());
		System.out.println(text10);
		String text11= getText(l.getMobile11());
		System.out.println(text11);
		String text12= getText(l.getMobile12());
		System.out.println(text12);
		String text13= getText(l.getMobile13());
		System.out.println(text13);
		String text14= getText(l.getMobile14());
		System.out.println(text14);
		String text15= getText(l.getMobile15());
		System.out.println(text15);
		String text16= getText(l.getMobile16());
		System.out.println(text16);
		String text17= getText(l.getMobile17());
		System.out.println(text17);
		String text18= getText(l.getMobile18());
		System.out.println(text18);
		String text19= getText(l.getMobile19());
		System.out.println(text19);
		String text20= getText(l.getMobile20());
		System.out.println(text20);
		String text21= getText(l.getMobile21());
		System.out.println(text21);
		String text22= getText(l.getMobile22());
		System.out.println(text22);
		String text23= getText(l.getMobile23());
		System.out.println(text23);
		String text24= getText(l.getMobile24());
		System.out.println(text24);
	}
}
