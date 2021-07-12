public class JavaArray {
    public static void main(String[] args) {
        int num1[] = { 1, 2, 3, 4, 5 };

        int num2[][] =  { 
                            { 1, 2, 3, 4, 5 },
                            { 6, 7, 8, 9, 10 },
                            { 11, 12, 13, 14, 15 },
                            { 16, 17, 18, 19, 20 },
                            { 21, 22, 23, 24, 25 } 
                        };
        int i, j;
        System.out.println("1D array is:");
        for (i = 0; i < num1.length; i++) {

            System.out.println(num1[i]);
        }
        System.out.println();
        System.out.println("2D array is:");
        for (i = 0; i < num2.length; i++) {
            for (j = 0; j < num2[i].length; j++) {
                System.out.print(num2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
