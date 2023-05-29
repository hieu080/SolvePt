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
public class PTB2 extends PTB1 {
    double B;
    
    public PTB2(){
        super();
        B = 0;
    }
    
    public PTB2(double k) {
        super(k);
        B = k;
    }

    public PTB2(double B, double C, double D) {
        super(C, D);
        this.B = B;
    }

    public double getB() {
        return B;
    }

    public void setB(double B) {
        this.B = B;
    }
    
    @Override
    public String solve() {
        if(B==0){   
            return super.solve();
        }else{
            double delta = C*C - 4*B*D;
            if(delta < 0){
                return (" Phương trình vừa nhập vô nghiệm.");
            }else if(delta == 0){
                return (" Phương trình vừa nhập có nghiệm kép: x1 = x2 = "+ (-C)/2*B);
            }else{
                return (" Phương trình vừa nhập có hai nghiệm phân biệt x1 = "+ (-C + Math.sqrt(delta))/2*B + " x2 = "+ (-C - Math.sqrt(delta))/2*B);
            }
        } 
    }
    @Override
    public String toString(){
        String result = B + "x^2 + " + C + "x + " + D + " = 0";
        result = result + solve();
        return result;
    } 
}
