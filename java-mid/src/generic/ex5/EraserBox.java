package generic.ex5;

public class EraserBox <T>{
    public boolean instanceCheck(Object param){
        //return param instanceof T;
        return false;
    }
    public void create(){
        //return new;
    }
    //전부 컴파일 오류
}