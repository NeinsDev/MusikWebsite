package org.musik.analyzer.lib;

public class util {
    public static void display(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        } // end loop
    } // end display

    public static void display(double[]... args) {
        for (double[] arg : args) {
            System.out.println(arg);
        } // end loop
    } // end display

}
