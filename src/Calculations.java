import java.util.ArrayList; //imports the ArrayList class

public class Calculations {

    public static ArrayList<Double> rectPrismCalc(double lengthPar, double widthPar, double heightPar) {
        //declarations
        ArrayList<Double> rectPrism = new ArrayList<Double>();
        double surfaceArea;
        double volume;

        //calculations
        surfaceArea = 2.0 * ((widthPar * lengthPar) + (heightPar * lengthPar) + (heightPar * widthPar));
        volume = widthPar * heightPar * lengthPar;

        rectPrism.add(surfaceArea);
        rectPrism.add(volume);
        System.out.printf("Surface Area: %.2f\n", rectPrism.get(0));
        System.out.printf("Volume: %.2f\n\n", rectPrism.get(1));

        return rectPrism;
    }

    public static ArrayList<Double> squarePyramidCalc(double basePar, double heightPar) {
        //declarations
        ArrayList<Double> squarePyramid = new ArrayList<Double>();
        double surfaceArea;
        double volume;

        //calculations
        surfaceArea = (Math.pow(basePar, 2.0) + (2.0 * basePar) * (Math.sqrt(((Math.pow(basePar, 2.0) / 4.0)
                + Math.pow(heightPar, 2.0)))));
        volume = Math.pow(basePar, 2.0) * (heightPar / 3.0);

        squarePyramid.add(surfaceArea);
        squarePyramid.add(volume);
        System.out.printf("Surface Area: %.2f\n", squarePyramid.get(0));
        System.out.printf("Volume: %.2f\n\n", squarePyramid.get(1));

        return squarePyramid;
    }

    public static ArrayList<Double> conicalFrustumCalc(double radius1Par, double radius2Par, double heightPar) {
        //declarations
        ArrayList<Double> conicalFrustum = new ArrayList<Double>();
        final double pi = Math.PI;
        double surfaceArea;
        double volume;

        //calculations
        surfaceArea = pi * (Math.pow(radius1Par, 2.0) + Math.pow(radius2Par, 2.0) + (radius1Par + radius2Par)
                * (Math.sqrt((Math.pow(radius1Par - radius2Par, 2.0)) + Math.pow(heightPar, 2.0))));
        volume = ((1.0 / 3.0) * pi * heightPar) * ((Math.pow(radius1Par, 2.0) + Math.pow(radius2Par, 2.0))
                + (radius1Par * radius2Par));

        conicalFrustum.add(surfaceArea);
        conicalFrustum.add(volume);
        System.out.printf("Surface Area: %.2f\n", conicalFrustum.get(0));
        System.out.printf("Volume: %.2f\n\n", conicalFrustum.get(1));

        return conicalFrustum;
    }

}
