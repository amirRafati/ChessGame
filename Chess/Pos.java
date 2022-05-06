package Chess;

/*
since coordinates appear throughout this entire project, it's easier to have one class that holds both an x and y rather
    than two variables for every piece.
 */
public class Pos {
    int x;
    int y;

    public Pos(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
