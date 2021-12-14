import java.util.jar.JarOutputStream;

public class Utils {

    public static void main(String[] args) {

        System.out.println(toFixedPointString((float) -2));


    }

    static String toFixedPointString(float f) {

        //f *= (2 << 8);

        System.out.println(f);

        boolean neg = f < 0;

        //if (neg) f = -f;

        short bits = 0;

        for (int i = 0; i < 16; i++) {

            float num = (float) Math.pow(2, 7 - i);

            //System.out.println(num + ": " + f);

            if (f >= num) {
                bits |= 2 << i;
                f -= num;
            }

        }

        //if(neg) bits = (short)~bits;
        //bits++;

        StringBuilder s = new StringBuilder("16'b");

        for (int i = 0; i < 16; i++) {

            if (i == 8)
                s.append("_");

            s.append((bits & 2 << i) > 0 ? "1" : "0");

        }

        return s.toString();

    }

}
