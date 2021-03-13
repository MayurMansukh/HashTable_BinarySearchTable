package junit;

public class BinarySearchTree <T extends Comparable<T>>
{
    class Node<T extends Comparable<T>>
    {
        T key;
        Node left;
        Node right;

        public Node(T key)
        {
            this.key = key;
            this.left=null;
            this.right=null;
        }
    }

    public Node root;

    public BinarySearchTree()
    {
        root = null;
    }

    public void insert(T key) {
        Node newNode = new Node(key);

        if(root == null)
        {
            root = newNode;
            return;
        }
        else
        {
            Node current = root, parent = null;
            while(true)
            {
                parent = current;
                if(key.compareTo((T) current.key)<0)
                {
                    current = current.left;
                    if(current == null)
                    {
                        parent.left = newNode;
                        return;
                    }
                }
                else if(key.compareTo((T) current.key)>0)
                {
                    current = current.right;
                    if(current == null)
                    {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void traversalInorder(Node root)
    {
        if(root != null)
        {
            traversalInorder(root.left);
            System.out.println(""+root.key);
            traversalInorder(root.right);
        }
    }

}