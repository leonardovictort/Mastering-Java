package com.bookkeeper_api.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_books")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String title;

    @Column(nullable = false,length = 100)
    private String author;

    @Column(nullable = false,unique = true,length = 20)
    private String isbn;

    @Column(name = "publication_year")
    private Integer publicationYear;

}
