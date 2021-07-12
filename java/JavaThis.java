class JavaThis {
    int a, b;

    public void setData(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void showData() {
        System.out.println("value of A = " + a);
        System.out.println("value of B = " + b);
    }

    public static void main(String[] args) {
        JavaThis obj = new JavaThis();
        obj.setData(2, 3);
        obj.showData();
    }
}
