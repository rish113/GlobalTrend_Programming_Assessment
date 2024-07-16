public class serialised_deserialised {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static class S_D {
        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            StringBuilder sb=new StringBuilder();
            dfs(root,sb);
            return sb.toString();
        }

        private void dfs(TreeNode x, StringBuilder sb) {
            if (x==null) {
                sb.append("null ");
                return;
            }
            sb.append(String.valueOf(x.val));
            sb.append(' ');
            dfs(x.left,sb);
            dfs(x.right,sb);
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            String[] node=data.split(" ");
            int[] d=new int[1];
            return dfs(node,d);
        }

        private TreeNode dfs(String[] node, int[] d) {
            if (node[d[0]].equals("null")) {
                d[0]++;
                return null;
            }
            TreeNode x=new TreeNode(Integer.valueOf(node[d[0]]));
            d[0]++;
            x.left=dfs(node,d);
            x.right=dfs(node,d);
            return x;
        }
    }

    public static void main(String[] args) {
        // Create a binary tree to test serialization and deserialization
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        // Instantiate the S_D (formerly Codec)
        S_D s_d = new S_D();

        // Serialize the binary tree
        String serialized = s_d.serialize(root);
        System.out.println("Serialized tree: " + serialized);

        // Deserialize the serialized string back into a binary tree
        TreeNode deserialized = s_d.deserialize(serialized);

        // Example: Print the inorder traversal of deserialized tree to verify
        System.out.print("Inorder traversal of deserialized tree: ");
        printInorder(deserialized);
    }

    private static void printInorder(TreeNode node) {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.val + " ");
        printInorder(node.right);
    }
}

