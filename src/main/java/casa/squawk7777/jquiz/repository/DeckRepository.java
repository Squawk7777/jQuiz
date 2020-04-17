package casa.squawk7777.jquiz.repository;

import casa.squawk7777.jquiz.model.Deck;
import casa.squawk7777.jquiz.model.User;

import java.util.List;

public interface DeckRepository extends GenericRepository<Deck> {
    List<Deck> findByAuthor(User author);
}
