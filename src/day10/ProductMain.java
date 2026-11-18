package day10;

import java.util.Arrays;
import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		// 키오스크
		// product(상품) class : 상품명, 가격(판매금액)
		// order(주문) class : 상품명, 갯수, 가격(판매금액), 금액(갯수*가격)
		// Product[] menu = new Product[5]; // => 상품리스트
		// 임의의 상품을 등록
		// 주문 => order 객체 발생 => Order[] order = new Order[5];
		Scanner scan = new Scanner(System.in);

		// 김밥 3000 라면 4000 떡볶이 5000 콜라 2000 사이다 2000
		// 5. order => 배열이 다 차면 배열 증가
		Product[] productArr = new Product[5];
//		productArr[0] = new Product("김밥", 3000);
//		productArr[1] = new Product("라면", 4000);
//		productArr[2] = new Product("떡볶이", 5000);
//		productArr[3] = new Product("콜라", 2000);
//		productArr[4] = new Product("사이다", 2000);

		int index = 1;
		while (true) {
			for (int i = 0; i < productArr.length; i++) {
				System.out.print((i + 1) + "번째 메뉴 이름 : ");
				String newMenu = scan.next();
				if ("종료".equals(newMenu)) {
					break;
				} else
					productArr[i] = new Product();  // 생성자를 넣어야 null이 아닌 내가 원하는 빈공간이 생긴다
				productArr[i].setMenu(newMenu);     // 빈공간에다 newMenu 를 부여 가능해진다
				System.out.print((i + 1) + "번째 메뉴 가격 : ");
				int newMenuPrice = scan.nextInt();
				productArr[i].setPrice(newMenuPrice);
				index++;
				if (index == productArr.length) {
					// 저장소 만들기
					Product[] productArrTemp = new Product[productArr.length + 2];
					// 기존값 저장소에 복사
					System.arraycopy(productArr, 0, productArrTemp, 0, productArr.length);
					// 저장소 값 붙여넣기
					productArr = productArrTemp;
				}
			}
			break;
		}

		// 3. order 객체가 생성하면 => 오더에 추가
		int count = 0;
		Order[] orderArr = new Order[index - 1];
		System.out.println("productArr length : " + productArr.length);
		System.out.println("orderArr length : " + orderArr.length);
		for (int i = 0; i < orderArr.length; i++) {
			orderArr[i] = new Order(productArr[i].getMenu(), productArr[i].getPrice(), count);
			// 1. 전체 제품을 보여주기.
//			System.out.print(i+" ");
			orderArr[i].printMenuList();
		}
		System.out.println("종료 입력 시 주문완료.");
		System.out.println("선택하실 메뉴와 수량을 입력해주세요.");

		// 2. 주문 > 제품명, 수량 입력받기.
		// 4. 반복 주문 => 종료 키워드 따로 생성하여 반복 주문이 가능하도록 한다
		String menu;
		while (true) {
			System.out.print("입력 : ");
			menu = scan.next();
			if (menu.equals("종료")) {
				break;
			}
			count = scan.nextInt();
			boolean orderComplete = false;
			for (int i = 0; i < orderArr.length; i++) {

				if (productArr[i].getMenu().equals(menu)) {
					orderArr[i].setCount(orderArr[i].getCount() + count);
					System.out.println(orderArr[i].getMenu() + " 총 수량 : " + orderArr[i].getCount() + "개");
					orderComplete = true;
					break;
				}
			}
			if (orderComplete == false) {
				System.out.println("리스트에 없는 메뉴입니다. 다시 입력해주세요.");
			}
		}
		scan.close();

		System.out.println("----------------------------------");
		int totalPrice = 0;
		for (int i = 0; i < orderArr.length; i++) {
			orderArr[i].totalPrice();
			totalPrice += orderArr[i].getTotalPrice();
		}
		for (int i = 0; i < orderArr.length; i++) {
			if (orderArr[i].getCount() == 0) {
				continue;
			} else
				orderArr[i].OrderCountTotalPrice();
		}
		// 6. 주문 완료 시 => 영수증 출력 (전체 주문내역 / 총 지불금액)
		// ex)
		// 김밥 2(줄) 3000(원) => 6000(원)
		// 라면 3(개) 5000(원) => 15000(원)
		// 사이다 2(개) 500(원) => 1000(원)
		// ---------------------------------
		System.out.println("----------------------------------");
		// 총 지불금액 22000
		System.out.println("총 지불금액 : " + totalPrice + "원");

	}

}
