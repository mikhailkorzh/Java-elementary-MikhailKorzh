package HomeWork20_FileDataMapper;

import homeworks.homework14_mapper.exceptions.GameNotFoundException;
import homeworks.homework14_mapper.mapping.Game;
import homeworks.homework14_mapper.mapping.GamesFileDataMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

public class GameFileDataMapperTests {

    private GamesFileDataMapper mapper;



    @BeforeEach
    public void setUp() throws GameNotFoundException {
        mapper = new GamesFileDataMapper();
    }

    @Test
    public void testGetAllRecordsInList() {
        assertEquals(4, mapper.getAllGames().size(), "Incorrect value in the games list");
    }

    @Test
    public void testFindByGameName() throws GameNotFoundException, ParseException {
        Game expectedGame = new Game("EA SPORTS FIFA 20", "12-03-2019", "Full version", 4, " Not less than 45GB", "DUALSHOCK®4", "PAL HD 720p/1080i/1080p", false, 1499.00);
        assertEquals(expectedGame, mapper.findByGameName("EA SPORTS FIFA 20"));
    }

    @Test
    public void testNotFoundByGameName() {
        assertThrows(GameNotFoundException.class,
                () -> {
                    mapper.findByGameName("EA SPORTS FIFA 21");
                });
    }

    @Test
    public void testFoundGameByPrice() throws ParseException, GameNotFoundException {
        Game expectedGame = new Game("EA SPORTS FIFA 20", "12-03-2019", "Full version", 4, " Not less than 45GB", "DUALSHOCK®4", "PAL HD 720p/1080i/1080p", false, 1499.00);
        assertEquals(expectedGame, mapper.findByPrise(1499.00));
    }

    @Test
    public void testNotFoundGameByPrice(){
        assertThrows(GameNotFoundException.class,
                () -> {
                    mapper.findByPrise(130.00);
                });
    }

    @Test
    public void testPathNotFound(){
        assertThrows(GameNotFoundException.class,
                () -> {
                    Path tmpDir = Files.createTempDirectory("tmp");
                    tmpDir.toFile().delete();
                    Path tmpFile = Files.createTempFile(tmpDir, "test", ".txt");
                });
    }

}
