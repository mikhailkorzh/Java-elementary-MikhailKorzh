package homeworks.lecture16_collections.start;

import homeworks.lecture16_collections.controller.SongsManager;

public class Jukebox {
    public void startUpload() throws Exception {
        //System.out.printf(new SongsManager().findBySongName("Somersault").toString());
        //System.out.println(new SongsManager().findByGenre("Rap"));
        new SongsManager().getTopSongOrders();
        //System.out.println(new SongsManager().getSongsOrderedByName());


    }
}
