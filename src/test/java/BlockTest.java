import model.Block;
import org.junit.jupiter.api.Test;

class BlockTest {

    @Test
    void createBlocks() {
        Block<String> firstBlock = new Block<>("R$ 1200.00", null);

        Block<String> secondBlock = new Block<>("R$ 3000.00", firstBlock.getHash());

        assert(!secondBlock.getHash().equals(firstBlock.getHash()));

    }
}