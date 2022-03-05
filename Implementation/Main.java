import java.util.ArrayList;

public class Main{
    private static ArrayList<Album> albums = new ArrayList<>();
    public static void main(String[] args){

       
        Album album = new Album(name:"Album1", artist:"ac/dc");

        album.addSong(title:"tnt", duration: 4.5);
        album.addSong(title:"highway to hell", duration: 3.5);
        album.addSong(title:"thunderstruck", duration: 5.0);
        albums.add(album);

        album = new Album(name:"Album2", artist:"eminem");

        album.addSong(title:"rap god", duration: 4.5);
        album.addSong(title:"not afraid", duration: 5.5);
        album.addSong(title:"lose yourself", duration: 2.5);

        albums.add(album);
        
    }
}