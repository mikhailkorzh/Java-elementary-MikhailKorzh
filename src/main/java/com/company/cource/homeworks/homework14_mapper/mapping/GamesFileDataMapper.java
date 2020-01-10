package homeworks.homework14_mapper.mapping;

import homeworks.homework14_mapper.exceptions.NotFoundEntityException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class GamesFileDataMapper implements GamesDataMapper {

    private List<GameEntity> games = new ArrayList<>();

    public GamesFileDataMapper() throws NotFoundEntityException, IOException {
        GameEntityFactory factory = new GameEntityFactory();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\JavaCoreCources\\src\\main\\java\\com\\company\\cource\\homeworks\\homework14_mapper\\newGameStore.txt"));

            String line = reader.readLine();
            while (line != null) {
                String parts[] = line.split(",");
                games.add(factory.createGameEntity(parts[0], parts[1], parts[2], Integer.valueOf(parts[3]), parts[4], parts[5], parts[6], Boolean.valueOf(parts[7]), Double.parseDouble(parts[8])));
                line = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            throw new NotFoundEntityException("The system cannot find the file");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    @Override
    public GameEntity findByGameName(String gameName) throws NotFoundEntityException {
         for(GameEntity game: games){
             if(game.getGameName().equals(gameName)){
                 return game;
             }
         }
       throw new NotFoundEntityException("Nothing found by request " + gameName);
    }

    @Override
    public GameEntity findByPrise(double price) throws NotFoundEntityException {
        for(GameEntity game: games){
            if(game.getGameName().equals(price)){
                return game;
            }
        }
        throw new NotFoundEntityException("Nothing found by request " + price);
    }

    public List<GameEntity> getAllGames() {
        return games;
    }
}
