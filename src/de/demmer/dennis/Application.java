package de.demmer.dennis;

public class Application {
	
	public static void main(String[] args) {
		
		Mail mail0 = new Mail("Hallo Welt0");
		Mail mail1 = new Mail("Hallo Welt1");
		Mail mail2 = new Mail("Hallo Welt2");
		Mail mail3 = new Mail("Hallo Welt3");
		Mail mail4 = new Mail("Hallo Welt4");

		System.out.println(mail0.getText());
		
		Mail[] mailArray0 = {mail0,mail1,mail2,mail3,mail4};
		Mail[] mailArray1 = new Mail[5];
		
		
		System.out.println(mailArray0[2].getText());
		
		
		for (int i = 0; i < mailArray0.length; i++) {
			System.out.println(mailArray0[i].getText());
		}
		
		
		while(true) {
			
			
		}
		
	}
	

}
