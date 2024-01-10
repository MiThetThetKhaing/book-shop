package com.example.bookshop.service;

import com.example.bookshop.dto.CartItem;
import com.example.bookshop.entity.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

@Service
@RequiredArgsConstructor
public class CartService {

    private final CartBean cartBean;

    public void addToCart(Book book) {
        cartBean.addCartItem(toCartItem(book));
    }
    @ModelAttribute("cartSize")
    public Integer cartSize() {
        return cartBean.cartSize();
    }
    private CartItem toCartItem(Book book) {
        return new CartItem(
                book.getId(),
                book.getIsbn(),
                book.getTitle(),
                book.getPrice(),
                1
        );
    }
}
