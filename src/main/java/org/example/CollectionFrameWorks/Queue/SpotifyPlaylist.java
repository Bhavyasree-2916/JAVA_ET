package org.example.CollectionFrameWorks.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import static java.lang.System.exit;

public class SpotifyPlaylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> q= new LinkedList<>();
        q.add("Song1");
        q.add("Song2");
        q.add("Song3");
        q.add("Song4");
        q.add("Song5");
        q.add("Song6");
        q.add("Song7");
        q.add("Song8");
        q.add("Song9");
        q.add("Song10");
        System.out.println(q);
        System.out.println(q.contains("Song5"));
        while(true){
            System.out.println("Enter choice");
            System.out.println("1.Add");
            System.out.println("2.Remove");
            System.out.println("3.Peek");
            System.out.println("4.Exit");

            String choice = sc.next();

            switch(choice){
                case "add":
                    q.add(sc.next());
                    break;
                case "remove":
                    System.out.println(q.poll());
                    break;
                case "play":
                    System.out.println(q.peek());
                    break;
                case "exit":
                    exit(0);
            }
            System.out.println(q);
        }

    }
}
