package generic.test.ex3;

import generic.test.ex3.Unit.Marine;
import generic.test.ex3.Unit.Zealot;

public class UnitUtileTest {
    public static void main(String[] args) {
        Marine m1 = new Marine("마린1",100);
        Marine m2 = new Marine("마린2",90);
        Marine resultMarine = UnitUtil.maxHp(m1,m2);
        System.out.println(resultMarine);

        Zealot z1 = new Zealot("질럿1",100);
        Zealot z2 = new Zealot("질럿2",80);
        Zealot resultZealot = UnitUtil.maxHp(z1,z2);
        System.out.println(resultZealot);
    }
}
