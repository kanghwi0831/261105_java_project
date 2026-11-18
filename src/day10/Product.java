package day10;

public class Product {
	// 제품 클래스 : 판매하는 제품
	// 재고, 수입원, 원가, 가격, 부가가치세 등..
	// 판매제품명, 가격
	private String menu;
	private int price;

	public Product() {
	}

	public Product(String menu, int price) {
		setMenu(menu);
		setPrice(price);
	}

	@Override
	public String toString() {
		return "Product [menu=" + menu + ", price=" + price + "]";
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
