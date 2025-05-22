package net.skyblock.util;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class FormattingUtil {
    public static String commaSeparateInt(int i) {
        DecimalFormat format = (DecimalFormat) NumberFormat.getInstance();
        format.setGroupingUsed(true);
        format.setGroupingSize(3);
        return format.format((int)i);
    }
}
