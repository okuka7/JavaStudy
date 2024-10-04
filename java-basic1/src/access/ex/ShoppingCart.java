package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item){
        if(itemCount >= items.length){
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for(int i = 0; i<itemCount;i++){
            Item item = items[i];
            System.out.println("삼풍명 " + item.getName()+item.getTotalPrice()+item.getQuantity());
        }
        System.out.println("전체 가격합 :"+ calculatePrice());
    }

    private int calculatePrice(){
        int totalPrice = 0;
        for(int i = 0; i<itemCount;i++){
            Item item = items[i];
        }
        return totalPrice;
    }
}
