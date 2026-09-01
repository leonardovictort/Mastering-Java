package com.bookkeeper_api.controller;

import com.bookkeeper_api.dto.request.BookRequestDTO;
import com.bookkeeper_api.dto.response.BookResponseDTO;
import com.bookkeeper_api.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public ResponseEntity<BookResponseDTO> create(@RequestBody BookRequestDTO request){
        BookResponseDTO response = bookService.create(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<BookResponseDTO>> findAll(){
        List<BookResponseDTO> list = bookService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookResponseDTO> findById(@PathVariable Long id) {
        BookResponseDTO response = bookService.findById(id);
        return ResponseEntity.ok(response);
    }

}
