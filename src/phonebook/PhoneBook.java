package phonebook;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static void main(String[] args) {
        Map<FullName, String> phoneBook = new HashMap<>();

        phoneBook.put(new FullName("Иванов", "Иван"), "89099091111");
        phoneBook.put(new FullName("Петров", "Петр"), "89299591121");
        phoneBook.put(new FullName("Сидоров", "Сидор"), "89099095555");
        phoneBook.put(new FullName("Котов", "Андрей"), "89099095555");
        phoneBook.put(new FullName("Псов", "Василий"), "89099095555");
        phoneBook.put(new FullName("Енотов", "Тимофей"), "89099095555");
        phoneBook.put(new FullName("Сурикатов", "Сергей"), "89099095555");
        phoneBook.put(new FullName("Львов", "Лев"), "89099095555");
        phoneBook.put(new FullName("Хомяков", "Сидор"), "89099095555");
        phoneBook.put(new FullName("Пузов", "Сидор"), "89099095555");
        phoneBook.put(new FullName("Голованов", "Сидор"), "89099095555");
        phoneBook.put(new FullName("Сидоренко", "Сидор"), "89099095555");
        phoneBook.put(new FullName("Попугов", "Сидор"), "89099095555");
        phoneBook.put(new FullName("Лягушев", "Сидор"), "89099095555");
        phoneBook.put(new FullName("Кротов", "Сидор"), "89099095555");
        phoneBook.put(new FullName("Слонов", "Сидор"), "89099095555");
        phoneBook.put(new FullName("Бегемотов", "Сидор"), "89099095555");
        phoneBook.put(new FullName("Вальков", "Сидор"), "89099095555");
        phoneBook.put(new FullName("Тальков", "Сидор"), "89099095555");
        phoneBook.put(new FullName("Рульков", "Сидор"), "89099095555");
        phoneBook.put(new FullName("Гуляк", "Сидор"), "89099095555");

        System.out.println(phoneBook);
    }
}
