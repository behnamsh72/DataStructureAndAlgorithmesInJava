package trees.traversal;


public class SibTreeNode {

    public void preOrder() {
        this.visit();
        if (firstChild != null) {
            firstChild.preOrder();
        }
        if (nextSibling != null) {
            nextSibling.preOrder();
        }
    }

    public void postOrder(){
        if(firstChild!=null){
            firstChild.postOrder();
        }
        this.visit();
        if(nextSibling!=null){
            nextSibling.postOrder();
        }
    }
}
//Visit nodes in this order:


/*
    node visited: preOrder():
        1
     2     6
   3 4 5  7  8


 */



/*
    PostOrder:

            8
      4          7
    1  2  3    5   6
 */
