package com.sii;



public class nsSH {
    public static void main(String[] args) {
        float f;
        float c=0F;//коэф нейронки
        float d=0F;//коэф нейронки
        float x;
        float nn=0.05F;
        float z;
        float t;
        float del;
        int kaif=0;
        int k=-1;
        float A=2;
        float gg;
        float E=0;

        float e;//ошибка

        do{ x=-2;
            for(int i=0;i<16;i++,x+=0.25) {
                z = x * x;
                do {
                    gg = (float) Math.random();
                    gg -= 0.5;
                }while(gg==-0.5 || gg==0.5);
                e=A * gg;
                f = naimKv(c, z, d);
                t = realVih(z,e);
                del = t - f;
                if (Math.abs(c + 0.5) <= nn && Math.abs(d) <= nn) {kaif += 1;break;}
                c += nn * del * z;
                d += nn * del;
                System.out.println(c);
                System.out.println(d);
                System.out.println();
                k++;
                E+=(c*z+d-t)*(c*z+d-t);
            }

        }
        while(kaif!=1);
        System.out.println(k);
        System.out.println(E);
    }
    public static float naimKv( float c, float z, float d){
        return c*z+d;
    }
    public static float realVih(float z,float e){
        return (float) (-0.5)*z+e;
    }
}
