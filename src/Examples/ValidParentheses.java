package Examples;

public class ValidParentheses {

    /**
     * Write a function that takes a string of parentheses, and determines if the order of the parentheses is valid.
     * <p>
     * Examples
     * "()"              =>  true
     * ")(()))"          =>  false
     * "("               =>  false
     * "(())((()())())"  =>  true
     *
     * @param parens parens
     * @return The function should return true if the string is valid, and false if it's invalid.
     */
    public static boolean validParentheses(String parens)
    {
        int i = 0;
        for (Character character : parens.toCharArray()) {
            if(i < 0) {
                return false;
            }
            if (character.equals('(')) i++;
            else if (character.equals(')')) i--;
        }
        return i == 0;
    }
}
