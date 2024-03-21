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
       for (int i = (int) Math.floor(Math.log10(n)/3); i>0; i--) {
            s.append((int) Math.floor(n / Math.pow(10, i * 3)));
            s.append(",");
       }
        s.append(n % 1000);

       return s.toString();
    }
}
