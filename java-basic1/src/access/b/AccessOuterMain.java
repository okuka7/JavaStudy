package access.b;

import access.a.AccessData;
public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        //public 호출 가능
        data.publicField = 1;
        data.publicMethod();
        //default 같은 패키지 안에서만 가능해서 불가능하다.
        //data.defaultField = 2;
        //data.defaultMethod();
        //private 호출 불가
    }
}
