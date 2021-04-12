import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOfRoom = scanner.nextLine();
        double a;
        double b;
        double c;
        double r;
        switch (typeOfRoom) {
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                System.out.println(a * b);
                break;
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                double p = (a + b + c) / 2;
                System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
                break;
            case "circle":
                r = scanner.nextDouble();
                System.out.println(3.14 * Math.pow(r, 2));
                break;
            default:
                break;
        }
    }
}