package org.phone;

public class Phone {
	private void PhoneInfo() {
       System.out.println("Mobile");
	}
	private void PhoneInfo(String name) {
	       System.out.println("Mobile Name="+name);
		}
	private void PhoneInfo(long value,char no ) {
	       System.out.println("Storage="+value+no);
		}
	private void PhoneInfo(long value,String is) {
	       System.out.println("Camera="+value+is);
		}
	private void PhoneInfo(int value, String name) {
	       System.out.println("Ram="+value+"\t"+name);
		}
	      public static void main(String[] args) {
	    	  Phone p = new Phone();
	    	  p.PhoneInfo();
	    	  p.PhoneInfo("Samsung");
	    	  p.PhoneInfo(250l,'G');
	    	  p.PhoneInfo(64l, "mp");
	    	  p.PhoneInfo(6, "GB");
	    	  p.PhoneInfo(54, "shgg");
		}
        
}
