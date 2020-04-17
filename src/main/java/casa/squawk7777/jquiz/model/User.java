package casa.squawk7777.jquiz.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = {"login"}), @UniqueConstraint(columnNames = {"email"}) })
public class User extends AbstractModel {
    @Length(min = 3, max = 25)
    private String name;

    @Length(min = 3, max = 50)
    private String login;

    @NotBlank
    private String password;

    @Email
    private String email;

    @ToString.Exclude
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "author")
    private List<Deck> authoredDecks;

    @ToString.Exclude
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "deck_follower",
            joinColumns = { @JoinColumn(name = "user_id") },
            inverseJoinColumns = { @JoinColumn(name = "deck_id") }
    )
    private List<Deck> followedDecks;


}
