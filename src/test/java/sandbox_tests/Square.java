package sandbox_tests;

public class Square {

    double x;

    Square (double x){
        this.x = x;

    }

    public int area(double x){
        this.x = x;
        return (int) (x * x);
    }
}
