package com.bookkeeper_api.service;

import com.bookkeeper_api.domain.model.Book;
import com.bookkeeper_api.domain.repository.BookRepository;
import com.bookkeeper_api.dto.request.BookRequestDTO;
import com.bookkeeper_api.dto.response.BookResponseDTO;
import com.bookkeeper_api.exception.BusinessException;
import com.bookkeeper_api.exception.ResourceNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public BookResponseDTO create(BookRequestDTO request){
        if(bookRepository.findByIsbn(request.getIsbn()).isPresent()){
            throw new BusinessException("ISBN '" + request.getIsbn() + "' already exists in database.");
        }

        Book book = new Book();
        BeanUtils.copyProperties(request,book);

        Book savedBook = bookRepository.save(book);

        return convertToResponseDTO(savedBook);
    }

    public List<BookResponseDTO> findAll(){
        return bookRepository.findAll()
                .stream()
                .map(this::convertToResponseDTO)
                .collect(Collectors.toList());
    }

    public BookResponseDTO findById(Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book not found with ID: " + id));
        return convertToResponseDTO(book);
    }

    private BookResponseDTO convertToResponseDTO(Book book){
        BookResponseDTO reponse = new BookResponseDTO();
        BeanUtils.copyProperties(book,reponse);
        return reponse;
    }


}
