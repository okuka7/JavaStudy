package collection.list.test.Ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items = new ArrayList<>();

    public void add(Item item1) {
        items.add(item1);

    }


    public void displayItem() {
        for (Item item : items) {
            System.out.println("상품명"+item.getName()+", 합계"+item.getTotalPrice());
        }
        System.out.println(calculateTotalPrice());

        //이러게 하면 명확하게 분리가 된다.

        System.out.println("전체 가격 합" + items.size());
    }


    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
