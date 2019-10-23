package com.LinkedChallenge2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;

    ArrayList<Song>songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs=new ArrayList<>();
    }

    public void addToAlbum(String title,double duration){
        if(findSong(title)==null){
           this.songs.add(new Song(title,duration));
        }
        else{
            System.out.println("This Song Is Already In The Album");
        }
    }

    public Song findSong(String title){
       for( Song checkedSong: this.songs ){
           if(checkedSong.getTitle().equals(title)){
               return checkedSong;
           }

        }
         return null;
    }

    public void addToPlayList(String title, LinkedList<Song>playList){
        Song checkedSong=findSong(title);
        if(checkedSong==null){
            System.out.println("This Song is not stored in the album");
        }
        else
            playList.add(checkedSong);
    }
public void addToPlayList(int trackNumber,LinkedList<Song>playList){
        if((trackNumber-1>0) && (trackNumber-1<=songs.size())){
         playList.add(this.songs.get(trackNumber-1));
    }
    else{
            System.out.println("Its Out Of Bound");
        }
}
}
