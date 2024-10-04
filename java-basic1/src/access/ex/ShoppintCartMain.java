package access.ex;

public class ShoppintCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("마늘", 2000,2);
        Item item2 = new Item("감자",2000,3);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayItems();
        //캡슐화를 잘 설정해서 만들면 좋다.
    }
}
