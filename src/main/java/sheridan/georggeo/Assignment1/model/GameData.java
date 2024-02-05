package sheridan.georggeo.Assignment1.model;

public class GameData {
    private final GiftBox userChoice;
    private final Gifts giftReceived;


    public GameData(GiftBox userChoice, Gifts GiftReceived) {
        this.userChoice = userChoice;
        this.giftReceived = GiftReceived;
    }

    public GiftBox getUserChoice() {
        return userChoice;
    }
    public Gifts getGiftReceived() {
        return giftReceived;
    }



    @Override
    public String toString() {
        return "GameData{" +
                "userChoice=" + userChoice +
                "GiftReceived=" + giftReceived +
                '}';
    }
}
