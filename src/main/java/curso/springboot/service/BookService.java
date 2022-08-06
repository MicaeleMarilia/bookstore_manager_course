package curso.springboot.service;

import curso.springboot.dto.MessageResponseDTO;
import curso.springboot.entity.Book;
import curso.springboot.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service //Indica ao framework que sera gerenciado pelo spring e tera outros serviços que podem ser enjetados

public class BookService {

    private BookRepository bookRepository; //utilizar a classe Repository

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //metodo responsavel por realizar o cadastro dos livros
    //Criar a classe MessageResponseDTO para retornar a mensagem
    public MessageResponseDTO create(Book book){

        //Chama o metodo save que esta dentro do Repository
        Book savedBook = bookRepository.save(book);
        return MessageResponseDTO.builder()
                .message("Book created whit ID " + savedBook.getId())
                .build();
    }
}
