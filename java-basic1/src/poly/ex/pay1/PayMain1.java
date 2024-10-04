package poly.ex.pay1;

public class PayMain1 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        //KaKao
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);

        //naver
        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2,amount2);

        //잘못된
        String payOption3 = "bad";
        int amount3 = 15000;
        payService.processPay(payOption3,amount3);
    }
}
