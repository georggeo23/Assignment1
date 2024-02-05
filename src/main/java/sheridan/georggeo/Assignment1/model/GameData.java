package sheridan.georggeo.Assignment1.model;

public class GameData {
    private final GiftBox userChoice;
    private final Gifts itemReceived;


    public GameData(GiftBox userChoice, Gifts itemReceived) {
        this.userChoice = userChoice;
        this.itemReceived = itemReceived;
    }

    public GiftBox getUserChoice() {
        return userChoice;
    }
    public Gifts getItemReceived() {
        return itemReceived;
    }



    @Override
    public String toString() {
        return "GameData{" +
                "userChoice=" + userChoice +
                "itemReceived=" + itemReceived +
                '}';
    }
}
