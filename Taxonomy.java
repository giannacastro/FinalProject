import java.util.ArrayList;
import java.util.List;

public class Taxonomy {

  private String name;
  private Rank rank;
  private Taxonomy parent;
  private List<Taxonomy> children;

  public Taxonomy(String name, Rank rank) {
    this.name = name;
    this.rank = rank;
    this.children = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public Rank getRank() {
    return rank;
  }

  public Taxonomy getParent() {
    return parent;
  }

  public void setParent(Taxonomy parent) {
    this.parent = parent;
  }

  public void addChild(Taxonomy child) {
    children.add(child);
    child.setParent(this);
  }

  public List<Taxonomy> getChildren() {
    return children;
  }

  public Taxonomy getChild(String childName) {
    for (Taxonomy child : children) {
      if (child.getName().equals(childName)) {
        return child;
      }
    }
    return null;
  }
}



