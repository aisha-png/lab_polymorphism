import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArtistTest {

    Artist artist;
    Artwork mona;
    Artwork sunFlower;

    @BeforeEach
    public void setUp(){
        artist = new Artist("Leonardo De Vinci");
    }

    @Test
    public void artistHasWork(){
        artist.addWork(mona);
        artist.addWork(sunFlower);
        assertThat(artist.getWork().size()).isEqualTo(2);
    }

}
