package org.example.FileHandling;

import java.io.*;
import java.util.*;
public class FH {
    public static void main(String[] args) throws IOException {
        //Creating a file
        System.out.println("Starting a file");
        String path = "C:\\Users\\jbhav\\IdeaProjects\\JClass01\\src\\main\\java\\org\\example\\FileHandling\\test.txt";
        File f1 = new File(path);
        File f2 = new File("C:\\Users\\jbhav\\IdeaProjects\\JClass01\\src\\main\\java\\org\\example\\FileHandling\\test2.txt");
//        FileWriter fw = new FileWriter(f,true);
//        BufferedWriter bw = new BufferedWriter(fw);
//        Scanner sc = new Scanner(System.in);
//        String inp = sc.nextLine();
//        bw.newLine();
//        bw.write(inp);
//
//        bw.close();
//        fw.close();




//        FileReader fr = new FileReader(f);
//        BufferedReader br = new BufferedReader(fr);
//        int ch;
//        int c = 0;
//        while((ch = br.read())!=-1){
//            System.out.print((char)ch);
//            c++;
//        }
//        System.out.println(c);


        FileInputStream fis1 = new FileInputStream(f1);
        FileOutputStream fos2 = new FileOutputStream(f2);

        int ch;
        while((ch = fis1.read())!=-1){
            System.out.print((char)ch);
            fos2.write(ch);

        }
        fis1.close();
        fos2.close();
    }
}
