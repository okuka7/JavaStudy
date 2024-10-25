package collection.compare.test;

public enum Suit {
    SPADE("스"), HEART("하"), CLUB("클");

    private String icon;

    Suit(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }
}
