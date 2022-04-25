import java.util.ArrayList;

public class Artist {
    private String name;
    ArrayList<Artwork>work;

    public Artist (String name){
        this.name = name;
        this.work = new ArrayList<Artwork>();

    }

    public ArrayList<Artwork> getWork(){
        return work;
    }

    public void addWork(Artwork artwork){
        this.work.add(artwork);
    }

}
