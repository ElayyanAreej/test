package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class SongController {
    @Autowired
    SongRepasotiries songRepasotiries;

//    A user should be able to see information about all the songs on the site.
//    A user should be able to view a page with data about one particular album.
//    A user should be able to add songs to an album.
//    A user should be able to see the songs that belong to an album when looking at that album.

    @GetMapping("/songs")
    @ResponseBody
    public String splashPage() {
        Song a1 = new Song("songName1", 5, 1, "Album1");
        Song a2 = new Song("songName1", 5, 1, "Album1");
        Song a3 = new Song("songName1", 5, 1, "Album1");

        ArrayList<Song> list = new ArrayList<Song>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        return a1.toString()+"<br>"+a2.toString()+"<br>"+a3.toString()+"<br>";
    }

    @GetMapping("/addsongs")
    public void addAlbum(){
        Song a1 = new Song("songName1", 5, 1, "Album1");
        songRepasotiries.save(a1);
    }

}
