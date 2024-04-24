import java.util.List;
import java.util.ArrayList;

public class Rank {

  private String name;
  private List<Rank> children;

  public Rank(String name) {
    this.name = name;
    this.children = new ArrayList<>();
  }

  public String getName() {
    return this.name;
  }

  public void addChild(Rank child) {
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

  public void print(int indent) {
    for (int i = 0; i < indent; i++) {
      System.out.print("-");
    }
    System.out.println(this.name);

    for (Rank child : this.children) {
      child.print(indent + 1);
    }
  }
}

