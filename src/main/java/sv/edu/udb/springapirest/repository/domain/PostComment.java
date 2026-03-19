package sv.edu.udb.repository.domain;

//FRANCISCO JAVIER SALMERON CORNEJO-SC251614

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "post_comment")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostComment {

    @Id
    private Long id;

    private String review;

}