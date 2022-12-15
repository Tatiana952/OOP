import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GetFilmData {

    public static ArrayList getFilmAL() throws Exception {
        ArrayList<Film> al = null;
        try {
            System.out.print("How much films do you want to add: ");

            al = new ArrayList<>();
            Scanner sc3 = new Scanner(System.in);
            int count = sc3.nextInt();


            while (count != 0) {
                System.out.println("---------");
                String get = getData();
                al.add(appendFilm(get));
                count--;
                write(appendFilm(get));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return al;
    }

    private static Film appendFilm(String s){
        String[] arrS = s.split("/");
        Film f = new Film(arrS[0],arrS[2], Integer.valueOf(arrS[3]));
        f.setDir(arrS[1]);
        return f;
    }
    private static String getData(){

        StringBuilder sb = new StringBuilder();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter film name: ");
        sb.append(sc.nextLine()+"/");
        System.out.print("Enter director name: ");
        sb.append(sc.nextLine()+"/");
        System.out.print("Enter genre: ");
        sb.append(sc.nextLine()+"/");
        System.out.print("Enter year of release: ");
        sb.append(sc.nextInt());

        return sb.toString();
    }

    private static void write(Film examp) throws Exception{

        FileWriter fw = new FileWriter("base.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(examp.getName() + "/" + examp.getDir() + "/" + examp.getGen() + "/" + examp.getYear());
        bw.newLine();
        bw.close();
    }
}
