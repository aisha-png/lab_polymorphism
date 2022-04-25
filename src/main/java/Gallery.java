import java.util.ArrayList;

public class Gallery {
    private String name;
    private float till;
    private ArrayList<Artwork> artwork;

    public Gallery(String name){
        this.name = name;
        this.till = 0;
        this.artwork = new ArrayList<Artwork>();
    }

    public String getGalleryName(){
        return this.name;
    }

    public void addArtwork(Artwork artwork){
        this.artwork.add(artwork);
    }

    public ArrayList<Artwork> getArtwork(){
        return this.artwork;
    }

    public void sellArtwork(Customer customer, Artwork artwork){

    }

    public void removeArtwork(Artwork artwork){
        this.artwork.remove( artwork);

    }

    public void increaseTill(Artwork artwork){
        this.till += artwork.getArtworkPrice();
    }

    public float getTill(){
        return this.till;
    }

    public void sellArtwork(Artwork artwork, Customer customer){
        if (customer.getWallet() == (artwork.getArtworkPrice())){
            removeArtwork(artwork);
            increaseTill(artwork);
            customer.buyArtwork(artwork);
        }



    }

}
