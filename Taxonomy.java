import java.util.List;
import java.util.ArrayList;

public class Taxonomy {

  private Rank root;

  public Taxonomy() {
    this.root = new Rank("Root");
  }

  public void addRank(String parentName, String childName) {
    Rank parent = findRank(parentName);
    Rank child = new Rank(childName);
    parent.addChild(child);
  }

  public Rank findRank(String name) {
    return findRankHelper(this.root, name);
  }

  private Rank findRankHelper(Rank parent, String name) {
    if (parent.getName().equals(name)) {
      return parent;
    }
    for (Rank child : parent.getChildren()) {
      Rank found = findRankHelper(child, name);
      if (found != null) {
        return found;
      }
    }
    return null;
  }

  public void printRanks() {
    printRank(this.root, 0);
  }

  private void printRank(Rank rank, int depth) {
    for (int i = 0; i < depth; i++) {
      System.out.print("-");
    }
    System.out.println(rank.getName());

    for (Rank child : rank.getChildren()) {
      printRank(child, depth + 1);
    }
  }

  public static void main(String[] args) {
    Taxonomy taxonomy = new Taxonomy();
    taxonomy.addRank("Root", "Child 1");
    taxonomy.addRank("Child 1", "Grandchild 1");
    taxonomy.printRanks();
  }

}
