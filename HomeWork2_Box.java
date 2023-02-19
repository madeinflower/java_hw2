public class HomeWork2_Box {
    public static void main(String[] args) {
        Box b = new Box(40, 60, 50);

        System.out.println("height: " + b.height + " cm3");
        System.out.println("weight: " + b.weight + " cm3");
        System.out.println("depth: " + b.depth + " cm3");

        System.out.println();

        Box b2 = new Box(40, 60);

        System.out.println("height: " + b2.height + " cm3");
        System.out.println("weight: " + b2.weight + " cm3");
        System.out.println("depth: " + b2.depth + " cm3");

        System.out.println();

        Box b3 = new Box(40);

        System.out.println("height: " + b3.height + " cm3");
        System.out.println("weight: " + b3.weight + " cm3");
        System.out.println("depth: " + b3.depth + " cm3");

        System.out.println();

        Box b4 = new Box();

        System.out.println("height: " + b4.height + " cm3");
        System.out.println("weight: " + b4.weight + " cm3");
        System.out.println("depth: " + b4.depth + " cm3");
    }
}
