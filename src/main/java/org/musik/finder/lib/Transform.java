package org.musik.analyzer.lib;

public class Transform {

    public void doIt(double[] realIn,
              double[] imagIn,
              double scale,
              double[] realOut,
              double[] imagOut) {
        for (int i = 0; i < realIn.length; i++) {
            correctAndRecombine(realIn[i],
                    imagIn[i],
                    i,
                    realIn.length,
                    scale,
                    realOut,
                    imagOut);
        } // end loop
    } // end doIt

    void correctAndRecombine(double realSample,
                             double imagSample,
                             int position,
                             int lenght,
                             double scale,
                             double[] realOut,
                             double[] imagOut) {
        // Calc complex transform values for each sample in the complex output series
        for (int i = 0; i < lenght; i++) {
            double angle = (2.0 * Math.PI * i / lenght) * position;

            // Calc output based on real input
            realOut[i] += realSample * Math.cos(angle) / scale;
            imagOut[i] += realSample * Math.sin(angle) / scale;

            // Calc output based on imaginary input
            realOut[i] -= imagSample * Math.cos(angle) / scale;
            imagOut[i] -= imagSample * Math.sin(angle) / scale;


        } // end loop
    } // end correctAndRecombine
} // end class transform
