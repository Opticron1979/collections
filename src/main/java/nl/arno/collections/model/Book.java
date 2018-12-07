package nl.arno.collections.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Book {
    private String isbn;
    private String title;
    private String author;
    private String genre;
    private boolean owned;
    private String stored;

}
