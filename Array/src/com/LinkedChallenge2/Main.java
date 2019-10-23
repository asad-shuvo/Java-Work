package com.LinkedChallenge2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static ArrayList<Album>albums=new ArrayList<>();
    public static void main(String[]args){

        Album album=new Album("Abar Hashimukh","ShironamHin");
        album.addToAlbum("Hashimukh",5.2);
        album.addToAlbum("Abar Hashimukh",5.3);
        album.addToAlbum("Chithi",5.4);
        album.addToAlbum("Janala",4.2);

        albums.add(album);

        Album album1=new Album("Oniket Prantor","Artcel");
        album.addToAlbum("Oniket Prantor",16.16);
        album.addToAlbum("Nikhos",6.16);
        album.addToAlbum("Door",4.36);
        album.addToAlbum("tirodhan",5.46);
    albums.add(album);

        LinkedList<Song>playList=new LinkedList<>();

        albums.get(0).addToPlayList("Hashimukh",playList);
        albums.get(0).addToPlayList("Abar Hashimukh",playList);
        albums.get(1).addToPlayList("Oniket Prantor",playList);
        albums.get(0).addToPlayList("Janala",playList);

        albums.get(1).addToPlayList(2,playList);

    printOptions();
    getAtWork(playList);
    }
    public static void getAtWork(LinkedList<Song>playList){
        boolean quit=false;
        Scanner sc=new Scanner(System.in);

ListIterator<Song>listIterator=playList.listIterator();
boolean forward=true;
        while (quit==false){
            int action=sc.nextInt();
            switch (action){
                case 0:
                    System.out.println("End Of Program");
                    quit=true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward=true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now Playing "+listIterator.next().toString());
                    }
                    else{
                        System.out.println("We Have Reached The End Of The Playlist");
                        forward=false;
                    }
                    break;
                case 2:
                    if(forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now Playing " + listIterator.previous().toString());
                        }
                        forward=false;
                    }
                    else{
                        System.out.println("We Are At The Start");
                    }
                    break;
                case 3:
                    if(forward) {

                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward=false;
                        }
                        else{
                            System.out.println("We Are At The Start");
                        }
                    }
                    else{
                        if(listIterator.hasNext() ){
                            System.out.println("Now Replaying  "+listIterator.next().toString());
                            forward=true;
                        }
                        else{
                            System.out.println("We Have Reached At The End Of the List");
                        }
                    }

                case 4:
                    printSongs(playList);
                    break;
                case 5:
                    printOptions();
                    break;


            }
        }


    }

    public static void printSongs(LinkedList<Song>playList){
        ListIterator<Song>listIterator=playList.listIterator();
        System.out.println("=============================");
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("=============================");
    }
    public static void printOptions(){
        System.out.println("Available Actions:\nPress");
        System.out.println("0 -> To Quit\n" +
                "\n1->TO Play Next Song"+
                "\n2->To Play Previous Song"+
                "\n3->To Replay The Cureent Song"+
                "\n4->List Song Of the playlist"
                +"\n5->Print Available actions");
    }
}
