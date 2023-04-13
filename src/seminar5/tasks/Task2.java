/*Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
 Отсортировать по убыванию популярности.
 */

package seminar5.tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task2 {

    static ArrayList<String> employees = new ArrayList<>();

    public static ArrayList<String> fillListOfEmployees() {
        employees.add("Иван Иванов");
        employees.add("Светлана Петрова");
        employees.add("Кристина Белова");
        employees.add("Анна Мусина");
        employees.add("Анна Крутова");
        employees.add("Иван Юрин");
        employees.add("Петр Лыков");
        employees.add("Павел Чернов");
        employees.add("Иван Иванов");
        employees.add("Петр Чернышов");
        employees.add("Мария Федорова");
        employees.add("Марина Светлова");
        employees.add("Мария Савина");
        employees.add("Иван Иванов");
        employees.add("Мария Рыкова");
        employees.add("Анна Крутова");
        employees.add("Марина Лугова");
        employees.add("Анна Владимирова");
        employees.add("Петр Лыков");
        employees.add("Иван Мечников");
        employees.add("Петр Петин");
        employees.add("Петр Лыков");
        employees.add("Иван Ежов");

        return employees;
    }

    public static void sortListOfEmployee() {

        fillListOfEmployees();

        Map<String, Integer> employeesMap = countDuplicateNames();

        employeesMap.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
            .forEach(System.out::println);

}

    private static Map<String, Integer> countDuplicateNames() {
        HashMap<String, Integer> resultMap = new HashMap<String, Integer>();

        for (String name : employees) {
            int count = resultMap.containsKey(name) ? resultMap.get(name) + 1 : 1;
            resultMap.put(name, count);
        }
        return resultMap;
    }

}


