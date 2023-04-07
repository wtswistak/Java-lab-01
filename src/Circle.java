public class Circle extends Figure implements Printable {
    private double r;

    public Circle(double r) {
        if(r<1){
            throw new IllegalArgumentException("Podaj dodatnia liczbe");
        }
        this.r = r;
    }

    @Override
    double calculateArea() {
        return r*r*Math.PI;
    }

    @Override
    double calculatePerimeter() {
        return 2*r*Math.PI;
    }

    @Override
    public void print() {
        System.out.println("Kolo o promieniu:"+r);
        System.out.println("Pole : "+calculateArea()+" || obwod kola: "+calculatePerimeter());

    }
}
