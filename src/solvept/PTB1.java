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
public class PTB1 {
    double D, C;

    public PTB1() {
        D = C = 0;
    }

    public PTB1 (double k){
        D = C = k;
    }

    public PTB1(double m, double n) {
        C = m;
        D = n;
    }

    public double getC() {
        return C;
    }

    public void setC(double C) {
        this.C = C;
    }

    public double getD() {
        return D;
    }

    public void setD(double D) {
        this.D = D;
    }

    public String solve(){
        if (C== 0){
            if (D == 0)
                return (" Phương trình có vô số nghiệm");
            else 
                return (" Phương trình vô nghiệm");
        }
        else{
            double x = -D/C ;
            return (" Phương trình có nghiệm duy nhất : " + x);
        }       
    }

    @Override
    public String toString() {
        String result = C + "*x + " + D + " = 0";
        result = result + solve();
        return result;
    }
}