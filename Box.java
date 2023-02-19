public class Box {
    int height;
    int weight;
    int depth;

    public Box(int height, int weight, int depth) {
        this.height = height;
        this.weight = weight;
        this.depth = depth;

        System.out.println("height: " + height + " cm3");
        System.out.println("weight: " + weight + " cm3");
        System.out.println("depth: " + depth + " cm3");
    }
//    public Box(int h, int w, int d) {
//
////        height = h;
////        weight = w;
////        depth = d;
//
//        System.out.println("height: " + height + " cm3");
//        System.out.println("weight: " + weight + " cm3");
//        System.out.println("depth: " + depth + " cm3");
//    }

    public Box(int height, int weight) {
        this.height = height;
        this.weight = weight;
        depth = 60;

        System.out.println("height: " + height + " cm3");
        System.out.println("weight: " + weight + " cm3");
        System.out.println("depth: " + depth + " cm3");
    }
//    public Box(int h, int w) {
//        height = h;
//        weight = w;
//        depth = 60;
//
//        System.out.println("height: " + height + " cm3");
//        System.out.println("weight: " + weight + " cm3");
//        System.out.println("depth: " + depth + " cm3");
//    }

    public Box(int height) {
        this.height = height;
        weight = 50;
        depth = 70;

        System.out.println("height: " + height + " cm3");
        System.out.println("weight: " + weight + " cm3");
        System.out.println("depth: " + depth + " cm3");
    }

//    public Box(int h) {
//        height = h;
//        weight = 50;
//        depth = 70;
//
//        System.out.println("height: " + height + " cm3");
//        System.out.println("weight: " + weight + " cm3");
//        System.out.println("depth: " + depth + " cm3");
//    }

    public Box() {
        height = 60;
        weight = 50;
        depth = 70;

        System.out.println("height: " + height + " cm3");
        System.out.println("weight: " + weight + " cm3");
        System.out.println("depth: " + depth + " cm3");

    }
}
