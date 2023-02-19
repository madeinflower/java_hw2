public class Box {
    int height;
    int weight;
    int depth;

    public Box(int h, int w, int d) {
        height = h;
        weight = w;
        depth = d;
    }

    public Box(int h, int w) {
        height = h;
        weight = w;
        depth = 60;
    }

    public Box(int h) {
        height = h;
        weight = 50;
        depth = 70;
    }

    public Box() {
        height = 60;
        weight = 50;
        depth = 70;

    }
}
