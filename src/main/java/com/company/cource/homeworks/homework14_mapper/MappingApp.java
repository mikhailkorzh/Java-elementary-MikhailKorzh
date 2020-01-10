package homeworks.homework14_mapper;

import homeworks.homework14_mapper.exceptions.NotFoundEntityException;
import homeworks.homework14_mapper.mapping.GamesFileDataMapper;

import java.io.IOException;

public class MappingApp {
    public static void main(String[] args) throws NotFoundEntityException, IOException {
        GamesFileDataMapper mapper = new GamesFileDataMapper();
        System.out.println(mapper.findByGameName("EA SPORTS™ FIFA 20"));
        //System.out.println(mapper.findByPrise(3.00));
       //System.out.println(mapper.getAllGames().toString());

    }
}
