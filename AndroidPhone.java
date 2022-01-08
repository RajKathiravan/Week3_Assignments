package week3.day1;

public class AndroidPhone extends SmartPhone{

	public void takeVideo() {
		System.out.println("Video recorded");
		 
	}
	
	public static void main(String[] args) {
		AndroidPhone APObj = new AndroidPhone();
		APObj.accessWhatsApp();
		APObj.makeCall();
		APObj.sendMsg();
		APObj.saveContact();
		APObj.takeVideo();
		
		SmartPhone sm = new SmartPhone();
		sm.takeVideo();

	}

}
