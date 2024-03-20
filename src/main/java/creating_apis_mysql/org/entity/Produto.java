package creating_apis_mysql.org.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CAR_TBL")
public class Produto {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String marca;
    private String modelo;
    private double potencia;
}
