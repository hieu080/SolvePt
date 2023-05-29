/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solvept;

/**
 *
 * @author HELLO
 */
public class PTB3 extends PTB2 {
    double A;
    
    public PTB3(){
        super();
        A = 0;
    }
    
    public PTB3(double k) {
        super(k);
        A = k;
    }

    public PTB3(double A, double B, double C, double D) {
        super(B, C, D);
        this.A = A;
    }

    public double getA() {
        return A;
    }

    public void setA(double A) {
        this.A = A;
    }
    
    @Override
    public String solve(){
        if(A == 0){
            return super.solve();
        }else{
            double delta1 = B*B - 3*A*C;
            double m = (9*A*B*C - 2*Math.pow(B, 3) - 27*Math.pow(A, 2)*D) / (2*Math.sqrt(Math.pow(Math.abs(delta1), 3)));

            if (delta1 < 0) {
                double x = (Math.sqrt(Math.abs(delta1)) / (3*A))
                * (Math.cbrt(m + Math.sqrt(Math.pow(m, 2) + 1)))
                + (Math.cbrt(m - Math.sqrt(Math.pow(m, 2) + 1)))
                - (B / (3*A));
                return (" Phương trình vừa nhập có một nghiệm duy nhất: x = " + x);
            } else if (delta1 == 0) {
                double x = (-B + Math.cbrt(Math.pow(B, 3) - 27 * Math.pow(A, 2) * D)) / (3*A);
                return (" Phương trình vừa nhập có nghiệm bội: x = " + x);
            } else {
                if (Math.abs(m) <= 1) {
                    double x1 = (2 * Math.sqrt(delta1) * Math.cos(Math.acos(m) / 3) - B) / (3*A);
                    double x2 = (2 * Math.sqrt(delta1) * (Math.cos(Math.acos(m) / 3) - 2 * Math.PI / 3) - B) / (3*A);
                    double x3 = (2 * Math.sqrt(delta1) * (Math.cos(Math.acos(m) / 3) + 2 * Math.PI / 3) - B) / (3*A);
                    return (" Phương trình vừa nhập có ba nghiệm x1 = " + x1 + " x2 = " + x2 + " x3 = " + x3);
                } else {
                    double x = (Math.sqrt(delta1) * Math.abs(m) / (3*A*m))
                    * (Math.cbrt(Math.abs(m) + Math.sqrt(Math.pow(m, 2) - 1)))
                    + (Math.cbrt(Math.abs(m) - Math.sqrt(Math.pow(m, 2) - 1)))
                    - (B / (3*A));
                    return (" Phương trình vừa nhập có nghiệm duy nhất: x = " + x);
                }
            }
        }
    }
    
    @Override
    public String toString() {
        String result = A + "x^3 + " + B + "x^2 + " + C + "x + " + D + " = 0";
        result = result + solve();
        return result;
    }
}
