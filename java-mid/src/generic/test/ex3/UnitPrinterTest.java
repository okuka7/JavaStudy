package generic.test.ex3;

import generic.test.ex3.Unit.Marine;
import generic.test.ex3.Unit.Zealot;
import generic.test.ex3.Unit.Zergling;

public class UnitPrinterTest {
    public static void main(String[] args) {
        Shuttle<Marine> shuttle1 = new Shuttle<>();
        shuttle1.in(new Marine("마린",40));

        Shuttle<Zergling> shuttle2 = new Shuttle<>();
        shuttle2.in(new Zergling("저글링",40));

        Shuttle<Zealot> shuttle3 = new Shuttle<>();
        shuttle3.in(new Zealot("질럿",40));

        UnitPrinter.printV1(shuttle1);
        UnitPrinter.printV2(shuttle1)
    }
}
