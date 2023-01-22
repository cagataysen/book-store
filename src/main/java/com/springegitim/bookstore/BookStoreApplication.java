package com.springegitim.bookstore;

import com.springegitim.bookstore.model.Book;
import com.springegitim.bookstore.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BookStoreApplication implements CommandLineRunner {


	private final BookRepository bookRepository;

	public BookStoreApplication(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}


	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}


	//Uygulama ayağa kalkarken yapmak istediklerimizi Run da yapıyoruz.
	@Override
	public void run(String... args) throws Exception {
		Book book1 = Book.builder().name("Harry Potter")
				.author("J.K. Rowling")
				.price(10.0)
				.stock(10).build();

		Book book2 = Book.builder().name("Harry Potter 2")
				.author("J.K. Rowling")
				.price(11.1)
				.stock(10).build();

		Book book3 = Book.builder().name("The Secret")
				.author("Cagatay Sen")
				.price(15.5)
				.stock(10).build();

		bookRepository.saveAll(Arrays.asList(book1,book2,book3));
	}


}
