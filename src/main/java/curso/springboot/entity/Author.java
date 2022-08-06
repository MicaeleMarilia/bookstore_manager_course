package curso.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity //Antes da declaração da classe, para indicar que é uma entidade
@Data //Com essa anotação temos os gets, sets e outros métodos hasCode.
@Builder //Utilizado para criação de objetos de forma segura
@NoArgsConstructor //Construtor sem argumentos
@AllArgsConstructor //Construtor com argumentos

public class Author {

    @Id //Depois da declaração da classe, para indicar a chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Para cada vez que fizer uma inserção no banco de dados incrementar o id automaticamente.
    private Long id;

    @Column(nullable = false, unique = true) //Antes da declaração da variável, para indicar que o campo não permite duplicidade
    private String name;

    @Column(nullable = false) //Antes da declaração da variável, para indicar que o campo não permite nulo
    private Integer age;
}
