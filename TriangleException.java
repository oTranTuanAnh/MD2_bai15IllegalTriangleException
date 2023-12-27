public class TriangleException {
    private double canh1;
    private double canh2;
    private double canh3;

    public TriangleException() {
    }

    public TriangleException(double canh1, double canh2, double canh3) throws Exception{
        if (canh1 < 0 || canh2 < 0 || canh3 < 0 ||
                (canh1+canh2)<= canh3 ||
                (canh2+canh3)<= canh1 ||
                (canh1+canh3)<= canh2 ){
            throw new Exception("Nhap sai do dai canh");
        }
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
    }

    public double getCanh1() {
        return canh1;
    }

    public void setCanh1(double canh1) {
        this.canh1 = canh1;
    }

    public double getCanh2() {
        return canh2;
    }

    public void setCanh2(double canh2) {
        this.canh2 = canh2;
    }

    public double getCanh3() {
        return canh3;
    }

    public void setCanh3(double canh3) {
        this.canh3 = canh3;
    }

    @Override
    public String toString() {
        return "TriangleException{" +
                "canh1=" + canh1 +
                ", canh2=" + canh2 +
                ", canh3=" + canh3 +
                '}';
    }
}
