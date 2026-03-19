package sv.edu.udb.repository.domain;

//FRANCISCO JAVIER SALMERON CORNEJO-SC251614

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "post")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    @Id
    private Long id;

    private String title;

    private LocalDate postDate;

}

//FRANCISCO JAVIER SALMERON CORNEJO-SC251614