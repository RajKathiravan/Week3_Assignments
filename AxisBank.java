package assignment3_W3D1;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Deposited 7000000");

	}
	public static void main(String[] args) {
		AxisBank axObj = new AxisBank();
		axObj.saving();
		axObj.fixed();
		axObj.deposit();
	}
}
