package com.mcs.mikyas.article;

import java.util.ArrayList;

public class Mockfactory {
    public static ArrayList<Article> getmockedarticles() {
        ArrayList<Article> output = new ArrayList<>();
        output.add(new Article("Joana", "gone","02/23/99","https://www.newdvdreleasedates.com/images/posters/large/gone-girl-2014-06.jpg","www/gooo/goone"));
        output.add(new Article("Joana", "gone","02/23/99","https://www.newdvdreleasedates.com/images/posters/large/gone-girl-2014-06.jpg","www/gooo/goone"));
        output.add(new Article("Joana", "gone","02/23/99","https://www.newdvdreleasedates.com/images/posters/large/gone-girl-2014-06.jpg","www/gooo/goone"));








        return output;
    }
}
