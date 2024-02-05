package sheridan.georggeo.Assignment1.service;

import sheridan.georggeo.Assignment1.model.GiftBox;
import sheridan.georggeo.Assignment1.model.Gifts;
import sheridan.georggeo.Assignment1.model.GameData;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
public interface GameService {
    GameData getGameData(GiftBox playerGiftChoice, Gifts itemReceived);

    Gifts getRandomItem();
}
