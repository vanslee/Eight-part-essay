package EightPartEssay.Structure.Composite;

public class Client {
    public static void main(String[] args) {
        // 创建一个根节点
        Composite root = new Composite();
        // 创建树枝节点
        Composite branch = new Composite();
        // 创建叶子节点
        Leaf leaf = new Leaf();
        // 创建树形结构
        root.add(branch);
        branch.add(leaf);
        branch.add(leaf);
        branch.add(leaf);
        branch.add(leaf);
        display(root);
    }

    public static void display(Composite root) {
        for (Component child : root.getChild()) {
            if (child instanceof Leaf) {
                child.operation();
            } else {
                child.operation();
                display((Composite) child);
            }
        }
    }
}
