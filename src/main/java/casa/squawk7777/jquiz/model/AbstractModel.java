package casa.squawk7777.jquiz.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

// https://mdeinum.github.io/2019-02-13-Lombok-Data-Ojects-Arent-Entities/
// https://www.artima.com/lejava/articles/equality.html

@Data
@MappedSuperclass
abstract public class AbstractModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
