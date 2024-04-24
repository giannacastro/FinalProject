import java.util.ArrayList;
import java.util.List;

public class TaxonomyNode {

    private TaxonomyEnum rank; // Use specific enum instead of Rank

    private String name;

    private List<TaxonomyNode> children;

    public TaxonomyNode(TaxonomyEnum rank, String name) {
        this.rank = rank; // Set to appropriate enum
        this.name = name;
        this.children = new ArrayList<>();
    }

    public TaxonomyEnum getRank() {
        return rank; // Return specific enum
    }

    public String getName() {
        return name;
    }

    public List<TaxonomyNode> getChildren() {
        return children;
    }

    public void addChild(TaxonomyNode child) {
        children.add(child);
    }

    public boolean containsChild(String childName) {
        for (TaxonomyNode child : children) {
            if (child.getName().equals(childName)) {
                return true;
            }
        }
        return false;
    }

    public TaxonomyNode getChild(String childName) {
        for (TaxonomyNode child : children) {
            if (child.getName().equals(childName)) {
                return child;
            }
        }
        return null;
    }

    public String[] getChildrenNames() {
        String[] names = new String[children.size()];
        for (int i = 0; i < children.size(); i++) {
            names[i] = children.get(i).getName();
        }
        return names;
    }
}
