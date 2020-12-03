public class AppTreeRunner {
    public static void main(String[] args) {
        Tree myTree=new Tree();
        int[] numberArray=new int[] {10,6,8,20,4,9,5,17,42,47,29};
        for(int num:numberArray){
            myTree.insert(num);
        }
        System.out.println("PreOrder Traversal Tree");
        myTree.traversePreOrder();
//
//        for(int i=0; i<numberArray.length; i++){
//            myTree.insert(numberArray[i]);
//        }
//        System.out.println("PreOrder Traversal Tree");
//        myTree.traversePreOrder();


    }
}
