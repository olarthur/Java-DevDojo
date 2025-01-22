package maratonajava.javacore.ZZKjunit.dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookTest {
    private Book book1;
    private Book book2;

    @BeforeEach
    public void setUp() {
        book1 = new Book("A vida intelectual", 9);
        book2 = new Book("A vida intelectual", 9);
    }

    @Test
    public void accessors_ReturnDate_WhenInitialized() {
        Assertions.assertEquals("A vida intelectual", book1.name());
        Assertions.assertEquals(9, book1.chapters());
    }

    @Test
    public void equals_ReturnTrue_WhenObjectsAreTheSame() {
        Assertions.assertEquals(book1, book2);
    }

    @Test
    public void hashCode_ReturnTrue_WhenObjectsAreTheSame() {
        Assertions.assertEquals(book1.hashCode(), book2.hashCode());
    }

    @Test
    public void constructor_ThrowNullPointerException_WhenNameIsNull() {
        Assertions.assertThrows(NullPointerException.class,
                () -> new Book(null, 9));
    }

    @Test
    public void isRecord_ReturnTrue_WhenCalledFromBook() {
        Assertions.assertTrue(Book.class.isRecord());
    }
}