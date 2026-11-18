package day10;

public class Order {
	// 주문 클래스
	// 날짜, 세금, 배달비, 포장용기 등..
	// 상품명, 갯수, 가격(판매금액), 총금액(갯수*가격)
	Product p = new Product();
	// 주문 추가
	private String menu;
	private int count = 0;
	private int price;
	private int totalPrice;

	public Order() {
	}

	public Order(String menu, int price, int count) {
		this.menu = menu;
		this.price = price;
		setCount(count);
	}
	public void totalPrice() {
		this.totalPrice = price * count;
	}

	// 메뉴판 (메뉴, 가격 출력)
	public void printMenuList() {
		System.out.println("메뉴 : " + menu + "\t가격 : " + price + "원");
	}

	public void OrderCountTotalPrice() {
		System.out.println(menu + "\t" + price + "원\t " + count + "개\t" + totalPrice + "원");
	}

	public Product getP() {
		return p;
	}

	public void setP(Product p) {
		this.p = p;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

}
