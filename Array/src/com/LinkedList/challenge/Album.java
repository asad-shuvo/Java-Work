package com.LinkedList.challenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song>songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs=new ArrayList<Song>();
    }

    public boolean addSong(String title,double duration){
        if(findSong(title)==null){
            this.songs.add(new Song(title,duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title){
        for(Song checkedSong: this.songs){
            if(checkedSong.getTitle().equals(title)){
                return checkedSong;
            }

        }
        return  null;
    }


    public boolean addToPlayList(int trackNumber, LinkedList<Song>playList){
        int iindex=trackNumber-1;
        if((iindex>0) && (iindex<=this.songs.size())){
            playList.add(this.songs.get(iindex));
            return true;
        }
        System.out.println("This Album Does Not Have A Track   "+trackNumber);
        return false;
    }

    public boolean addToPlayList(String title,LinkedList<Song>playList){
        Song checkedSong=findSong(title);
        if(checkedSong!=null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("This Song  "+title+ "  is not in the album");
    return false;
    }

}
