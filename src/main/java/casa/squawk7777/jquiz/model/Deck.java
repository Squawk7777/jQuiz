package casa.squawk7777.jquiz.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = {"title"}) })
public class Deck extends AbstractModel {
    @NotBlank
    private String title;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    private User author;

    @ToString.Exclude
    @OneToMany(mappedBy = "deck")
    private List<Card> cards;
}
