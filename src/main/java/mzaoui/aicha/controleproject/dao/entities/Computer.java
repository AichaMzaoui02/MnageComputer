package mzaoui.aicha.controleproject.dao.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Getter
@Setter
@ToString
public class Computer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id_Pc;
    private String proce;
    private String ram;
    private String hardDrive;
    private Double price;
    private String macAddress;

}
