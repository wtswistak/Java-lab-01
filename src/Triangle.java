public class Triangle extends Figure implements Printable  {
    private double a,b,c,h;

    public Triangle(double a, double b, double c) {
        if(a<1 ||b<1 || c<1){
            throw new IllegalArgumentException("Podaj dodatnia liczbe");
        }
//        if(a+b<=c ||c+b<=a || a+c<=b){
//            throw new IllegalArgumentException("Nie da sie stworzy trojkata z tych bokow");
//        }
        this.a = a;
        this.b = b;
        this.c = c;

    }
    public double calculatePerimeter(){
        return a+b+c;
    };
    public double calculateArea(){
        return Math.sqrt(calculatePerimeter()/2*(calculatePerimeter()/2-a)*(calculatePerimeter()/2-b)*(calculatePerimeter()/2-c));
    };


    @Override
    public void print() {
        System.out.println("Trojkat o bokach: "+a+", "+b+","+c);
        System.out.println("Pole: "+calculateArea()+" || obwod: "+calculatePerimeter());
    }
}
