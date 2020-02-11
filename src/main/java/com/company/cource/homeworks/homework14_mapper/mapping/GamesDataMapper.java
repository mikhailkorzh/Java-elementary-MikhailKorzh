package homeworks.homework14_mapper.mapping;

import homeworks.homework14_mapper.exceptions.GameNotFoundException;

import java.util.List;

public interface GamesDataMapper {

    public Game findByGameName(String gameName) throws GameNotFoundException;

    public List<Game> getAllGames();



}