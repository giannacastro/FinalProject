public class Rank {

  private String name;
  private List<Rank> children;

  public Rank(String name) {
    this.name = name;
    this.children = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void addChild(String childName) {
    Rank child = new Rank(childName);
    children.add(child);
  }

  public List<Rank> getChildren() {
    return children;
  }

  public void print() {
    System.out.println(name);
    for (Rank child : children) {
      child.print();
    }
  }
}
