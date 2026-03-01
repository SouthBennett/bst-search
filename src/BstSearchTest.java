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

    assertTrue(BstSearch.contains(root, 10)); // root
    assertTrue(BstSearch.contains(root, 3));  // left subtree
    assertTrue(BstSearch.contains(root, 20)); // right subtree

  }

  @Test
  void testNonExistentValue() {
    BinaryTreeNode<Integer> root = binaryTree();

    assertFalse(BstSearch.contains(root, 11));
    assertFalse(BstSearch.contains(root, 2));
    assertFalse(BstSearch.contains(root, 33));
  }

  @Test
  void testNullRoot() {
    assertFalse(BstSearch.contains(null, 5));
  }

  @Test
  void testSingleNodeTree() {
    BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(23);

    assertTrue(BstSearch.contains(root, 23));
    assertFalse(BstSearch.contains(root, 56));
  }
}
