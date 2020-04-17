package casa.squawk7777.jquiz.service;

import casa.squawk7777.jquiz.model.Deck;
import casa.squawk7777.jquiz.model.User;
import casa.squawk7777.jquiz.repository.DeckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeckService extends AbstractService<Deck> {
    protected DeckRepository repo2;

    @Autowired
    public DeckService(DeckRepository repo) {
        this.repo = repo;
        this.repo2 = repo;
    }

    public List<Deck> findOwnedDecks(User author) {
        return repo2.findByAuthor(author);
    }
}
