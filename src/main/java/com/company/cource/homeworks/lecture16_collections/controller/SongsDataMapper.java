package homeworks.lecture16_collections.controller;

import homeworks.lecture16_collections.model.Song;

import java.io.FileNotFoundException;
import java.util.List;

public interface SongsDataMapper {
    public List<Song> findBySongName(String songName) throws FileNotFoundException;
    public List<Song> findByGenre(String genre) throws FileNotFoundException;


}
