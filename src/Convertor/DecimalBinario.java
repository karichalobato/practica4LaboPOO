/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Convertor;

import cortolabo4poo.*;

/**
 *
 * @author LN710Q
 */
public class DecimalBinario implements Convertor {

    @Override
    public double convercionDecimalBinario() {
        double[] decimal2 = {8000};
        double binario2 = 0;
        for(int n = 0; n < decimal2.length; n++) {
            binario2 = decimal2[n] % 2;
        }
        return binario2;
    }  
}
    

