public class BST<E extends Comparable<E>> {
    private BSTNode<E> root;
    
    public BST()
    {
        root = null;
    }
    
    public void insert(E data)
    {
        if (!this.find(data)) {
        	root = insert(data, root);
        }
    	
    }
    
    private BSTNode<E> insert(E data, BSTNode<E> rt)
    {
        
    	if(rt == null)
        {
            return new BSTNode<E>(data);
        }
        else
        {
        	if(rt.getValue().compareTo(data) == 0) {
        		return rt;
        	}
            if(rt.getValue().compareTo(data) > 0)
            {
                //go left
                rt.setLeft(insert(data, rt.getLeft()));
            }
            else
            {
                //go right
                rt.setRight(insert(data, rt.getRight()));
            }
        }
        return rt;
        
    }

    public String inorder()
    {
        return inorder(root);
    }
    
    public String inorder(BSTNode<E> rt)
    {
        if(rt == null)
        {
            return "";
        }
        else
        {
            String out = "";
            out += inorder(rt.getLeft());
            out += rt.getValue();
            out += inorder(rt.getRight());
            return out;
        }
    }
    
    
    
    public boolean find(E data) {
    	 return find(data, root);
    }
    
    private boolean find(E data, BSTNode<E> rt) {
    if (rt == null) {
    	return false;
    }
    if (rt.getValue().equals(data)) {
    	return true;
    }
    else {
    	if(data.compareTo(rt.getValue()) <0 && rt.getLeft() != null) {
    		if (this.find(data,rt.getLeft())==true) {
    			return true;
    		}
    	}
    	if(data.compareTo(rt.getValue()) > 0 && rt.getRight() != null) {
    		if (this.find(data,rt.getRight()) ==true) {
    			return true;
    		}
    }
    
    }
    
    return false;
    }
    
    public E delete(E data)
    {
        if (!find(data)) {
        	return null;
        }
        root = delete(data, root);
        
        return data;
    }
    
    private BSTNode<E> delete(E data, BSTNode<E> rt)
    {
    	
        if(rt == null)
        {
            return null;
        }
       
        else
        {
        	
            //found the thing
            if(rt.getValue().equals(data))
            {
            	
                if(rt.isLeaf())
                {
                	
                    return null;
                }
                if(rt.getLeft() != null && rt.getRight() != null)
                {
                	System.out.println("Deleting a two child");
                	
                	BSTNode<E> leftbranch=rt.getLeft();
                	//saving left term of the inorder
                	
                	if (rt.getRight().getLeft()==null) {
                    	BSTNode<E> inorder=rt.getRight();
                    	inorder.setLeft(leftbranch);
                    	return inorder;
                    }
                	//case where the inorder predecessor is the immediate right of the term
                	//being deleted
                	
                	BSTNode<E> rightbranch=rt.getRight();
                	//saving the right of the deleted node
                	rt=rt.getRight();
                	
                	
                    
                    
                    while (rt.getLeft().getLeft()!=null) {
                    	
                    	rt=rt.getLeft();
                      }
                    //accessing inorder term
                    
                    BSTNode<E> beforeinorder=rt;
                    //save node to cut off connection later
                    
                    BSTNode<E> inorder=rt.getLeft();
                    //save the inorder term
                    rt=rt.getLeft();
                    
                    while (rt.getRight()!=null) {
                    	
                    	rt=rt.getRight();
                    }
                    //find the inorder subtree's rightmost node to join 
                    //with the right of the node being deleted
                    
                    rt.setRight(rightbranch);
                    //joining right side
                    inorder.setLeft(leftbranch);
                    //setting the left of the inorder as the left of deleted
                    beforeinorder.setLeft(null);
                    //cutting off the connection to the inorder 
                    return inorder;
                }
                
                
                else{
                	
                    if(rt.getLeft() == null) {
                    	return rt.getRight();
                    }
                    
                    if(rt.getRight() == null) {
                    	return rt.getLeft();
                    }
                   
                }
            }
            
            if(rt.getValue().compareTo(data) > 0)
            {
                //go left
                rt.setLeft(delete(data, rt.getLeft()));
            }
            else
            {
                //go right
                rt.setRight(delete(data, rt.getRight()));
            }
        }
        return rt;
    }
    
public int height() {
	
	return height(root);
}

private int height(BSTNode<E> rt) {
	
	if (rt==null){
		return 0;
	}
	if (rt.getLeft()==null && rt.getRight()==null){
		return 0;
	}
	else {
		if(height(rt.getLeft()) >= height(rt.getRight())){
			
		return height(rt.getLeft())+1;
		}
		else
		{
		return height(rt.getRight())+1;
			
		}
	}
	
}


public boolean isBalanced() {
	return isBalanced(root);
}
private boolean isBalanced(BSTNode<E> rt) {
	if (rt==null) {
		return true;
	}
	int height1=height(rt.getLeft());
	int height2=height(rt.getRight());
	
	
	if ((height1-height2)<=1 && (height1-height2)>=-1 && isBalanced(rt.getLeft()) 
			&& isBalanced(rt.getRight())) {
		return true;
	}
	else {
		return false;
	}
}

public boolean isFull() {
	return isFull(root);
}
private boolean isFull(BSTNode<E> rt) {
	if (rt==null) {
		return true;
	}
		if (rt.getLeft()==null && rt.getRight()==null) {
		return true;
	
	}
	
	if (rt.getLeft()!=null && rt.getRight()!=null) {
		return isFull(rt.getRight()) && isFull(rt.getLeft());
	}
	return false;
}
public int countGrandparents() {
	return countGrandparents(root);
}

private int countGrandparents(BSTNode<E> rt) {
	int count=0;
	
	if (rt==null) {
		return 0;
	}
	
	if (rt.getLeft()!=null && rt.getRight()!=null) {
		
		if (rt.getLeft().getLeft()!=null ||
			rt.getLeft().getRight()!=null ||
			rt.getRight().getRight()!=null ||
			rt.getRight().getLeft()!=null) {
			return 1;
		}
	}
	
	if (rt.getLeft()!=null || rt.getRight()!=null) {
		
		if (rt.getLeft().getLeft()!=null ||
			rt.getLeft().getRight()!=null ||
			rt.getRight().getRight()!=null ||
			rt.getRight().getLeft()!=null) {
			return 1;
		}
	}
		
			return count + countGrandparents(rt.getLeft()) + countGrandparents(rt.getRight());
		
		
		
		
		
}
}
