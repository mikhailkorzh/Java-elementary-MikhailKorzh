package homeworks.homework14_mapper.mapping;

import homeworks.homework14_mapper.exceptions.NotFoundEntityException;

public interface GamesDataMapper {

    public GameEntity findByGameName(String gameName) throws NotFoundEntityException;

    public GameEntity findByPrise(double price) throws NotFoundEntityException;

}
