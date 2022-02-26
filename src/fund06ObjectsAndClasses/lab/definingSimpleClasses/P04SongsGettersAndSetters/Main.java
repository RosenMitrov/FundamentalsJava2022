package fund06ObjectsAndClasses.lab.definingSimpleClasses.P04SongsGettersAndSetters;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static fund06ObjectsAndClasses.lab.definingSimpleClasses.P04SongsGettersAndSetters.Song.printSongNamesAsPerCommand;

//created by R.M.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSongs = Integer.parseInt(scanner.nextLine());

        List<Song> songsList = new ArrayList<>();
        for (int i = 0; i < numberOfSongs; i++) {
            String[] data = scanner.nextLine().split("_");
            String type = data[0];
            String name = data[1];
            String time = data[2];

            Song currentSong = new Song();
            currentSong.setTypeList(type);
            currentSong.setName(name);
            currentSong.setTime(time);
            songsList.add(currentSong);
        }

        String command = scanner.nextLine();
        printSongNamesAsPerCommand(songsList, command);

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