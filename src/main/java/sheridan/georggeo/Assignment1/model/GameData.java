package sheridan.georggeo.Assignment1.model;

public class GameData {
    private final GiftBox userChoice;
    private final Gifts GiftReceived;


    public GameData(GiftBox userChoice, Gifts GiftReceived) {
        this.userChoice = userChoice;
        this.GiftReceived = GiftReceived;
    }

    public GiftBox getUserChoice() {
        return userChoice;
    }
    public Gifts getGiftReceived() {
        return GiftReceived;
    }



    @Override
    public String toString() {
        return "GameData{" +
                "userChoice=" + userChoice +
                "GiftReceived=" + GiftReceived +
                '}';
    }
}
