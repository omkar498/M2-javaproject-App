package com.omkar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

class Main {
	private static ArrayList<Album> albums = new ArrayList<>();
	
	public static void main(String[] args) {
		Album album = new Album("Album1", "ac/dc");
		
		album.addSong("tnt", 4.5);
		album.addSong("high", 3.5);
		album.addSong("thunder", 5.5);
		albums.add(album);
		
		album = new Album("Albmu2", "eminem");
		
		album.addSong("rap god", 1.5);
		album.addSong("afraid", 3.5);
		album.addSong("lose", 4.5);
		
		albums.add(album);
		
		LinkedList<Song> playList_1 = new LinkedList<>();
		
		albums.get(0).addToPlayList("tnt", playList_1);
        albums.get(0).addToPlayList("high", playList_1);
        albums.get(1).addToPlayList("rap god", playList_1);
        albums.get(1).addToPlayList("lose", playList_1);
        
        play(playList_1);
	}
	
	private static void play(LinkedList<Song> playList) {
		Scanner sc = new Scanner(System.in); 
		boolean quit = false;
		boolean forward = true;
		ListIterator<Song>ListIterator = playList.listIterator();
		
		
		if(playList.size() == 0) {
			System.out.println("this playlist have no song");
		}
		else {
			System.out.println("now playing "+ ListIterator.next().toString());
			printMenu();
		}
		
		while(!quit) {
			int action = sc.nextInt();
			sc.nextLine();
			
			  switch (action){
              case 0:
                  System.out.println("playlist complete");
                  quit = true;
                  break;

              case 1:
                  if(!forward){
                      if(ListIterator.hasNext()){
                          ListIterator.next();
                      }
                      forward = true;
                  }
                  if(ListIterator.hasNext()){
                      System.out.println("now plyaing "+ListIterator.next().toString());

                  }
                  else {
                      System.out.println("no song available, reached to the end of the list");
                      forward = false;
                  }
                  break;
                  
               case 2:
                  if(forward){
                      if(ListIterator.hasPrevious()){
                          ListIterator.previous();
                      }
                      forward = false;
                  }
                  if(ListIterator.hasPrevious()){
                      System.out.println("now playing "+ListIterator.previous().toString());
                     
                  }
                  else{
                      System.out.println("we are the first song");
                      forward = false;
                  }
                  break;
               case 3:
                  if(forward){
                      if(ListIterator.hasPrevious()){
                          System.out.println("now playing "+ListIterator.previous().toString());
                          forward = false;
                      }
                      else{
                          System.out.println("we are at the start of the list");
                      }
                  }
                  else{
                      if(ListIterator.hasNext()){
                          System.out.println("now playing "+ListIterator.next().toString());
                          forward = true;
                      }
                      else {
                          System.out.println("we have reached to the end list");
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
                  if(playList.size() > 0){
                      ListIterator.remove();
                      if(ListIterator.hasNext()){
                          System.out.println("now playing "+ListIterator.next().toString());
                      }
                      else {
                          if(ListIterator.hasPrevious())
                          System.out.println("now playing "+ListIterator.previous().toString());

                          
                      }
                  }    
         }
           
			
			
			
		  
			
		}
		
	}
	
	private static void printMenu(){
        System.out.println("available options\n press");
        System.out.println("0 - to quit\n"+
                "1 - to play next song\n"+
                "2 - to play previous song\n"+
                "3 - to replay the current song\n"+
                "4 - list of the all song\n"+
                "5 - print the all the available songs\n"+
                "6 - delete current song\n");
	}
	
	private static void printList(LinkedList<Song> playList) {
		 Iterator<Song> iterator = playList.iterator();
	        System.out.println("------------");

	        while (iterator.hasNext()){
	            System.out.println(iterator.next());
	        }

	        System.out.println("-----------");
	}
	
}
