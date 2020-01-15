package homeworks.homework14_mapper.mapping;

import homeworks.homework14_mapper.exceptions.GameNotFoundException;

public interface GamesDataMapper {

    public Game findByGameName(String gameName) throws GameNotFoundException;

    public Game findByPrise(double price) throws GameNotFoundException;

}
