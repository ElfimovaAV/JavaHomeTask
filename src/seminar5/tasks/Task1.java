/*Реализуйте структуру телефонной книги с помощью HashMap,
учитывая, что 1 человек может иметь несколько телефонов.
 */

package seminar5.tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static Map<String, ArrayList<String>> phoneBook  = new HashMap<>();

    public static void fillPhoneBook() {

        addContact("Малюта Скуратов", "89001112323");
        addContact("Борис Годунов", "89012224545");
        addContact("Степан Разин", "89023335656");
        addContact("Григорий Орлов", "89500066412");
        addContact("Емельян Пугачев", "89034446767");
        addContact("Григорий Распутин", "89045557878");
        addContact("Александр Суворов", "89056668989");
        addContact("Георий Жуков", "89067779090");
        addContact("Григорий Орлов", "89078880101");
        addContact("Борис Годунов", "89087223311");
    }


        public static void addContact(String name, String phonenumber){
            if (phoneBook.containsKey(name)) {
                phoneBook.get(name).add(phonenumber);
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(phonenumber);
                phoneBook.put(name, list);
            }
        }

        // Метод, который печатает список контактов
        public static void printPhoneBook(){
            fillPhoneBook();
            for (Map.Entry<String, ArrayList<String>> item : phoneBook.entrySet()) {
                String phonenumber = "";
                for(String el: item.getValue()){
                    phonenumber = phonenumber + el + ", ";
                }
                System.out.printf("%s: %s \n", item.getKey(), phonenumber);
            }
        }

}
