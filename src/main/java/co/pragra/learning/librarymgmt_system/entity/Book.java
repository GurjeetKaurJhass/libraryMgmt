package co.pragra.learning.librarymgmt_system.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
@Data
@Builder
public class Book {
    private int id;
    private String isbn;
    private String title;
    private String category;
    private Author author;
    private Date publishDate;
    private Date createDate;

}
