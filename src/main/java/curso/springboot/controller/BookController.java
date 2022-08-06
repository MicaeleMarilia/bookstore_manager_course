package curso.springboot.controller;

import curso.springboot.dto.MessageResponseDTO;
import curso.springboot.entity.Book;
import curso.springboot.repository.BookRepository;
import curso.springboot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Indica que é um controller e uma API Rest, gerenciado pelo próprio spring
@RequestMapping("/api/v1/books")  //Endpoint de acesso a esse controller

public class BookController {

    //utilizar a classe Service
    private BookService bookService;

    @Autowired //o bean da classe Book será injetado no construtor
    //gerar o construtor para injeção de dependecis e ser utilizado dentro do controller
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping //Marcando a operação como do tipo Post

    public MessageResponseDTO create(@RequestBody Book book){
    //@RequestBody indica o corpo do tipo livro

        return bookService.create(book);
    }
}
