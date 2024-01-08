package com.example.bookshop.dao;

import com.example.bookshop.entity.Book;
import com.example.bookshop.entity.BookId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorDao extends JpaRepository<Book, BookId> {
}
