package arkadasSayılar;

public class arkadasSayi {

	public static void main(String[] args) {
		int[] sayilar= new int[] {1,2,5,7,9,0};
		int aranacak=8;
		boolean varMi=false;
		
		for(int i=0;i<sayilar.length;i++) {
			if(i==aranacak) {
				varMi=true;
				System.out.println("Sayı mevcuttur.");
				break;
			}
		}
		if(varMi) {
			System.out.println("Sayı mevcuttur");
		}
		else {
			System.out.println("Sayı mevcut değildir.");
		}
		
		
		
		
		

	}

}
