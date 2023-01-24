package Examples;

public class BreakCamelCase {
    public static String camelCase(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Character character : input.toCharArray()) {
            if (Character.isUpperCase(character)) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(character);
        }
        return stringBuilder.toString();
    }
}
