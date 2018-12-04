package nl.arno.collections.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private String isbn;
    private String title;
    private String author;
    private String genre;
    private boolean owned;

}
