package etc;

import java.util.ArrayList;
import java.util.List;

public class 아라비아를로마숫자로변환 {
    public static void main(String[] args) {
        int [] numbers = {5, 10, 15, 409};
        // V, X, XV, CDIX
        List<String> answer = convertToRoman(numbers);
    }

    public static List<String> convertToRoman(int[] numbers){
        int[] arabic = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] values = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < numbers.length; i++){
            for(int j = arabic.length - 1; j >= 0; j--){
                if(numbers[i] >= arabic[j]){
                    numbers[i] = numbers[i] - arabic[j];
                    sb.append(values[j]);
                }
            }

           //System.out.println(sb.toString());

            result.add(sb.toString());
            sb.delete(0,sb.length());
        }

        return result;
    }
}
