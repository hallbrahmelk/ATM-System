
public class system {
	
	//DEĞİŞKENLER (variables)
		private int cash;
		private int deposit;
		private int withdraw;
		private String name;
		private String surname;
		
	
		
		public void accinfo ()
		{
			System.out.println("******************** HESAP BİLGİLERİ (ACCOUNTAN INFORMATION) ********************");
			System.out.println(" ");
			System.out.println("İSİM (NAME)/SOYİSİM (SURNAME): "+name.toUpperCase()+" "+surname.toUpperCase());
			System.out.println("Müşteri Numaranız (Costumer Number): 4569336520");
			System.out.println("Hesap adınız: XXXXXXX-01");
			System.out.println("Bakiyeniz (Your balance): "+cash+"$");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
		}
		
		
		// HESAP BİLGİLERİNİ ALAN METOT (Getting Account Information)
		
		public system (int cash, String name, String surname)
		{
			this.cash=cash;
			this.name=name;
			this.surname=surname;
			
		}
		
		//PARA YATIMA METODU (Deposit)
		
		public double deposit(int deposit)
		{
			cash= cash+Deposit;
			System.out.println("Yatırılan miktar (Deposited Amount): "+deposit+" $");
			System.out.println("Güncel hesap bakiyeniz (Your current account balance): "+cash+" $");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			
			return cash;
			
		}
		
		// PARA ÇEKME METODU (withdraw)
		
		

		public double withdraw(int withdraw) {
		   
		    if (withdraw > cash) {
		        System.out.println("Geçersiz işlem: Bakiye Yetersiz! (Invalid transaction: Insufficient balance!)");
		        System.out.println("Mevcut Bakiyeniz (Your current balance): " + cash + " $");
		        System.out.println(" ");
		    } 
		    else {
		        
		        cash = cash - withdraw;
		        System.out.println("Çekilen para miktarı (Amount of money withdrawn ): " + withdraw + " $");
		        System.out.println("Güncel hesap bakiyeniz (Your current account balance): " + cash + " $");
		        System.out.println(" ");
		        System.out.println(" ");
		    }
		    
		    return cash;
		}
		
		
}
