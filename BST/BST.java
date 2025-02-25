import java.util.Scanner;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class BST {
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        else if (root.val > val) {
            root.left = insert(root.left, val);
        }

        else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static Node deleteNode(Node root, int key) {
        if (root == null) {
            return root;
        }

        else if (key < root.val) {
            root.left = deleteNode(root.left, key);
        }

        else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        }

        else {
            if (root.left == null) {
                return root.right;

            }

            else if (root.right == null) {
                return root.left;
            }

            else {
                Node suc = root.right;
                while (suc.left != null) {
                    suc = suc.left;
                }

                root.val = suc.val;
                root.right = deleteNode(root.right, key);

            }
        }

        return root;
    }

    // if we have to delete without key Only root then :
    public Node deleteRootNode(Node root) {
        if (root == null) {
            return root;
        }

        if (root.left == null) {
            return root.right;
        } else if (root.right == null) {
            return root.left;
        }

        Node suc = root.right;
        while (suc.left != null) {
            suc = suc.left;
        }
        root.val = suc.val;

        root.right = deleteNode(root.right, suc.val);

        return root;
    }

    public static void display(Node root) {
        if (root == null) {
            return;
        }

        display(root.left);
        System.out.print(root.val + " ");
        display(root.right);

    }

    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }

        return root.val + sum(root.left) + sum(root.right);
    }

    public static int size(Node root) {
        if (root == null) {
            return 0;
        }

        return 1 + size(root.left) + size(root.right);
    }

    public static int Max(Node root) {
        if (root == null) {
            return 0;
        }

        return Math.max(root.val, Math.max(Max(root.left), Max(root.right)));
    }

    public static int level(Node root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(level(root.left), level(root.right));
    }

    public static void nthLevel(Node root, int curr_level, int level) {
        if (root == null) {
            return;
        }

        if (curr_level == level) {
            System.out.print(root.val + " ");
            nthLevel(root.left, curr_level + 1, level);
            nthLevel(root.right, curr_level + 1, level);
        }

    }

    public static void main(String[] args) {
        Node root = null;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            root = insert(root, ele);
        }

        display(root);
        System.out.println();

        deleteNode(root, 4);

        display(root);
        System.out.println();

        System.out.println(sum(root));

        System.out.println(size(root));

        System.out.println(Max(root));

        System.out.println(level(root));

        nthLevel(root, 5, 10);

        sc.close();
    }
}