package week1.day1;

public class Mobile {
	long MobileNumber = 2123467890;
	
	public String SendMessage() {
		String SendMessage = "Hello Welcome";
		return SendMessage;
	}
	public long SaveContact() {
		long MobileNo = 2123467890;
		return MobileNo;
	}
	private long MakeCall() {
		long MakeCall = 2123467890;
		return MakeCall;
	}
	
	
	public static void main(String[] args) {
		 Mobile SaveNumber = new Mobile();
		 SaveNumber.SaveContact();
		 long StdNum = SaveNumber.SaveContact();
		 System.out.println(StdNum);
		 Mobile SndMsg = new Mobile();
		 SndMsg.SendMessage();
		 String Msg = SndMsg.SendMessage();
		 System.out.println(Msg);
		 Mobile Call = new Mobile();
		 Call.MakeCall();
		 long CallComplete=Call.MakeCall();
		 System.out.println("Call"+" "+ CallComplete);
		 }

}
