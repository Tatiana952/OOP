import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Base {

    private static ArrayList ReadTxt() throws Exception {
        ArrayList<String> BaseLst = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader("base.txt"));
            if(new File("base.txt").exists()) {
                BaseLst = new ArrayList<>();
                String l;
                while ((l = br.readLine()) != null) {
                    BaseLst.add(l);
                }
            }else {System.out.println("Database of films doesn't exists. Please first add a film.");}
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return BaseLst;
    }

    public static void PrintBase() throws Exception{
        try {

            ArrayList<String> arrl = ReadTxt();
            if(arrl != null) {
                for (int i = 0; i < arrl.size(); i++) {
                    String[] temp = arrl.get(i).split("/");
                    System.out.print("Title: " + temp[0] +
                            "\nDirector: " + temp[1] +
                            "\nGenre: " + temp[2] +
                            "\nYear: " + temp[3]);
                    System.out.println("\n_________");
                }
            }else {System.out.println("Database of films doesn't exists. Please first add a film.");}
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void FindInfo() throws Exception{
        try {
            System.out.print("\nEnter part of the movie name: ");
            Scanner sc = new Scanner(System.in);
            String part = sc.nextLine();
            ArrayList<String> arrl = ReadTxt();
            int counter = 0;
            for (int i = 0; i < arrl.size(); i++) {
                String[] temp = arrl.get(i).split("/");
                if(temp[0].toLowerCase().contains(part.toLowerCase())){
                    counter++;
                    System.out.println("\n_________");
                    System.out.print("Title: " + temp[0] +
                            "\nDirector: " + temp[1] +
                            "\nGenre: " + temp[2] +
                            "\nYear: " + temp[3]);
                    System.out.println("\n_________");
                }
            }
            if(counter == 0){System.out.printf("\nThere is no film contains <%s> in name", part);}

        }catch (IOException e){
            System.out.println(e.getMessage());

        }
    }
}
