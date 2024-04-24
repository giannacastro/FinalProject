import java.util.List;
import java.util.ArrayList;

public class TaxonomyNode {

    private String name;
    private List<TaxonomyNode> children;

    public TaxonomyNode(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addChild(TaxonomyNode child) {
        this.children.add(child);
    }

    public List<TaxonomyNode> getChildren() {
        return this.children;
    }

    public void print() {
        System.out.println(this.name);
        for (TaxonomyNode child : this.children) {
            child.print();
        }
    }

    public void printIndent(int indent) {
        for (int i = 0; i < indent; i++) {
            System.out.print("-");
        }
        System.out.println(this.name);
        for (TaxonomyNode child : this.children) {
            child.printIndent(indent + 1);
        }
    }

    public static void main(String[] args) {
        TaxonomyNode root = new TaxonomyNode("Root");
        TaxonomyNode child1 = new TaxonomyNode("Child1");
        TaxonomyNode child2 = new TaxonomyNode("Child2");
        root.addChild(child1);
        root.addChild(child2);
        child1.addChild(new TaxonomyNode("Grandchild"));

        root.print();
        root.printIndent(0);
    }

}

