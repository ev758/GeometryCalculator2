import java.util.Scanner; //imports Scanner class

public class GeometryCalculator2 {

    public static void main(String[] args) {
        //declarations
        Scanner numObject = new Scanner(System.in);
        Scanner geomObject = new Scanner(System.in);
        Calculations geomCalcObj = new Calculations();
        int num;
        double length;
        double width;
        double height;
        double base;
        double radius1;
        double radius2;
        boolean isTrue = true;

        //displays a menu for the user to select options
        while (isTrue) {
            System.out.println("Menu");
            System.out.println("1. Calculate the surface area and volume of a Rectangular Prism");
            System.out.println("2. Calculate the surface area and volume of a Square Pyramid");
            System.out.println("3. Calculate the surface area and volume of a Conical Frustum");
            System.out.println("4. Exit\n");

            //get user input
            System.out.print("Please select an option from the menu: ");
            num = numObject.nextInt();

            switch (num) {
                case 1:
                    //get user inputs for rectangular prism
                    System.out.print("Enter the length: ");
                    length = geomObject.nextDouble();
                    System.out.print("Enter the width: ");
                    width = geomObject.nextDouble();
                    System.out.print("Enter the height: ");
                    height = geomObject.nextDouble();

                    //output
                    geomCalcObj.rectPrismCalc(length, width, height);
                    break;
                case 2:
                    //get user inputs for square pyramid
                    System.out.print("Enter the base: ");
                    base = geomObject.nextDouble();
                    System.out.print("Enter the height: ");
                    height = geomObject.nextDouble();

                    //output
                    geomCalcObj.squarePyramidCalc(base, height);
                    break;
                case 3:
                    //get user inputs for conical frustum
                    System.out.print("Enter radius 1: ");
                    radius1 = geomObject.nextDouble();
                    System.out.print("Enter radius 2: ");
                    radius2 = geomObject.nextDouble();
                    System.out.print("Enter the height: ");
                    height = geomObject.nextDouble();

                    //output
                    geomCalcObj.conicalFrustumCalc(radius1, radius2, height);
                    break;
                case 4:
                    System.out.println("Exiting Menu");
                    System.exit(0);
                default:
                    System.out.println("Incorrect Input, Try Again\n");
            }
        }
    }
}
