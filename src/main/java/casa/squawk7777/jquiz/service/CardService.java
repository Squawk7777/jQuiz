package casa.squawk7777.jquiz.service;

import casa.squawk7777.jquiz.model.Card;
import casa.squawk7777.jquiz.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CardService extends AbstractService<Card> {
    protected CardRepository repo2;

    @Autowired
    public CardService(CardRepository repo) {
        this.repo = repo;
        this.repo2 = repo;
    }

}
