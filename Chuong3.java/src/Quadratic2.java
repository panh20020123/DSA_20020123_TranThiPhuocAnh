public class Quadratic2 {
    public static void main(String[] args) {
        double a= Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        double discriminant = b * b - 4.0 * c*a;
        double sqroot = Math.sqrt(discriminant);//can bac hai cua mot so

        double root1 = (-b + sqroot) / (2.0*a);
        double root2 = (-b - sqroot) / (2.0*a);

        System.out.println(root1);
        System.out.println(root2);


    }
}
