package test3;

class Menu{
	String name;
	int price;
	
	Menu(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	void printMenu(int number) {
		System.out.println(number+". "+name+" ("+price+"원)");		
	}
	
	// 수량을 입력받아 총 가격을 계산하는 getPrice 메서드(return)
	int getPrice(int quantity) {
		return price*quantity;
	}
}

public class KioskMain {
	public static void main(String[] args) {
		Menu m1 = new Menu("햄버거", 5000);
		Menu m2 = new Menu("감자튀김", 2500);
		Menu m3 = new Menu("콜라", 2000);
			
		System.out.println("==== 키오스크 프로그램 ====");
		m1.printMenu(1);
		m2.printMenu(2);
		m3.printMenu(3);
		
		int total = m1.getPrice(1);
		System.out.println(total);	
		
	}
}









