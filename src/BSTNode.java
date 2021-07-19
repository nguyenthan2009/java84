public class BSTNode {
    int data;
    BSTNode parent;
    BSTNode left;
    BSTNode right;

    public BSTNode(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
        this.parent = null;
    }

    public BSTNode()
    {
    }
}

 class BSTFunctions
{
    BSTNode ROOT;

    public BSTFunctions()
    {
        this.ROOT = null;
    }

    void insertNode(BSTNode node, int data)
    {
        if (node == null)
        {
            node = new BSTNode(data);
            ROOT = node;
        }
        else if (data < node.data && node.left == null)
        {
            node.left = new BSTNode(data);
            node.left.parent = node;
        }
        else if (data >= node.data && node.right == null)
        {
            node.right = new BSTNode(data);
            node.right.parent = node;
        }
        else
        {
            if (data < node.data)
            {
                insertNode(node.left, data);
            }
            else
            {
                insertNode(node.right, data);
            }
        }
    }

    public boolean search(BSTNode node, int data)
    {
        if (node == null)
        {
            return false;
        }
        else if (node.data == data)
        {
            return true;
        }
        else
        {
            if (data < node.data)
            {
                return search(node.left, data);
            }
            else
            {
                return search(node.right, data);
            }
        }
    }
    public static void main(String[] args)
    {
        BSTFunctions f = new BSTFunctions();
        f.insertNode(f.ROOT, 20);
        f.insertNode(f.ROOT, 5);
        f.insertNode(f.ROOT, 25);
        f.insertNode(f.ROOT, 3);
        f.insertNode(f.ROOT, 7);
        f.insertNode(f.ROOT, 27);
        f.insertNode(f.ROOT, 24);
        System.out.println(f.search(f.ROOT, 27) ? "Found" : "Not Found");
        System.out.println(f.search(f.ROOT, 10) ? "Found" : "Not Found");
    }
}
