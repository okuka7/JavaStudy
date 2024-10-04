package pack;

import pack.a.*;
//패키지 안에있는 클래스를 전부 가지고 올 수 있다.

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User();
        User2 user2 = new User2();
        //패키지가 다르면 패키지 전체 경로를 포함해서 클래스를 적어주어야 한다.
    }

}
