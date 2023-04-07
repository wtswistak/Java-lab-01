public class Square extends Figure implements Printable{
    private double a;
    public Square(double a) {
        if(a<1){
            throw new IllegalArgumentException("Podaj dodatnia liczbe");
        }
        this.a=a;
    }

    @Override
    double calculateArea() {
        return a*a;
    }

    @Override
    double calculatePerimeter() {
        return 4*a;
    }

    @Override
    public void print() {
        System.out.println("Kwadrat o boku "+a);
        System.out.println("Pole:"+calculateArea()+" || obwod:"+calculatePerimeter());
    }
}
