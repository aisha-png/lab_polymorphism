import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GalleryTest {
    Gallery gallery;
    Artwork mona;
    Customer tom;

    @BeforeEach
    public void setUp(){
        gallery = new Gallery ("The Wallace Collection");
        mona = new Artwork("Mona Lisa","Leonardo De Vinci", 900, "nft");
        tom = new Customer("Tom");
    }

    @Test
    public void galleryHasName(){
        assertThat(gallery.getGalleryName()).isEqualTo("The Wallace Collection");
    }

    @Test
    public void canGetArtwork(){
        gallery.addArtwork(mona);
        assertThat(gallery.getArtwork().size()).isEqualTo(1);
    }
    @Test
    public void canSellArtwork(){
        gallery.addArtwork(mona);
        gallery.removeArtwork(mona);
        assertThat(gallery.getArtwork().size()).isEqualTo(0);
        gallery.increaseTill(mona);
        assertThat(gallery.getTill()).isEqualTo(900);
    }
/*
    @Test
    public void cannotSellArtwork2(){
        assertThat(gallery.sellArtwork()).isEqualTo
    }
*/

}
