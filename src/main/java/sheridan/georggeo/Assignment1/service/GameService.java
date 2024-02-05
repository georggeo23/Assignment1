package sheridan.georggeo.Assignment1.service;

import sheridan.georggeo.Assignment1.model.GiftBox;
import sheridan.georggeo.Assignment1.model.Gifts;
import sheridan.georggeo.Assignment1.model.GameData;

public interface GameService {
    GameData getGameData(GiftBox playerChestChoice, Gifts itemReceived);

    Gifts getRandomItem();
}
