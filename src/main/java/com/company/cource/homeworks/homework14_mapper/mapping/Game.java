package homeworks.homework14_mapper.mapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Game {

    private String gameName;
    private Date releaseDate;
    private String versionType;
    private int maximalValueOfPlayers;
    private String diskSpace;
    private String supportedDualShock;
    private String supportedDimension;
    private boolean isVrSupported;
    private double price;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yyyy");

    public Game(String gameName, String releaseDate, String versionType, int maximalValueOfPlayers, String diskSpace, String supportedDualShock, String supportedDimension, boolean isVrSupported, double price) throws ParseException {
        this.gameName = gameName;
        this.releaseDate = simpleDateFormat.parse(String.valueOf(releaseDate));
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return maximalValueOfPlayers == game.maximalValueOfPlayers &&
                isVrSupported == game.isVrSupported &&
                Double.compare(game.price, price) == 0 &&
                gameName.equals(game.gameName) &&
                releaseDate.equals(game.releaseDate) &&
                versionType.equals(game.versionType) &&
                diskSpace.equals(game.diskSpace) &&
                supportedDualShock.equals(game.supportedDualShock) &&
                supportedDimension.equals(game.supportedDimension) &&
                simpleDateFormat.equals(game.simpleDateFormat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameName, releaseDate, versionType, maximalValueOfPlayers, diskSpace, supportedDualShock, supportedDimension, isVrSupported, price, simpleDateFormat);
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