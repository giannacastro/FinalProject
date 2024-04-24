import Domain; // Import Domain

public class TaxonomyNode {

    private Domain rank;

    private String name;

    private List<TaxonomyNode> children;

    public TaxonomyNode(Domain rank, String name) {
        this.rank = rank;
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void addChild(TaxonomyNode child) {
        this.children.add(child);
    }

    public String getName() {
        return name;
    }

    public Domain getRank() {
        return rank;
    }

    public List<TaxonomyNode> getChildren() {
        return children;
    }

}
