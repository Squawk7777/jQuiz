package casa.squawk7777.jquiz.service;

import casa.squawk7777.jquiz.model.Card;
import casa.squawk7777.jquiz.model.Deck;
import casa.squawk7777.jquiz.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CardServiceTest {
    @Autowired
    private CardService cardService;

    @Autowired
    private UserService userService;

    @Autowired
    private DeckService deckService;

    @Test
    public void findById_CardExist_CardReturned() {
        User author = User.builder().login("userOne").name("UOne").email("no@one.net").password("5745").build();
        userService.save(author);

        Deck deck = Deck.builder().title("First Deck").author(author).build();
        deckService.save(deck);

        Card card = Card.builder().frontText("Front Text").backText("Back Text").author(author).deck(deck).build();
        cardService.save(card);
    }
}
