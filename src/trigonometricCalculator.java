import java.util.Scanner;
public class trigonometricCalculator {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);

        double P;  // P = Opposite Side
        double B;  // B = Adjacent Side
        double H;  // H = Hypotenuse

        double answer;

        System.out.println("Enter the value of Opposite Side: ");
        P = keyboard.nextInt();

        System.out.println("Enter the value of Hypotenuse: ");
        H = keyboard.nextInt();

        System.out.println("Enter the value of Adjacent Side: ");
        B = keyboard.nextInt();

        answer = Sine(P, H);
        System.out.println("The value of Sine is: " + answer);
        
        System.out.println("And the angle between them is: " + Math.toDegrees(Math.asin(answer)));
        System.out.println("The other angle in the triangle will be: " + (90 - Math.toDegrees(Math.asin(answer))));
        
        answer = Cosine(B, H);
        System.out.println("The value of Cosine is: " + answer);

        answer = Tangent(P, B);
        System.out.println("The value of Tangent is: " + answer);

        answer = Cosecant(P, H);
        System.out.println("The value of Cosecant is: " + answer);

        answer = Secant(B, H);
        System.out.println("The value of Secant is: " + answer);

        answer = Cotangent(P, B);
        System.out.println("The value of Cotangent is: " + answer);

    }

    public static double Sine(double P, double H) {
        double answer;
        answer = P / H;
        return answer;
    }
    public static double Cosine(double B, double H) {
        double answer;
        answer = B / H;
        return answer;
    }
    public static double Tangent(double P, double B){
        double answer;
        answer = P / B;
        return answer;
    }

    public static double Cosecant(double P, double H) {
        double answer;
        answer = H / P;
        return answer;
    }
    public static double Secant(double B, double H) {
        double answer;
        answer = H / B;
        return answer;
    }
    public static double Cotangent(double P, double B){
        double answer;
        answer = B / P;
        return answer;
    }


}
