package net.skyblock.util;

public class FormattingUtil {
    public static int getChestSlotX(int column) {
        return 8 + column * 18;
    }
    public static int getChestSlotY(int row) {
        return 18 + row * 18;
    }

    public static String formatNumber(int n) {
        StringBuilder s = new StringBuilder();
        double log = Math.floor(Math.log10(n) / 3);

        for (int i = (int) log; i>0; i--) {
           int pow = (int) Math.floor(n / Math.pow(10, i * 3));
           if (i!=(int) log && pow < 100) {
               s.append("0");
               if (pow < 10) {
                   s.append("0");
               }
           }

            s.append(pow);
            s.append(",");
       }

        int mod = n % 1000;
        if (n >= 1000 && mod < 100) {
            s.append("0");
            if (mod < 10) {
                s.append("0");
            }
        }
        s.append(mod);

       return s.toString();
    }

    public static String formatPercent(float n) {
        return (int)(n*100) + "%";
    }

}
