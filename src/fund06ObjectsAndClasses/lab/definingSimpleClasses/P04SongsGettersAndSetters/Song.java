package fund06ObjectsAndClasses.lab.definingSimpleClasses.P04SongsGettersAndSetters;

import java.util.List;

//created by R.M.
public class Song {
    private String typeList;
    private String name;
    private String time;

    public void setTypeList(String typeList) {
        this.typeList = typeList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return this.name;
    }

    public String getTypeList() {
        return this.typeList;
    }

    public static void printSongNamesAsPerCommand(List<Song> songsList, String command) {
        for (Song song : songsList) {
            if (command.equals("all")) {
                System.out.println(song.getName());
            } else {
                if (command.equals(song.getTypeList())) {
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