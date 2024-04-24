import java.util.ArrayList;
import java.util.List;

public class TaxonomyNode {

    private Enum rank;

    private String name;

    private List<TaxonomyNode> children;

    public TaxonomyNode(Enum rank, String name) {
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

    public Enum getRank() {
        return rank;
    }

}
