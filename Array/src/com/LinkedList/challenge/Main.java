package com.LinkedList.challenge;

import java.util.*;

public class Main {
    public static ArrayList<Album>albums=new ArrayList<Album>();
    public static void main(String[] args) {
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer",4.6);
        album.addSong("Love Dont Mean A thing",4.2);
        album.addSong("Holy Man",4.33);
        album.addSong("Hold On",4.5);
        album.addSong("Lady Double Dealer",4.6);
        album.addSong("You Cant do it right",5.09);
        album.addSong("High Ball shotter",4.22);
        album.addSong("Thr Gypsy",4.3);
        album.addSong("Soldier of fortune",4.3);
        albums.add(album);

        album=new Album("For Those about to rock","AC/DC");

        album.addSong("For those about to rock",5.44);
        album.addSong("For Those about to rock",4.5);
        album.addSong("I put the finger on you",4.5);
        album.addSong("Lets go",5.9);
        album.addSong("Inject the venom",4.3);
        album.addSong("Snowballed",3.4);
        album.addSong("Evil walks",4.5);
        album.addSong("C.O.D",5.4);
        album.addSong("Breaking the rules",4.5);
        album.addSong("Night of the long knives",4.5);
        albums.add(album);

        LinkedList<Song>playList=new LinkedList<>();
        albums.get(0).addToPlayList("You Cant do it right",playList);
        albums.get(0).addToPlayList("Holy Man",playList);
        albums.get(0).addToPlayList("High Ball shotter",playList);
        albums.get(0).addToPlayList("Breaking the rules",playList);//This song does not exit

        albums.get(1).addToPlayList(9,playList);
        albums.get(1).addToPlayList(8,playList);
        albums.get(1).addToPlayList(3,playList);
        albums.get(1).addToPlayList(24,playList); ///There is no track number 24
play(playList);


    }

    public static void play(LinkedList<Song>playList){
        Scanner scanner=new Scanner(System.in);
        boolean quit=false;
        boolean forward=true;
        ListIterator<Song>listIterator=playList.listIterator();
        if(playList.size()==0){
            System.out.println("There Is 0 Song In The Playlist");
        return;
        }
        else{
            System.out.println("Now Playing  "+listIterator.next().toString());
        }
        while (!quit){
            int action=scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Playlst Complete. ");
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


                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size()>0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now Playing "+listIterator.next());
                        }
                        else if(listIterator.hasPrevious()){
System.out.println("Now Playing "+listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }
public static void printList(LinkedList<Song>playList){
    Iterator<Song> iterator= playList.iterator();
    System.out.println("=====================");

    while(iterator.hasNext()){
        System.out.println(iterator.next());
    }

    System.out.println("======================");


}

public static void printMenu(){
    System.out.println("Available Actions:\nPress");
    System.out.println("0 -> To Quit\n" +
            "\n1->TO Play Next Song"+
    "\n2->To Play Previous Song"+
    "\n3->To Replay The Cureent Song"+
    "\n4->List Song Of the playlist"
    +"\n5->Print Available actions");
}

}
