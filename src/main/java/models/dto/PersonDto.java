package models.dto;



import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class PersonDto {

    private Integer id;
    private String name;
    private String birthdate;
    private String curp;

}
