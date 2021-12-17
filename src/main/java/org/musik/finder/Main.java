package org.musik.analyzer;


import org.musik.analyzer.lib.Transform;
import org.musik.analyzer.lib.util;

public class Main {

    public static void main(String[] args) {

	    Transform transform = new Transform();

	    System.out.println("CaseA");

        double[] realInA =
                {0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
        double[] imagInA =
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        double[] realOutA = new double[16];
        double[] imagOutA = new double[16];

        transform.doIt(realInA, imagInA, 2.0, realOutA, imagOutA);
        util.display(realOutA, imagOutA);
    }
}
