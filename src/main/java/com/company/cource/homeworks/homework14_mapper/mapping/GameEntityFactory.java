package homeworks.homework14_mapper.mapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class GameEntityFactory {

    public static String DatePattern = "MM-dd-yyyy";

    public static GameEntity createGameEntity(String gameName, String releaseDate, String versionType, int maximalValueOfPlayers, String diskSpace, String supportedDualShock, String supportedDimension, boolean isVrSupported, double price) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DatePattern);
        try {
            var date = simpleDateFormat.parse(releaseDate);
            return new GameEntity(gameName, date, versionType, maximalValueOfPlayers, diskSpace, supportedDualShock, supportedDimension, isVrSupported, price);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;

    }

}
