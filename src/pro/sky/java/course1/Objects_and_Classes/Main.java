package pro.sky.java.course1.Objects_and_Classes;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание: Напишите небольшой библиотечный справочник, где хранится информация о книгах.");

        Author alexandrPushkin = new Author("Alexandr", "Pushkin"); // на основе класса Author создаем объект и записываем ссылку на него в объектную переменную alexandrPushkin
        System.out.println("alexandrPushkin.getFirstName() = " + alexandrPushkin.getFirstName()); // Вызываем геттер getFirstName() из объекта, созданного на основе класса Author
        System.out.println("alexandrPushkin.getLastName() = " + alexandrPushkin.getLastName()); // Вызываем геттер getLastName() из объекта, созданного на основе класса Author

        Author mikhailSholokhov = new Author("Mikhail", "Sholokhov"); // на основе класса Author создаем объект и записываем ссылку на него в объектную переменную mikhailSholokhov
        System.out.println("mikhailSholokhov.getFirstName() = " + mikhailSholokhov.getFirstName()); // Вызываем геттер getFirstName() из объекта, созданного на основе класса Author
        System.out.println("mikhailSholokhov.getLastName() = " + mikhailSholokhov.getLastName()); // Вызываем геттер getLastName() из объекта, созданного на основе класса Author


        Book dubrovsky  = new Book("Dubrovsky", alexandrPushkin, 1841 ); // на основе класса Book создаем объект и записываем ссылку на него в объектную переменную dubrovsky
        System.out.println("dubrovsky.getBookName() = " + dubrovsky.getBookName()); // Вызываем геттер getBookName() из объекта, созданного на основе класса Book
        System.out.println("dubrovsky.getAuthor() = " + dubrovsky.getAuthor()); // Вызываем геттер getBookName() из объекта, созданного на основе класса Book
        System.out.println("dubrovsky.getPublishingYear() = " + dubrovsky.getPublishingYear()); // Вызываем геттер getPublishingYear() из объекта, созданного на основе класса Book

        Book tihiyDon  = new Book("Tihiy Don", mikhailSholokhov, 1928 ); // на основе класса Book создаем объект и записываем ссылку на него в объектную переменную tihiyDon
        System.out.println("tihiyDon.getBookName() = " + tihiyDon.getBookName()); // Вызываем геттер getBookName() из объекта, созданного на основе класса Book
        System.out.println("tihiyDon.getAuthor() = " + tihiyDon.getAuthor()); // Вызываем геттер getBookName() из объекта, созданного на основе класса Book
        System.out.println("tihiyDon.getPublishingYear() = " + tihiyDon.getPublishingYear()); // Вызываем геттер getPublishingYear() из объекта, созданного на основе класса Book

        tihiyDon.setPublishingYear(1940); // измение года публикации книги tihiyDon с помощью сеттера.
        System.out.println("tihiyDon.getPublishingYear() = " + tihiyDon.getPublishingYear()); // Вызываем геттер getPublishingYear() из объекта, созданного на основе класса Book
    }
}
