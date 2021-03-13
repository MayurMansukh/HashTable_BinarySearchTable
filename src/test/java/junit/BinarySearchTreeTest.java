package junit;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeTest {
    BinarySearchTree binarytree;
    @Before
    public void setup()
    {
        binarytree = new BinarySearchTree();
    }

    @Test
    public void addElementToTree()
    {
        binarytree.insert(56);
        binarytree.insert(30);
        binarytree.insert(70);
        binarytree.traversalInorder(binarytree.root);

    }
}
