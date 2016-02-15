/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author TrungNT
 */
public class Circle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double pi=3.14;
        double r;
        
        try
        {
            BufferedReader oBufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("\nr=");
            r = Double.parseDouble(oBufferedReader.readLine());
            
            Calculate oCaluclate = new Calculate();            
            System.out.print("\nChu vi hinh tron co ban kinh " + r + " la: " + oCaluclate.calculateChuVi(r, pi));
            System.out.println();
            
        }catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
    
}
