public class Film {
    private String fname, director, genre;
    private int year;

    public Film(String fn, String g, int y) {
        this.fname = fn;
        this.genre = g;
        this.year = y;
    }
    public void setDir(String d){
        this.director = d;
    }
    public String getGen(){
        return genre;
    }
    public int getYear(){
        return year;
    }
    public String getName(){
        return fname;
    }
    public String getDir(){
        return director;
    }
    public String getInfo(){
        return String.format("Name: %s\nDirector: %s\nGenre: %s\nYear: %d\n---------", getName(), this.director, getGen(), getYear());
    }

}