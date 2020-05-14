package Arrays.PlusOne;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.Arrays.stream;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = new int[]{1,2,3};

        stream(plusOne(digits)).forEach(val -> System.out.println(val));
    }

    public static int[] plusOne(int[] digits) {
        for(int i = digits.length -1; i>=0; i--){
            if(digits[i] == 9)
                digits[i]=0;
            else{
                digits[i]++;
                return digits;
            }
        }
        int[] new_array = new int[digits.length+1];
        new_array[0] = 1;
        return new_array;

    }

//    public static int[] addOne(int[] digits) {
//        String str = "";
//        for(int i = 0 ; i < digits.length; i++) {
//            if (i == digits.length - 1) {
//                str += Integer.toString(digits[i] + 1);
//                break;
//            }
//            str += Integer.toString(digits[i]);
//        }
//
//        List<Integer> list = stream(str.split(", ")).map(Integer::parseInt).collect(Collectors.toList());
//        int[] result = new int[list.size()];
//
//        for (int i = 0; i < list.size(); i++){
//            result[i] = list.get(i);
//        }
//
//        return result;
//    }
}
