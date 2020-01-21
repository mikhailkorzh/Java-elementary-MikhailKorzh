package homeworks.lecture16_collections.controller;

import homeworks.lecture16_collections.model.Song;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class SongsManager implements SongsDataMapper {
    private List<Song> songs = new ArrayList<>();
    private List<Song> newSongs = new ArrayList<>();


    public SongsManager() throws Exception {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("./src/main/java/com/company/cource/homeworks/lecture16_collections/data/SongsList.txt"));

            String line = reader.readLine();
            while (line != null) {
                String parts[] = line.split(", ");
                songs.add(new Song(parts[0], parts[1], parts[2], parts[3]));
                line = reader.readLine();
            }
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<Song> findBySongName(String songName) {
        for (Song song : songs) {
            if (song.getTitle().equals(songName)) {
                newSongs.add(song);
                Collections.sort(newSongs);
            }
        }
        return newSongs;
    }

    @Override
    public List<Song> findByGenre(String genre) {
        for (Song song : songs) {
            if (song.getGenre().equals(genre)) {
                newSongs.add(song);
                Collections.sort(newSongs);
            }
        }
        return newSongs;
    }

    public void getTopSongOrders() {
        Map<String, Integer> counts = new HashMap<>();
        for (Song song : songs) {
            if (counts.containsKey(song.getTitle())) {
                counts.put(song.getTitle(), counts.get(song.getTitle()) + 1);
            } else {
                counts.put(song.getTitle(), 1);
            }
        }

        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }


    public List<Song> getSongsOrderedByName() {
        Collections.sort(songs);
        return songs;
    }

}
