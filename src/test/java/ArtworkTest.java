import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArtworkTest {
    Artwork artwork;

    @BeforeEach
    public void setUp(){
        artwork = new Artwork("Mona Lisa", "Leonardo De Vinci", 900, "nft");
    }

    @Test
    public void artworkHasName(){
        assertThat(artwork.getArtworkName()).isEqualTo("Mona Lisa");
    }

    @Test
    public void artistHasName(){
        assertThat(artwork.getArtistName()).isEqualTo("Leonardo De Vinci");
    }

    @Test
    public void priceOfArtwork(){
        assertThat(artwork.getArtworkPrice()).isEqualTo(900);
    }

    @Test
    public void hasNft(){
        assertThat(artwork.getNft()).isEqualTo("nft");
    }




}
