public class Artwork {
    private String title;
    private String artist;
    private float price;
    private String nft;

    public Artwork(String title, String artist, float price, String nft){
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.nft = nft;
    }

    public String getArtworkName(){
        return this.title;
    }

    public String getArtistName(){
        return this.artist;
    }

    public float getArtworkPrice(){
        return this.price;
    }

    public String getNft(){
        return this.nft;
    }


}
