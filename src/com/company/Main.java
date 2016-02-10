package com.company;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    /*
    Reddit Daily Programmer (Easy) challenge. Playing the Stock Market.

    Sample input:
    19.35 19.30 18.88 18.93 18.95 19.03 19.00 18.97 18.97 18.98

    challenge input:
    9.20 8.03 10.02 8.08 8.14 8.10 8.31 8.28 8.35 8.34 8.39 8.45 8.38 8.38 8.32 8.36 8.28 8.28 8.38 8.48 8.49 8.54 8.73
    8.72 8.76 8.74 8.87 8.82 8.81 8.82 8.85 8.85 8.86 8.63 8.70 8.68 8.72 8.77 8.69 8.65 8.70 8.98 8.98 8.87 8.71 9.17
    9.34 9.28 8.98 9.02 9.16 9.15 9.07 9.14 9.13 9.10 9.16 9.06 9.10 9.15 9.11 8.72 8.86 8.83 8.70 8.69 8.73 8.73 8.67
    8.70 8.69 8.81 8.82 8.83 8.91 8.80 8.97 8.86 8.81 8.87 8.82 8.78 8.82 8.77 8.54 8.32 8.33 8.32 8.51 8.53 8.52 8.41
    8.55 8.31 8.38 8.34 8.34 8.19 8.17 8.16
     */

    public static void main(String[] args) {
        String sampleInput = "19.35 19.30 18.88 18.93 18.95 19.03 19.00 18.97 18.97 18.98";
        String challangeInput = "9.20 8.03 10.02 8.08 8.14 8.10 8.31 8.28 8.35 8.34 8.39 8.45 8.38 8.38 8.32 8.36 8.28 8.28 8.38 8.48 8.49 8.54 8.73\n" +
                "    8.72 8.76 8.74 8.87 8.82 8.81 8.82 8.85 8.85 8.86 8.63 8.70 8.68 8.72 8.77 8.69 8.65 8.70 8.98 8.98 8.87 8.71 9.17\n" +
                "    9.34 9.28 8.98 9.02 9.16 9.15 9.07 9.14 9.13 9.10 9.16 9.06 9.10 9.15 9.11 8.72 8.86 8.83 8.70 8.69 8.73 8.73 8.67\n" +
                "    8.70 8.69 8.81 8.82 8.83 8.91 8.80 8.97 8.86 8.81 8.87 8.82 8.78 8.82 8.77 8.54 8.32 8.33 8.32 8.51 8.53 8.52 8.41\n" +
                "    8.55 8.31 8.38 8.34 8.34 8.19 8.17 8.16";
       StringTokenizer stringToken = new StringTokenizer(challangeInput);
        ArrayList<Double> tempStockTokens = new ArrayList<>();
        double buy = 0.0, sell = 0.0;
        int pos = 0;
        while (stringToken.hasMoreTokens()){
            tempStockTokens.add(Double.valueOf(stringToken.nextToken()));
        }

        for (int i = 0; i < tempStockTokens.size(); i++){
            if (buy == 0.0){
                buy = tempStockTokens.get(i);
            }
            else if(tempStockTokens.get(i) < buy){
                buy = tempStockTokens.get(i);
            }
            if (tempStockTokens.get(i) > buy && tempStockTokens.get(i) > sell && tempStockTokens.get(i -1) != buy){
                sell = tempStockTokens.get(i);
            }
        }
        System.out.printf("Buy:%10.2f\n", buy);
        System.out.printf("Sell:%9.2f", sell);
    }


}
