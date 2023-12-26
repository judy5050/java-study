package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[cnt];

        for(int i = 1; i <= cnt; i++) {
            System.out.println(i+"번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName = scanner.nextLine();

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            orders[i-1]= createOrder(productName, price, quantity);
        }
        printOrders(orders);
        System.out.println("총 결제 금액: " + getTotalAmount(orders));
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price= price;
        order.quantity= quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: "+ order.productName + ", 가격:" + order.price + ", 수량:" + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int sum = 0;
        for (ProductOrder order : orders) {
            sum += order.price * order.quantity;
        }
        return sum;
    }
}
