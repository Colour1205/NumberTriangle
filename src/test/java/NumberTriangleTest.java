import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberTriangleTest {

    // this is testing that aliasing exists between
    // mt.left.right and mt.right.left
    @Test
    public void aliasingTree() throws IOException {

        NumberTriangle mt = NumberTriangle.loadTriangle("input_tree.txt");
        assertEquals(mt.retrieve("lr"), mt.retrieve("lr"));
    }

    @Test
    public void test_loading_tree() throws IOException {
        NumberTriangle mt = NumberTriangle.loadTriangle("little_tree.txt");
        NumberTriangle expected = new NumberTriangle(1);
        expected.setLeft(new NumberTriangle(2));
        expected.setRight(new NumberTriangle(3));
        assertEquals(expected.getRoot(), mt.getRoot());
    }

    @Test
    public void rootTree() throws IOException {

        NumberTriangle mt = NumberTriangle.loadTriangle("input_tree.txt");
        assertEquals(75, mt.retrieve(""));
    }

    @Test
    public void retrieveTreeBasic() throws IOException {

        NumberTriangle mt = NumberTriangle.loadTriangle("input_tree.txt");
        System.out.println(mt.retrieve("lrl"));
        assertEquals(47, mt.retrieve("lr"));
    }


    @Test
    public void littleTree() throws IOException {

        NumberTriangle mt = NumberTriangle.loadTriangle("little_tree.txt");
        assertEquals(1, mt.retrieve(""));
        assertEquals(2, mt.retrieve("l"));
        assertEquals(3, mt.retrieve("r"));
    }

    @Test
    public void bigTreeLeftMost() throws IOException {

        NumberTriangle mt = NumberTriangle.loadTriangle("input_tree.txt");
        assertEquals(4, mt.retrieve("llllllllllllll"));
    }
}