package org.phone;

public class PhoneInfo {
	private void phoneName() {
     System.out.println("Phone Name = Samsung");
	}
	private void phoneMieiNum() {
     System.out.println("PhoneMieiNum = 154841841516751");
	}
	private void camera() {
     System.out.println("Camera = 42 Mp and 16 Mp");
	}
	private void storage() {
     System.out.println("Storage = 64 GB");
	}
	private void osName() {
     System.out.println("osName = pentium");
	}
	public static void main(String[] args) {
		//classname obj = new classname();
		//obj.method();
		PhoneInfo p = new PhoneInfo();
		p.phoneName();
		p.phoneMieiNum();
		p.camera();
		p.storage();
		p.osName();
	}
}
