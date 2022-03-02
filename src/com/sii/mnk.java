package com.sii;

public class mnk {
    public static void main(String[] args) {
        float c=-0.5F;//коэф нейронки
        float c1;
        float d1;
        float d=0F;//коэф нейронки
        float x=-2F;
        float N=16;
        float A=2;
        float e;//ошибка
        float E=0F;
        float nn=0.05F;
        float z;
        float t;
        float gg;
        float a1=0F,a2=0F,a3=0F,a4=0F;
        for(int i=0;i<16;i++){
            z=x*x;
            do {
                gg = (float) Math.random();
                gg -= 0.5;
            }while(gg==-0.5 || gg==0.5);
            e=A * gg;
            t=c*z+d+e;
            a1+=z*t;
            a2+=z;
            a3+=t;
            a4+=z*z;
            E+=(c*z+d-t)*(c*z+d-t);
            x+=0.25;
        }
        c1=(N*a1-a2*a3)/(N*a4-a2*a2);
        d1=(a3-c1*a2)/N;
        System.out.println(c1);
        System.out.println(d1);
        System.out.println(E);
    }
}
