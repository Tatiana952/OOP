import java.util.ArrayList;

public class Director {
    private String name, filmName;
    private int age;
    private static ArrayList<String> films;

    static {
        films = new ArrayList<String>();
    }

    public Director(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void listFilms(String f){
        if (f.isEmpty() == false
                || Director.films.indexOf(f) == -1) {
            this.filmName = f;
        }else{
            System.out.println("Uncorrect name of film!");
        }
        Director.films.add(this.filmName);
    }

    public String getFilmsDir(){
        return films.toString();
    }
    public String getNameDir(){
        return name;
    }
    public int getAgeDir(){
        return age;
    }
}
