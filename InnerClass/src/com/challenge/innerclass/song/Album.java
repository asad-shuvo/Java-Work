package com.challenge.innerclass.song;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs=new SongList();
    }

    public boolean addSong(String title,double duration){
        return this.songs.add(new Song(title,duration));
    }


    public boolean addToPlayList(int trackNumber, LinkedList<Song>playList){
        Song cheackedSong=this.songs.findSong(trackNumber);
        if(cheackedSong!=null){
            playList.add(cheackedSong);
        return true;
        }
        System.out.println("This Album Does Not Have A Track   "+trackNumber);
        return false;
    }

    public boolean addToPlayList(String title,LinkedList<Song>playList){
        Song checkedSong=songs.findSong(title);
        if(checkedSong!=null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("This Song  "+title+ "  is not in the album");
        return false;
    }



    private class SongList{
        private ArrayList<Song>songs;

        public SongList() {
            this.songs=new ArrayList<Song>();
        }

        public boolean add(Song song){
            if(songs.contains(song)){
                return false;
            }
            else{
                this.songs.add(song);
                return true;
            }
        }
        private Song findSong(String title){
            for(Song checkedSong: this.songs){
                if(checkedSong.getTitle().equals(title)){
                    return checkedSong;
                }

            }
            return  null;
        }

        public Song findSong(int trackNumber){
            int index=trackNumber-1;
            if((index>0) && (index<songs.size())){
                return songs.get(index);
            }
            return null;
        }

    }


}

