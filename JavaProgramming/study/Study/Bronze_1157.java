package Study;
import java.util.HashMap;
import java.util.Scanner;
public class Bronze_1157 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();
            
            // 대소문자 구분하지 않으므로 모두 대문자로 변환
            input = input.toUpperCase();
            
            HashMap<Character, Integer> charCount = new HashMap<>();
            
            // 문자를 세는 부분
            for (char c : input.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
            
            int maxCount = 0;
            char maxChar = '?';
            
            // 가장 많이 사용된 문자를 찾는 부분
            for (char c : charCount.keySet()) {
                if (charCount.get(c) > maxCount) {
                    maxCount = charCount.get(c);
                    maxChar = c;
                }
            }
            
            // 가장 많이 사용된 알파벳이 여러 개인지 확인하는 부분
            int count = 0;
            for (int val : charCount.values()) {
                if (val == maxCount) {
                    count++;
                }
                if (count > 1) {
                    maxChar = '?';
                    break;
                }
            }
            
            System.out.println(maxChar);
        }
    }

}
