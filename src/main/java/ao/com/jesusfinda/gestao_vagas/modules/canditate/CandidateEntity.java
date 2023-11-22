package ao.com.jesusfinda.gestao_vagas.modules.canditate;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity(name = "candidate") //Criar uma tabela através da entidade(class)
public class CandidateEntity {
    
    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.UUID) //Anotion
    private UUID id;

    public CandidateEntity() {
    }
    @NotBlank
    private String name;

    @Pattern(regexp = "\\S+", message = "O campo [username] não deve conter espaço")
    private String username;

    @Email(message = "O campo (Email) deve conter um e-mail válido")
    private String email;

    @Length(min = 10, max = 100, message = "A senha deve conter entre (10) e (100) caracteres")
    private String password;

    private String description;
    private String curriculum;

    
}
