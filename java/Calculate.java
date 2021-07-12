
public class Calculate {
    public void square() {
        System.out.println("no parameter method called");
    }

    public int square(int number) {
        int square = number * number;
        return square;
    }

    public float square(float number) {
        float square = number * number;
        return square;
    }

    public static void main(String[] args) {
        Calculate obj = new Calculate();
        obj.square();
        int i = obj.square(4);
        float j = obj.square(5.5F);
        System.out.println(i);
        System.out.println(j);
    }
}
