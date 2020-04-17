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
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Card extends AbstractModel {
    @NotBlank
    private String frontText;

    @NotBlank
    private String backText;

    @NotNull
    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    private User author;

    @NotNull
    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    private Deck deck;

}
