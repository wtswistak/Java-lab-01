public class Prism{
    private Figure base;
    private double h;

    public Prism(Figure base, double h) {
        if(h<1){
            throw new IllegalArgumentException("Podaj dodatnia liczbe");
        }
        this.base = base;
        this.h = h;
    }
    public double calculateArea(){
        return 2* base.calculateArea()+base.calculatePerimeter()*h;
    };

    public double calculateVolume() {
        return base.calculateArea()*h;
    }
    public void print(){
        System.out.println("Pole graniastoslupa: "+calculateArea()+" Objetosc: "+calculateVolume());
    }
}
