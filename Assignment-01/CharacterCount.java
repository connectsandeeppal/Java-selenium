import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class CharacterCount {
    public static void main(String args[]) {
        String str;
        int length;
        Map<Character, Integer> counter = new HashMap<>();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a String:");
            str = scanner.nextLine();

            length = str.length();

            for (int i = 0; i < length; i++) {
                char c = str.charAt(i);
                if (c == ' ') {
                    continue;
                }
                counter.put(c, counter.getOrDefault(c, 0) + 1);
            }
        }
        counter.forEach((character, count) -> {
            System.out.println(character + " --> " + count);
        });
    }
}
