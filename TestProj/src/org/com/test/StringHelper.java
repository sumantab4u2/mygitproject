package org.com.test;

public class StringHelper {
	
	public String truncateAInFirst2Positions(String str)
	{
	if(str.length()<=2)
	{
		return str.replaceAll("A","");
	}
	String first2chars=str.substring(0,2);
	String minusfirst2cahrs=str.substring(2);
	return first2chars.replaceAll("A","")+ minusfirst2cahrs.replaceAll("A","") ;
	}
	
	public String truncateAInFirst2Positions_Condition(String str)
	{
	if(str.length()<=2)
	{
		return str.replaceAll("A","");
	}
	String first2chars=str.substring(0,2);
	String minusfirst2cahrs=str.substring(2);
	return first2chars.replaceAll("A","")+ minusfirst2cahrs.replaceAll("A","") ;
	}

}
