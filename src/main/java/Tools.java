import java.util.HashMap;
import java.util.Map;

public class Tools {

    static final Map<Integer, String> map = new HashMap();

    static {
        String[][] pairs = {
                {"0", "*"},
                {"3", "Foo"},
                {"5", "Bar"},
                {"7", "Qix"}
        };
        for (String[] pair : pairs) {
            map.put(Integer.parseInt(pair[0]), pair[1]);
        }
    }

    private static boolean hasConvertedValue(String str) {
        boolean found = false;
        int val;
        for (int i = 0; i < str.length(); i++){
            val = Character.getNumericValue(str.charAt(i));
            if(null != map.get(val) && 0 != val) {
                found = true;
            }
        }

        return found;
    }

    /**
     * See function definition @ http://codingdojo.org/kata/FooBarQix/
     * @param str
     * @return
     */
    public static String compute(String str) {

        int number;
        String result = "";
        try {
            number = Integer.parseInt(str);
        } catch(NumberFormatException e){
            System.out.println(str + " is not an integer");
            throw e;
        }

        boolean found = false;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if(0 != entry.getKey() && 0 == number % entry.getKey()) {
                result += entry.getValue();
                found = true;
            }
        }

        int val;
        boolean hasConvertedValue = Tools.hasConvertedValue(str);
        String part;
        for (int i = 0; i < str.length(); i++){
            val = Character.getNumericValue(str.charAt(i));
            part = hasConvertedValue ? "" : String.valueOf(str.charAt(i));
            part = found ? "" : part;
            result += null == map.get(val) ? part : map.get(val);
        }

        return result;
    }

}