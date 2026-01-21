import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Boolean choice=true;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("******************* XXXXX BANKASINA HOŞGELDİNİZ (WELCOME TO XXXXX BANK) *******************");
		
		
		//BİLGİLERİ ALMA (Data Collection)
		
		System.out.print("İsminiz (Name): ");
		String name = scan.nextLine();
		
		System.out.print("Soyisminiz (Surname): ");
		String surname= scan.nextLine();
		
		int cash = 700;
		
		//NESNE TANIMLAMA (Object Identification)
				system system = new system(cash,name,surname);
		
		
		// SEÇİM EKRANI HAZIRLAMA (Preparing Selection Screen)
		
		System.out.println("HOŞGELDİN (WELCOME)  "+name.toUpperCase()+" "+ surname.toUpperCase());
		
		while (choice) {
			System.out.println("Yapmak istediğiniz işlemi seçiniz (Select the action you wish to perform).\n"
					+ "1) Hesap bilgilerini görüntüle (View account information).\n"
					+ "2) Para yatır (Deposit).\n"
					+ "3) Para çekme (withdrawal).\n"
					+ "4) Sistemi kapatma (Shut down system)");
			int key = scan.nextInt();
			switch (key) {
			case 1:
				system.accinfo();
				break;
			case 2:
				System.out.print("Yatırılacak para miktarını giriniz (Enter the amount of money to be deposited): ");
				int deposit = scan.nextInt();
				if (deposit<0) {
					System.out.println("Geçersiz işlem (Invalid transaction).");
					System.out.println(" ");
					System.out.println(" ");
					System.out.println(" ");
				}else {
					system.deposit(deposit);	
				}
				
				break;
			case 3:
				System.out.print("Çekilecek para miktarını giriniz (Enter the amount of money to be withdrawn): ");
			    int withdraw = scan.nextInt();
			    system.withdraw(withdraw);
				break;
			case 4:
				System.out.println("Tekrar görüşmek üzere (See you again)"+isim.toUpperCase()+" "+ soyisim.toUpperCase());
				System.exit(0);
			default:
				System.out.println("Geçersiz değer girdiniz (You entered an invalid value). Lütfen tekrar deneyiniz (Please try again).");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
			}
		}

	}

}
