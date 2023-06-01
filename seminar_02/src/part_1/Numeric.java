package part_1;

public class Numeric implements I_Operation {

    int start;
    int val;
    int prev;

    public Numeric() {
        start = 0;
        val = 0;
        prev = -2;
    }

    @Override
    public int getNext() {
        prev = val;
        val+=2;
        return val;
    }

    @Override
    public void reset() {
        prev = - 2;
        val =0;
        start = 0;
    }

    @Override
    public void setStart(int x) {
        val = x;
        start = x;
        prev = x - 2;
    }
    public int getPrev(){
        return prev;
    }
}
