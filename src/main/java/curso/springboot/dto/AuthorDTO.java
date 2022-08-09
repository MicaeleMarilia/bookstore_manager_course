package curso.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDTO {

    private Long id;

    @NotBlank //Informa que o campo não pode ser vazio
    @Size(max = 200) //Indica o tamanho maximo de caracteres
    private String name;

    @NotNull //Informa que o campo não pode ser nulo
    @Size(max = 100)
    private Integer age;
}

