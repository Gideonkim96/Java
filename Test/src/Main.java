import java.util.HashSet;
import java.util.Set;

public class Main {
    public static int solution(String letters) {
        Set<Character> seen = new HashSet<>();
        int count = 0;

        for (char ch : letters.toCharArray()) {
            char lowercaseChar = Character.toLowerCase(ch);

            if (Character.isLowerCase(ch)) {
                if (!seen.contains(lowercaseChar)) {
                    seen.add(lowercaseChar);
                }
            } else if (Character.isUpperCase(ch)) {
                if (!seen.contains(lowercaseChar)) {
                    seen.add(lowercaseChar);
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution("aaAbcCABBc"));  // Output: 2
        System.out.println(solution("xyzXYZabcABC")); // Output: 6
        System.out.println(solution("ABCabcAefG"));   // Output: 0
    }
}
