import java.util.HashMap;
import java.util.Map;

public class TaxonomyNode {
    private String name;
    private Rank rank;
    private TaxonomyNode parent;
    private Map<String, TaxonomyNode> children;

    public TaxonomyNode(String name, Rank rank) {
        this.name = name;
        this.rank = rank;
        this.children = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public Rank getRank() {
        return rank;
    }

    public TaxonomyNode getParent() {
        return parent;
    }

    public void setParent(TaxonomyNode parent) {
        this.parent = parent;
    }

    public void addChild(TaxonomyNode child) {
        children.put(child.getName(), child);
        child.setParent(this);
    }

    public boolean containsChild(String childName) {
        return children.containsKey(childName);
    }

    public TaxonomyNode getChild(String childName) {
        return children.get(childName);
    }

    public String[] getChildrenNames() {
        return children.keySet().toArray(new String[0]);
    }
}
