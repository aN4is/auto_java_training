package hw8.utils;

import java.util.List;

public class Utils {

    public static String listToStringWithoutBrackets(List<String> list) {
        return list.toString().substring(1,
                list.toString().length() - 1);
    }
}
