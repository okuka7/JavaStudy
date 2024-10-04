package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max){
        this.max = max;
    }
    public void increament(){
        //검증로직
        if (count >= max){
            System.out.println("최대값을 초대할 수 없습니다.");

        }
        //살행로직
        count++;
    }

    public int getCount() {
        return count;
    }
}
