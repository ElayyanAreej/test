package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class AlbumController {

    //Create a route at /albums that shows three album instances. (These will be hardcoded for today’s lab;
    // create an array that contains three albums, and then display those three on the page.)
    @GetMapping("/albums")
    @ResponseBody
    public String splashPage() {
        Album a1 = new Album("albumName1", "Ali", 1, 60, ".....");
        Album a2 = new Album("albumName2", "Yahya", 2, 60, ".....");
        Album a3 = new Album("albumName3", "Yasmeen", 3, 60, ".....");

        ArrayList<Album> list = new ArrayList<Album>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
         return a1.toString()+"<br>"+a2.toString()+"<br>"+a3.toString()+"<br>";
    }


}
