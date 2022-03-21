class areas {
    public int area(int x) {
        return (x * x);
    }

    public int area(int x, int y) {
        return (x * y);
    }

    public double area(double x) {
        return (3.14 * x * x);
    }

    public static void main(String[] args) {
        areas a = new areas();
        System.out.println(a.area(4));
        System.out.println(a.area(5, 4));
        System.out.println(a.area(2.5));
    }
}