package curso.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private Integer  pages;

    @Column(nullable = false)
    private Integer chapters;

    @Column(nullable = false)
    private String isbn;

    @Column(name = "publisher_name", nullable = false, unique = false)
    private String publisherName;

    //Indica relação 1 para 1 entre as tabelas
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    //() Estratégia de performance para criar, atualizar e remover

    @JoinColumn(name = "author_id") //Indicar qual coluna vai fazer a relação (Chave Estrangeira)
    private Author author;

}
