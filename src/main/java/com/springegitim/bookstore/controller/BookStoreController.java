package com.springegitim.bookstore.controller;


import com.springegitim.bookstore.dto.BookOrderRequest;
import com.springegitim.bookstore.model.Order;
import com.springegitim.bookstore.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/bookstore")
public class BookStoreController {

    private final OrderService orderService;

    public BookStoreController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok("rest api is working hello world");
    }

    //@RequestBody kullanım amacı: datayı json olarak yollayacağız, obje olarak döndürcez, bookorderrequest objesine çeviriyoruz
    @PostMapping
    public ResponseEntity<Order> putAnOrder(@RequestBody BookOrderRequest bookOrderRequest) {
        Order order = orderService.putAnOrder(bookOrderRequest.getBookIdList(), bookOrderRequest.getUserName());
        return ResponseEntity.ok(order);
    }

}
