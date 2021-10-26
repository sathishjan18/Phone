package org.phone;

public class InternalStorage {
	private void processorName() {
        System.out.println("Process Name = Pentium");
	}
	private void ramSize() {
        System.out.println("Ram Size = 6 GB");
	}
	public static void main(String[] args) {
		InternalStorage i= new InternalStorage();
		i.processorName();
		
		ExternalStorage e= new ExternalStorage();
		e.size();
	}
}
