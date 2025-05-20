public class Runner {

    public static void main(String[] args) {

        BinarySearchTree<Integer> tree = new BinarySearchTree<>();

        tree.add(90);
        tree.add(100);
        tree.add(80);
        tree.add(70);
        tree.add(85);
        tree.add(98);
        tree.add(120);

        System.out.println();
        System.out.println("IN ORDER         " + tree.inOrder());   // [70, 80, 85, 90, 98, 100, 120]
        System.out.println("PRE ORDER        " + tree.preOrder());  // [90, 80, 70, 85, 100, 98, 120]
        System.out.println("POST ORDER       " + tree.postOrder()); // [70, 85, 80, 98, 120, 100, 90]
        System.out.println("");
        System.out.println("Contains 80      " + tree.contains(80));// true
        System.out.println("Contains 30      " + tree.contains(30));// false
        System.out.println();
        System.out.println("Tree size        " + tree.size());      // 7
        System.out.println("Tree height      " + tree.getHeight()); // 2
        System.out.println("Tree width       " + tree.getWidth());  // 5
        System.out.println();
        System.out.println("Number of leaves " + tree.getNumLeaves());  // 4
        System.out.println("Number of levels " + tree.getNumLevels());  // 3
        System.out.println("Tree as a string " + tree.toString());  // [70, 80, 85, 90, 98, 100, 120]
        System.out.println("");
        
    }
}
