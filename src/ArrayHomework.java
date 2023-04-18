import java.util.*;

public class ArrayHomework {
    /**
     * Завдання3. Написати функцію, яка:
     * приймає як вхідний параметр масив рядків;
     * із заданого списку рядків знаходить перші два,
     * в яких кожна літера трапляється парну кількість разів
     * (наприклад "мама", "тато", "їж їжак желе");
     * знаходить набір унікальних символів у словах знайдених слів
     * (для наведеного прикладу "мама", "папа" це буде [м а п]);
     * повертає набір літер у вигляді масиву або будь-якого типу колекції,
     * порядок літер при цьому значення не має.
     * Рядок перетворюється на набір символів методом String.toCharArray().
     * Застосувати якнайбільше різних видів циклів (мінімум 2).
     * Використовувати ключові слова керування циклами.
     **/

    public static void task() {
        String[] words = new String[]{"my mummy", "dada", "your daddy", "mama", "haha"};
        evenFinder(words);
    }

    public static void evenFinder(String[] words) {
        List<String> helpList = new ArrayList<>();
        UP_LOOP:
        for (String word : words) {
            if (helpList.size() < 2) {
                char[] letter = word.toCharArray();
                Map<Character, Integer> helpMap = new HashMap<>();
                for (Character character : letter) {
                    if (helpMap.containsKey(character)) {
                        Integer value = helpMap.get(character) + 1;
                        helpMap.put(character, value);
                    } else {
                        helpMap.put(character, 1);
                    }
                }
                boolean isConvinientWord = true;
                for (Character key : helpMap.keySet()) {
                    if (helpMap.get(key) % 2 != 0) {
                        isConvinientWord = false;
                        continue UP_LOOP;
                    }
                }
                if (isConvinientWord) {
                    helpList.add(word);
                }
            } else {
                break;
            }
        }
        Set<Character> mySet = new HashSet<>();
        for (String word : helpList) {
            for (Character character : word.toCharArray()) {
                mySet.add(character);
            }
        }
        System.out.println(mySet);
    }
}



