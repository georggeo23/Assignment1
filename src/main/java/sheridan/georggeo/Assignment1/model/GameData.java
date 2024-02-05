package sheridan.georggeo.Assignment1.model;

public class GameData {
    private final GiftBox userChoice;
    private final Gifts item1;
    private final Gifts item2;
    private final Gifts item3;
    private final Gifts giftReceived;


    public GameData(GiftBox userChoice,  Gifts item1, Gifts item2, Gifts item3,Gifts GiftReceived) {
        this.userChoice = userChoice;
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
        this.giftReceived = GiftReceived;
    }

    public GiftBox getUserChoice() {
        return userChoice;
    }
    public Gifts getItem1Received() {
        return item1;
    }

    public Gifts getItem2Received() {
        return item2;
    }

    public Gifts getItem3Received() {
        return item3;
    }
    public Gifts getGiftReceived() {
        return giftReceived;
    }



    @Override
    public String toString() {
        return "GameData{" +
                "userChoice=" + userChoice +
                ", item1=" + item1 +
                ", item2=" + item2 +
                ", item3=" + item3 +
                '}';
    }
}
