package com.bookkeeper_api.dto.request;

import lombok.Data;

@Data
public class BookRequestDTO {
    private String title;
    private String author;
    private String isbn;
    private Integer publicationYear;
}
