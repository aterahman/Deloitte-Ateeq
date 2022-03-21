public class animals
{
    private String a1;
    private String a2;
    private String a3;
    public void setA1(String an1) {
        this.a1 = an1;
    }

    public void setA2(String an2) {
        this.a2 = an2;
    }

    public void setA3(String an3) {
        this.a3 = an3;
    }

    public String getA1() {
        return a1;
    }

    public String getA2() {
        return a2;
    }

    public String getA3() {
        return a3;
    }

    public static void main(String [] args)
    {
        animals an = new animals();
        an.setA1("Dog");
        an.setA2("Cat");
        an.setA3("Hamster");
        System.out.println(an.getA1());
        System.out.println(an.getA2());
        System.out.println(an.getA3());
    }
}