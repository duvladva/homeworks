package pro.sky.java.course1.Objects_and_Classes;

public class Author {
    private String firstName;// описание свойств (полей) класса Author
    private String lastName; // описание свойств (полей) класса Author

    public Author(String firstName, String lastName)// конструктор объектов на основе класса Author

    {
        this.firstName = firstName; // присваивание полю firstName, принадлежащего классу Author, значения параметра firstName, переданного конструктору класса Author
        this.lastName = lastName; // присваивание полю lastName, принадлежащего классу Author, значения параметра lastName, переданного конструктору класса Author

    }

    public String getFirstName() {  // геттер — метод, который возвращает значение поля firstName
        return this.firstName;
    }

    public String getLastName() {  // геттер — метод, который возвращает значение поля lastName
        return this.lastName;
    }
}
