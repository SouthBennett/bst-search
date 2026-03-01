import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {
  private BinaryTreeNode<Integer> binaryTree() {
    BinaryTreeNode<Integer> root = 
      new BinaryTreeNode<Integer>(10,
        new BinaryTreeNode<>(5,
          new BinaryTreeNode<>(3),
          new BinaryTreeNode<>(7)
        ),
        new BinaryTreeNode<>(15,
          new BinaryTreeNode<>(12),
          new BinaryTreeNode<>(20)
          )
        );
    return root;    
  }

  @Test
  void testValuesExists() {
    BinaryTreeNode<Integer> root = binaryTree();

    assertTrue(BstSearch.contains(root, 5));
    assertTrue(BstSearch.contains(root, 3));
    assertTrue(BstSearch.contains(root, 20));

  }
}
