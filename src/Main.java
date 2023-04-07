import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean end = false;

        while (!end) {
            System.out.println("Wybierz figure:");
            System.out.println("1. Trojkat");
            System.out.println("2. Kwadrat");
            System.out.println("3. Kolo");
            System.out.println("4. Graniastoslup");
            System.out.println("5. Wyjscie");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    double a, b, c;
                    System.out.println("Podaj boki trojkata :");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    c = scanner.nextDouble();
                    if(a+b<=c ||c+b<=a || a+c<=b) {
                        System.out.println("Nie da sie stworzyc trojkata z tych bokow");
                    continue;
                    }
                    Triangle triangle = new Triangle(a, b, c);
                    triangle.print();
                    break;
                case 2:
                    System.out.println("Podaj bok kwadratu:");
                    a = scanner.nextDouble();

                    Square square = new Square(a);
                    square.print();
                    break;
                case 3:
                    System.out.println("Podaj promien kola:");
                    a = scanner.nextDouble();

                    Circle circle = new Circle(a);
                    circle.print();
                    break;
                case 4:
                    System.out.println("Wybierz figure w podstawie graniastoslupa");
                    System.out.println("1. Kwadrat");
                    System.out.println("2. Trojkat");
                    System.out.println("3. Kolo");
                    int baseType= scanner.nextInt();

                    Figure base;
                    switch (baseType) {
                        case 1:
                            System.out.println("Podaj bok kwadratu w podstawie:");
                            a=scanner.nextDouble();

                            base = new Square(a);

                            break;
                        case 2:
                            System.out.println("Podaj boki trojkata w podstawie :");
                            a = scanner.nextDouble();
                            b = scanner.nextDouble();
                            c = scanner.nextDouble();
                            if(a+b<=c ||c+b<=a || a+c<=b) {
                                System.out.println("Nie da sie stworzyc trojkata z tych bokow");
                                continue;
                            }
                            base = new Triangle(a, b, c);
                            break;
                        case 3:
                            System.out.println("Podaj promien kola:");
                            a = scanner.nextDouble();

                            base = new Circle(a);
                            break;
                        default:
                            System.out.println("Zly wybor");
                            continue;
                    }
                    System.out.println("Podaj wyskosc graniastoslupa:");
                    double h1 = scanner.nextDouble();
                    Prism prism=new Prism(base,h1);
                    prism.print();
                    continue;
                case 5:
                    end = true;
                    break;
                default:
                    System.out.println("Zly wybor");

            }
        }
    }
}
