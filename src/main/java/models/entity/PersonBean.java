package models.entity;


import jakarta.persistence.*;
import lombok.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Data

@Table(name = "person")
public class PersonBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String birthdate;
    private String curp;



}
