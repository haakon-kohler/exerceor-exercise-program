public class BSTNode<E extends Comparable<E>> {
	    private E value;    //value must be Comparable
	    private BSTNode<E> left;
	    private BSTNode<E> right;

	    //constructor(s)
	    BSTNode(E val){
	        left = null;
	        right = null;
	        value = val;
	    }

	    //getters and setters for value left and right
	    public BSTNode<E> getLeft()
	    {
	        return left;
	    }

	    public BSTNode<E> getRight()
	    {
	        return right;
	    }

	    public void setLeft(BSTNode<E> node)
	    {
	        left = node;
	    }

	    public void setRight(BSTNode<E> node)
	    {
	        right = node;
	    }

	    public E getValue()
	    {
	        return value;
	    }

	    public boolean isLeaf()
	    {
	        if(getRight() == null && getLeft() == null){
	            return true;
	        }
	        return false;
	    }
	}
