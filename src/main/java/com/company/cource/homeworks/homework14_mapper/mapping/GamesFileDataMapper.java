package homeworks.homework14_mapper.mapping;

import homeworks.homework14_mapper.exceptions.GameNotFoundException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class GamesFileDataMapper implements GamesDataMapper {

    private List<Game> games = new ArrayList<>();

    public GamesFileDataMapper() throws GameNotFoundException {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("./src/main/java/com/company/cource/homeworks/homework14_mapper/newGameStore.txt"));

            String line = reader.readLine();
            while (line != null) {
                String parts[] = line.split(",");
                games.add(new Game(parts[0], parts[1], parts[2], Integer.valueOf(parts[3]), parts[4], parts[5], parts[6], Boolean.valueOf(parts[7]), Double.parseDouble(parts[8])));
                line = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            throw new GameNotFoundException("The system cannot find the file");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    @Override
    public Game findByGameName(String gameName) throws GameNotFoundException {
         for(Game game: games){
             if(game.getGameName().equals(gameName)){
                 return game;
             }
         }
       throw new GameNotFoundException("Nothing found by request " + gameName);
    }

    @Override
    public Game findByPrise(double price) throws GameNotFoundException {
        for(Game game: games){
            if(game.getGameName().equals(price)){
                return game;
            }
        }
        throw new GameNotFoundException("Nothing found by request " + price);
    }

    public List<Game> getAllGames() {
        return games;
    }
}
