package Examples;

import java.util.ArrayList;
import java.util.List;

public class DeadFish {

    /**
     * Напишите простой синтаксический анализатор, который будет анализировать и запускать Deadfish.
     * <p>
     * У Deadfish есть 4 команды, каждая длиной в 1 символ:
     * <li> i - увеличивает значение (изначально 0)
     * <li> d - уменьшает значение
     * <li> s - возводит значение в квадрат
     * <li> o - выводит значение в возвращаемый массив
     *
     * @param data Enter string
     * @return int array
     */
    public static int[] parse(String data) {
        int resultValue = 0;
        List<Integer> resultArray = new ArrayList<>();
        for (Character character : data.toCharArray()) {
            switch (character) {
                case ('i') -> resultValue++;
                case ('d') -> resultValue--;
                case ('s') -> resultValue *= resultValue;
                case ('o') -> resultArray.add(resultValue);
                default -> {}
            }
        }
        return resultArray.stream().mapToInt(Integer::intValue).toArray();
    }
}
