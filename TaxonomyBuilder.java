import java.util.ArrayList;
import java.util.List;

public class TaxonomyBuilder {

  public enum Domain {
    EUKARYA(1),
    BACTERIA(2),
    ARCHAEA(3);

    private final int value;

    Domain(int value) {
      this.value = value;
    }

    public int getValue() {
      return value;
    }
  }

  public enum Kingdom {
    ANIMALIA(1),
    FUNGI(2),
    EUBACTERIA(3),
    ARCHAEA(4);

    private final int value;

    Kingdom(int value) {
      this.value = value;
    }

    public int getValue() {
      return value;
    }

    public List<String> getPhyla() {
      List<String> phyla = new ArrayList<>();
      for (Phylum phylum : Phylum.values()) {
        if (phylum.getValue() >= (this.value - 1) * 10 + 1 && phylum.getValue() <= this.value * 10) {
          phyla.add(phylum.name());
        }
      }
      return phyla;
    }
  }

  public enum Phylum {
    CHORDATA(1),
    ARTHROPODA(2),
    MOLLUSCA(3),
    CNIDARIA(4),
    ECHINODERMATA(5),
    PLATYHELMINTHES(6),
    NEMATODA(7),
    ANNELIDA(8),
    BACTERIA(9),
    ASCOMYCOTA(10),
    BASIDIOMYCOTA(11),
    CHYTRIDIOMYCOTA(12),
    GLOMEROMYCOTA(13),
    MUCOROMYCOTA(14),
    ZYGOMYCOTA(15),
    CRENARCHAEOTA(16),
    EURYARCHAEOTA(17),
    THAUMARCHAEOTA(18),
    KORARCHAEOTA(19),
    NANOARCHAEOTA(20),
    ACIDOBACTERIA(21),
    CHLAMYDIAE(22),
    CHLOROFLEXI(23),
    CYANOBACTERIA(24),
    FIRMICUTES(25),
    FUSOBACTERIA(26),
    PROTEOBACTERIA(27),
    SPIROCHAETES(28),
    SYNERGISTETES(29),
    TM7(30),
    VERRUCOMICROBIA(31);

    private final int value;

    Phylum(int value) {
      this.value = value;
    }

    public int getValue() {
      return value;
    }

    public List<String> getClasses() {
      List<String> classes = new ArrayList<>();
      for (Class_ clazz : Class_.values()) {
        if (clazz.getValue() >= (this.value - 1) * 10 + 1 && clazz.getValue() <= this.value * 10) {
          classes.add(clazz.name());
        }
      }
      return classes;
    }
  }

  public enum Class_ {
    MAMMALIA(1),
    INSECTA(2),
    GASTROPODA(3),
    ANTHOZOA(4),
    ASTEROIDEA(5),
    TURBELLARIA(6),
    DEMOSPONGIAE(7),
    CALCAREA(8),
    HEXACTINELLIDA(9),
    SCYPHOZOA(10),
    HYDROZOA(11),
    CUBOZOA(12),
    TREMATODA(13),
    CESTODA(14),
    SECERNENTEA(15),
    ADENOPHOREA(16),
    POLYCHAETA(17),
    CLITELLATA(18),
    ARACHNIDA(19),
    CRUSTACEA(20),
    MYRIAPODA(21),
    GASTROPODA_(22),
    BIVALVIA(23),
    CEPHALOPODA(24),
    POLYPLACOPHORA(25),
    SCAPHOPODA(26),
    ANTHOZOA_(27),
    ASTEROIDEA_(28),
    OPHIUROIDEA(29),
    ECHINOIDEA(30),
    HOLOTHUROIDEA(31),
    CRINOIDEA(32),
    UROCHORDATA(33),
    ACIDOBACTERIA_CLASS1(34),
    ACTINOBACTERIA_CLASS1(35),
    BACTEROIDETES_CLASS1(36),
    CHLAMYDIAE_CLASS1(37),
    CHLOROBI_CLASS1(38),
    CHLOROFLEXI_CLASS1(39),
    CYANOBACTERIA_CLASS1(40),
    FIRMICUTES_CLASS1(41),
    FUSOBACTERIA_CLASS1(42),
    PROTEOBACTERIA_CLASS1(43),
    SPIROCHAETES_CLASS1(44),
    SYNERGISTETES_CLASS1(45),
    TM7_CLASS1(46),
    VERRUCOMICROBIA_CLASS1(47);

    private final int value;

    Class_(int value) {
      this.value = value;
    }

    public int getValue() {
      return value;
    }
  }

  public static void main(String[] args) {
    populateDropdowns();
  }

  public static void populateDropdowns() {
    for (Kingdom kingdom : Kingdom.values()) {
      List<String> phyla = kingdom.getPhyla();
      if (phyla.isEmpty()) {
        phyla.add("N/A");
      }
      for (String phylum : phyla) {
        List<String> classes = Phylum.valueOf(phylum).getClasses();
        if (classes.isEmpty()) {
          classes.add("N/A");
        }
      }
    }
  }
}
