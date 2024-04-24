import java.util.List;
import java.util.ArrayList;

public class Rank extends Domain {

  private String name;

  private List<Rank> children;

  public Rank(String name) {
    super();
    this.name = name;
    this.children = new ArrayList<>();
  }

  public String getName() {
    return this.name;
  }

  public void addChild(String childName) {
    Rank child = new Rank(childName);
    this.children.add(child);
  }

  public List<Rank> getChildren() {
    return this.children;
  }

  public void print() {
    System.out.println(this.name);
    for (Rank child : this.children) {
      child.print();
    }
  }

  public static void main(String[] args) {
    Rank root = new Rank("Root");
    root.addChild("Child");
    root.print();
  }

}

