/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;
import java.math.*;

/**
 *
 * @author TrungNT
 */
public class Calculate {
    //dinh nghia ham tinh chu vi hinh tron
    public double calculateChuVi(double bk, double pi)
    {               
        return 2*bk*pi;
    }
    
    //dinh nghia ham tinh dien tich hinh tron
    public double caculateDienTich(double bk, double pi)
    {
        return pi*Math.pow(bk, 2);
    }
}
