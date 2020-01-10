package homeworks.homework14_mapper.mapping;

import java.util.Date;

public class GameEntity {

    GameEntityFactory factory = new GameEntityFactory();
    private String gameName;
    private Date releaseDate;
    private String versionType;
    private int maximalValueOfPlayers;
    private String diskSpace;
    private String supportedDualShock;
    private String supportedDimension;
    private boolean isVrSupported;
    private double price;

    public GameEntity(String gameName, Date releaseDate, String versionType, int maximalValueOfPlayers, String diskSpace, String supportedDualShock, String supportedDimension, boolean isVrSupported, double price) {
        this.gameName = gameName;
        this.releaseDate = releaseDate;
        this.versionType = versionType;
        this.maximalValueOfPlayers = maximalValueOfPlayers;
        this.diskSpace = diskSpace;
        this.supportedDualShock = supportedDualShock;
        this.supportedDimension = supportedDimension;
        this.isVrSupported = isVrSupported;
        this.price = price;
    }

    public String getGameName() {
        return gameName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public String getVersionType() {
        return versionType;
    }

    public int getMaximalValueOfPlayers() {
        return maximalValueOfPlayers;
    }

    public String getSupportedDimension() {
        return supportedDimension;
    }

    public boolean isVrSupported() {
        return isVrSupported;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "gameName: " + gameName + "\n" +
                "releaseDate: " + releaseDate + "\n" +
                "versionType: " + versionType + "\n" +
                "maximalValueOfPlayers: " + maximalValueOfPlayers + "\n" +
                "diskSpace: " + diskSpace + "\n" +
                "supportedDualShock: " + supportedDualShock + "\n" +
                "supportedDimension: " + supportedDimension + "\n" +
                "isVrSupported: " + isVrSupported + "\n" +
                "price: " + price + " UAH \n";
    }
}
