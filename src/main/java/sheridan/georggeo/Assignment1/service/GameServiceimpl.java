package sheridan.georggeo.Assignment1.service;

import sheridan.georggeo.Assignment1.model.Gifts;
import sheridan.georggeo.Assignment1.model.GiftBox;
import sheridan.georggeo.Assignment1.model.GameData;
import org.springframework.stereotype.Service;
import java.util.Random;
@Service
public class GameServiceimpl implements GameService{
    private final Random random;

    public GameServiceimpl(Random random) {
        this.random = random;
    }

    public GameServiceimpl() { this(new Random()); }

    @Override
    public GameData getGameData(GiftBox playerChestChoice, Gifts giftReceived) {

        Gifts item1 = getRandomItem();
        Gifts item2 = getRandomItemsExcept(item1);
        Gifts item3 = getRandomItemExcept(item1, item2);

        return new GameData(playerChestChoice,item1,item2,item3, giftReceived);
    }

    @Override
    public Gifts getRandomItem() {
        Gifts[] values = Gifts.values();
        return values[random.nextInt(values.length)];
    }

    private Gifts getRandomItemsExcept(Gifts exludeItem){
        Gifts randomItem = getRandomItem();
        while (randomItem == exludeItem){
            randomItem = getRandomItem();
        }
        return randomItem;
    }

    private Gifts getRandomItemExcept(Gifts excludeItem1, Gifts excludeItem2){
        Gifts randomItems = getRandomItem();
        while (randomItems == excludeItem1 || randomItems == excludeItem2){
            randomItems = getRandomItem();
        }
        return randomItems;
    }
    private Gifts selectRandomItem(GiftBox selectedChest, Gifts item1, Gifts item2, Gifts item3) {

        switch (selectedChest) {
            case Box1:
                return item1;
            case Box2:
                return item2;
            case Box3:
                return item3;
            default:
                return null;
        }
    }
}
