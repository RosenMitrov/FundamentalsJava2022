package fund06ObjectsAndClasses.lab.definingSimpleClasses.P04SongsConstructor;

import java.util.List;

//created by R.M.
public class Song {
    private String typeList;
    private String name;
    private String time;

    public Song(String typeList, String name, String time) {
        this.typeList = typeList;
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return this.name;
    }

    public String getTypeList() {
        return this.typeList;
    }

    public static void printNamesOfTheSongsAsPerCommand(List<Song> songsList, String command) {
        for (Song song : songsList) {
            if (command.equals("all")) {
                System.out.println(song.getName());
            } else {
                if (song.getTypeList().equals(command)){
                    System.out.println(song.getName());
                }
            }
        }
    }
}
/*
4.	Songs
Define a class Song, which holds the following information about songs:
Type List, Name, and Time.
On the first line, you will receive the number of songs - N.
On the next N-lines you will be receiving data in the following format: "{typeList}_{name}_{time}".
On the last line, you will receive "Type List" / "all". Print only the names of the songs which are from that Type List / All songs.

 */
