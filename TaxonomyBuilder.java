import java.util.HashMap;
import java.util.Map;

public class TaxonomyBuilder {

  private static Map<String, Taxonomy> taxonomyMap;

  public static void buildTaxonomyTree() {
    taxonomyMap = new HashMap<>();

    //root
    Taxonomy root = new Taxonomy("Root", Rank.DOMAIN);
    taxonomyMap.put("Root", root);


    //domains
    Taxonomy eukarya = new Taxonomy("Eukarya", Rank.DOMAIN);
    root.addChild(eukarya);
    taxonomyMap.put("Eukarya", eukarya);

    Taxonomy archaea = new Taxonomy("Archaea", Rank.DOMAIN);
    root.addChild(archaea);
    taxonomyMap.put("Archaea", archaea);

    Taxonomy bacteria = new Taxonomy("Bacteria", Rank.DOMAIN);
    root.addChild(bacteria);
    taxonomyMap.put("Bacteria", bacteria);


    //kingdoms
    Taxonomy animalia = new Taxonomy("Animalia", Rank.KINGDOM);
    eukarya.addChild(animalia);
    taxonomyMap.put("Animalia", animalia);

    Taxonomy fungi = new Taxonomy("Fungi", Rank.KINGDOM);
    eukarya.addChild(fungi);
    taxonomyMap.put("Fungi", fungi);

    Taxonomy eubacteria = new Taxonomy("Eubacteria", Rank.KINGDOM);
    bacteria.addChild(eubacteria);
    taxonomyMap.put("Eubacteria", eubacteria);

    Taxonomy archaebacteria = new Taxonomy("Archaebacteria", Rank.KINGDOM);
    archaea.addChild(archaebacteria); // Fixed the typo here
    taxonomyMap.put("Archaebacteria", archaebacteria);


    //phylums

    //animailia phylums
    Taxonomy chordata = new Taxonomy("Chordata", Rank.PHYLUM);
    animalia.addChild(chordata);
    taxonomyMap.put("Chordata", chordata);

    Taxonomy coelenterata = new Taxonomy("Coelenterata", Rank.PHYLUM);
    animalia.addChild(coelenterata);
    taxonomyMap.put("Coelenterata", coelenterata);

    Taxonomy porifera = new Taxonomy("Porifera", Rank.PHYLUM);
    animalia.addChild(porifera);
    taxonomyMap.put("Porifera", porifera);

    Taxonomy platyhelminthes = new Taxonomy("Platyhelminthes", Rank.PHYLUM);
    animalia.addChild(platyhelminthes);
    taxonomyMap.put("Platyhelminthes", platyhelminthes);

    Taxonomy nematoda = new Taxonomy("Nematoda", Rank.PHYLUM);
    animalia.addChild(nematoda);
    taxonomyMap.put("Nematoda", nematoda);

    Taxonomy annelida = new Taxonomy("Annelida", Rank.PHYLUM);
    animalia.addChild(annelida);
    taxonomyMap.put("Annelida", annelida);

    Taxonomy arthropoda = new Taxonomy("Arthropoda", Rank.PHYLUM);
    animalia.addChild(arthropoda);
    taxonomyMap.put("Arthropoda", arthropoda);

    Taxonomy mollusca = new Taxonomy("Mollusca", Rank.PHYLUM);
    animalia.addChild(mollusca);
    taxonomyMap.put("Mollusca", mollusca);

    Taxonomy echinodermata = new Taxonomy("Echinodermata", Rank.PHYLUM);
    animalia.addChild(echinodermata);
    taxonomyMap.put("Echinodermata", echinodermata);

    Taxonomy protochordata = new Taxonomy("Protochordata", Rank.PHYLUM);
    animalia.addChild(protochordata);
    taxonomyMap.put("Protochordata", protochordata);


    //bacteria phylum
    Taxonomy acidobacteria = new Taxonomy("Acidobacteria", Rank.PHYLUM);
    bacteria.addChild(acidobacteria);
    taxonomyMap.put("Acidobacteria", acidobacteria);

    Taxonomy actinobacteria = new Taxonomy("Actinobacteria", Rank.PHYLUM);
    bacteria.addChild(actinobacteria);
    taxonomyMap.put("Actinobacteria", actinobacteria);

    Taxonomy bacteroidetes = new Taxonomy("Bacteroidetes", Rank.PHYLUM);
    bacteria.addChild(bacteroidetes);
    taxonomyMap.put("Bacteroidetes", bacteroidetes);

    Taxonomy chlamydiae = new Taxonomy("Chlamydiae", Rank.PHYLUM);
    bacteria.addChild(chlamydiae);
    taxonomyMap.put("Chlamydiae", chlamydiae);

    Taxonomy chlorobi = new Taxonomy("Chlorobi", Rank.PHYLUM);
    bacteria.addChild(chlorobi);
    taxonomyMap.put("Chlorobi", chlorobi);

    Taxonomy chloroflexi = new Taxonomy("Chloroflexi", Rank.PHYLUM);
    bacteria.addChild(chloroflexi);
    taxonomyMap.put("Chloroflexi", chloroflexi);

    Taxonomy cyanobacteria = new Taxonomy("Cyanobacteria", Rank.PHYLUM);
    bacteria.addChild(cyanobacteria);
    taxonomyMap.put("Cyanobacteria", cyanobacteria);

    Taxonomy firmicutes = new Taxonomy("Firmicutes", Rank.PHYLUM);
    bacteria.addChild(firmicutes);
    taxonomyMap.put("Firmicutes", firmicutes);

    Taxonomy fusobacteria = new Taxonomy("Fusobacteria", Rank.PHYLUM);
    bacteria.addChild(fusobacteria);
    taxonomyMap.put("Fusobacteria", fusobacteria);

    Taxonomy proteobacteria = new Taxonomy("Proteobacteria", Rank.PHYLUM);
    bacteria.addChild(proteobacteria);
    taxonomyMap.put("Proteobacteria", proteobacteria);

    Taxonomy spirochaetes = new Taxonomy("Spirochaetes", Rank.PHYLUM);
    bacteria.addChild(spirochaetes);
    taxonomyMap.put("Spirochaetes", spirochaetes);

    Taxonomy synergistetes = new Taxonomy("Synergistetes", Rank.PHYLUM);
    bacteria.addChild(synergistetes);
    taxonomyMap.put("Synergistetes", synergistetes);

    Taxonomy tm7 = new Taxonomy("TM7", Rank.PHYLUM);
    bacteria.addChild(tm7);
    taxonomyMap.put("TM7", tm7);

    Taxonomy verrucomicrobia = new Taxonomy("Verrucomicrobia", Rank.PHYLUM);
    bacteria.addChild(verrucomicrobia);
    taxonomyMap.put("Verrucomicrobia", verrucomicrobia);


    //fungi phylum
    Taxonomy ascomycota = new Taxonomy("Ascomycota", Rank.PHYLUM);
    fungi.addChild(ascomycota);
    taxonomyMap.put("Ascomycota", ascomycota);

    Taxonomy basidiomycota = new Taxonomy("Basidiomycota", Rank.PHYLUM);
    fungi.addChild(basidiomycota);
    taxonomyMap.put("Basidiomycota", basidiomycota);

    Taxonomy chytridiomycota = new Taxonomy("Chytridiomycota", Rank.PHYLUM);
    fungi.addChild(chytridiomycota);
    taxonomyMap.put("Chytridiomycota", chytridiomycota);

    Taxonomy glomeromycota = new Taxonomy("Glomeromycota", Rank.PHYLUM);
    fungi.addChild(glomeromycota);
    taxonomyMap.put("Glomeromycota", glomeromycota);

    Taxonomy mucoromycota = new Taxonomy("Mucoromycota", Rank.PHYLUM);
    fungi.addChild(mucoromycota);
    taxonomyMap.put("Mucoromycota", mucoromycota);

    Taxonomy zygomycota = new Taxonomy("Zygomycota", Rank.PHYLUM);
    fungi.addChild(zygomycota);
    taxonomyMap.put("Zygomycota", zygomycota);


    // archaea phyla
    Taxonomy crenarchaeota = new Taxonomy("Crenarchaeota", Rank.PHYLUM);
    archaea.addChild(crenarchaeota);
    taxonomyMap.put("Crenarchaeota", crenarchaeota);

    Taxonomy euryarchaeota = new Taxonomy("Euryarchaeota", Rank.PHYLUM);
    archaea.addChild(euryarchaeota);
    taxonomyMap.put("Euryarchaeota", euryarchaeota);

    Taxonomy thaumarchaeota = new Taxonomy("Thaumarchaeota", Rank.PHYLUM);
    archaea.addChild(thaumarchaeota);
    taxonomyMap.put("Thaumarchaeota", thaumarchaeota);

    Taxonomy korarchaeota = new Taxonomy("Korarchaeota", Rank.PHYLUM);
    archaea.addChild(korarchaeota);
    taxonomyMap.put("Korarchaeota", korarchaeota);

    Taxonomy nanoarchaeota = new Taxonomy("Nanoarchaeota", Rank.PHYLUM);
    archaea.addChild(nanoarchaeota);
    taxonomyMap.put("Nanoarchaeota", nanoarchaeota);




    // classes

    // chordata classes
    Taxonomy mammalia = new Taxonomy("Mammalia", Rank.CLASS);
    chordata.addChild(mammalia);
    taxonomyMap.put("Mammalia", mammalia);

    Taxonomy aves = new Taxonomy("Aves", Rank.CLASS);
    chordata.addChild(aves);
    taxonomyMap.put("Aves", aves);

    Taxonomy reptilia = new Taxonomy("Reptilia", Rank.CLASS);
    chordata.addChild(reptilia);
    taxonomyMap.put("Reptilia", reptilia);

    Taxonomy amphibia = new Taxonomy("Amphibia", Rank.CLASS);
    chordata.addChild(amphibia);
    taxonomyMap.put("Amphibia", amphibia);

    Taxonomy actinopterygii = new Taxonomy("Actinopterygii", Rank.CLASS);
    chordata.addChild(actinopterygii);
    taxonomyMap.put("Actinopterygii", actinopterygii);

    Taxonomy chondrichthyes = new Taxonomy("Chondrichthyes", Rank.CLASS);
    chordata.addChild(chondrichthyes);
    taxonomyMap.put("Chondrichthyes", chondrichthyes);


    // porifera classes
    Taxonomy demospongiae = new Taxonomy("Demospongiae", Rank.CLASS);
    porifera.addChild(demospongiae);
    taxonomyMap.put("Demospongiae", demospongiae);

    Taxonomy calcarea = new Taxonomy("Calcarea", Rank.CLASS);
    porifera.addChild(calcarea);
    taxonomyMap.put("Calcarea", calcarea);

    Taxonomy hexactinellida = new Taxonomy("Hexactinellida", Rank.CLASS);
    porifera.addChild(hexactinellida);
    taxonomyMap.put("Hexactinellida", hexactinellida);


    // coelenterata classes
    Taxonomy anthozoa = new Taxonomy("Anthozoa", Rank.CLASS);
    coelenterata.addChild(anthozoa);
    taxonomyMap.put("Anthozoa", anthozoa);

    Taxonomy scyphozoa = new Taxonomy("Scyphozoa", Rank.CLASS);
    coelenterata.addChild(scyphozoa);
    taxonomyMap.put("Scyphozoa", scyphozoa);

    Taxonomy hydrozoa = new Taxonomy("Hydrozoa", Rank.CLASS);
    coelenterata.addChild(hydrozoa);
    taxonomyMap.put("Hydrozoa", hydrozoa);

    Taxonomy cubozoa = new Taxonomy("Cubozoa", Rank.CLASS);
    coelenterata.addChild(cubozoa);
    taxonomyMap.put("Cubozoa", cubozoa);


    // platyhelminthes classes
    Taxonomy turbellaria = new Taxonomy("Turbellaria", Rank.CLASS);
    platyhelminthes.addChild(turbellaria);
    taxonomyMap.put("Turbellaria", turbellaria);

    Taxonomy trematoda = new Taxonomy("Trematoda", Rank.CLASS);
    platyhelminthes.addChild(trematoda);
    taxonomyMap.put("Trematoda", trematoda);

    Taxonomy cestoda = new Taxonomy("Cestoda", Rank.CLASS);
    platyhelminthes.addChild(cestoda);
    taxonomyMap.put("Cestoda", cestoda);


    // nematoda classes
    Taxonomy secernentea = new Taxonomy("Secernentea", Rank.CLASS);
    nematoda.addChild(secernentea);
    taxonomyMap.put("Secernentea", secernentea);

    Taxonomy adenophorea = new Taxonomy("Adenophorea", Rank.CLASS);
    nematoda.addChild(adenophorea);
    taxonomyMap.put("Adenophorea", adenophorea);


    // annelida classes
    Taxonomy polychaeta = new Taxonomy("Polychaeta", Rank.CLASS);
    annelida.addChild(polychaeta);
    taxonomyMap.put("Polychaeta", polychaeta);

    Taxonomy clitellata = new Taxonomy("Clitellata", Rank.CLASS);
    annelida.addChild(clitellata);
    taxonomyMap.put("Clitellata", clitellata);


    // arthropoda classes
    Taxonomy insecta = new Taxonomy("Insecta", Rank.CLASS);
    arthropoda.addChild(insecta);
    taxonomyMap.put("Insecta", insecta);

    Taxonomy arachnida = new Taxonomy("Arachnida", Rank.CLASS);
    arthropoda.addChild(arachnida);
    taxonomyMap.put("Arachnida", arachnida);

    Taxonomy crustacea = new Taxonomy("Crustacea", Rank.CLASS);
    arthropoda.addChild(crustacea);
    taxonomyMap.put("Crustacea", crustacea);

    Taxonomy myriapoda = new Taxonomy("Myriapoda", Rank.CLASS);
    arthropoda.addChild(myriapoda);
    taxonomyMap.put("Myriapoda", myriapoda);


    // mollusca classes
    Taxonomy gastropoda = new Taxonomy("Gastropoda", Rank.CLASS);
    mollusca.addChild(gastropoda);
    taxonomyMap.put("Gastropoda", gastropoda);

    Taxonomy bivalvia = new Taxonomy("Bivalvia", Rank.CLASS);
    mollusca.addChild(bivalvia);
    taxonomyMap.put("Bivalvia", bivalvia);

    Taxonomy cephalopoda = new Taxonomy("Cephalopoda", Rank.CLASS);
    mollusca.addChild(cephalopoda);
    taxonomyMap.put("Cephalopoda", cephalopoda);

    Taxonomy polyplacophora = new Taxonomy("Polyplacophora", Rank.CLASS);
    mollusca.addChild(polyplacophora);
    taxonomyMap.put("Polyplacophora", polyplacophora);

    Taxonomy scaphopoda = new Taxonomy("Scaphopoda", Rank.CLASS);
    mollusca.addChild(scaphopoda);
    taxonomyMap.put("Scaphopoda", scaphopoda);


    // echinodermata classes
    Taxonomy asteroidea = new Taxonomy("Asteroidea", Rank.CLASS);
    echinodermata.addChild(asteroidea);
    taxonomyMap.put("Asteroidea", asteroidea);

    Taxonomy ophiuroidea = new Taxonomy("Ophiuroidea", Rank.CLASS);
    echinodermata.addChild(ophiuroidea);
    taxonomyMap.put("Ophiuroidea", ophiuroidea);

    Taxonomy echinoidea = new Taxonomy("Echinoidea", Rank.CLASS);
    echinodermata.addChild(echinoidea);
    taxonomyMap.put("Echinoidea", echinoidea);

    Taxonomy holothuroidea = new Taxonomy("Holothuroidea", Rank.CLASS);
    echinodermata.addChild(holothuroidea);
    taxonomyMap.put("Holothuroidea", holothuroidea);

    Taxonomy crinoidea = new Taxonomy("Crinoidea", Rank.CLASS);
    echinodermata.addChild(crinoidea);
    taxonomyMap.put("Crinoidea", crinoidea);


    // erotochordata classes
    Taxonomy urochordata = new Taxonomy("Urochordata", Rank.CLASS);
    protochordata.addChild(urochordata);
    taxonomyMap.put("Urochordata", urochordata);

    // bacteria classes

    // acidobacteria classes
    Taxonomy acidobacteria_class1 = new Taxonomy("Acidobacteria_Class1", Rank.CLASS);
    acidobacteria.addChild(acidobacteria_class1);
    taxonomyMap.put("Acidobacteria_Class1", acidobacteria_class1);


    // actinobacteria classes
    Taxonomy actinobacteria_class1 = new Taxonomy("Actinobacteria_Class1", Rank.CLASS);
    actinobacteria.addChild(actinobacteria_class1);
    taxonomyMap.put("Actinobacteria_Class1", actinobacteria_class1);


    // bacteroidetes classes
    Taxonomy bacteroidetes_class1 = new Taxonomy("Bacteroidetes_Class1", Rank.CLASS);
    bacteroidetes.addChild(bacteroidetes_class1);
    taxonomyMap.put("Bacteroidetes_Class1", bacteroidetes_class1);


    // chlamydiae classes
    Taxonomy chlamydiae_class1 = new Taxonomy("Chlamydiae_Class1", Rank.CLASS);
    chlamydiae.addChild(chlamydiae_class1);
    taxonomyMap.put("Chlamydiae_Class1", chlamydiae_class1);


    // chlorobi classes
    Taxonomy chlorobi_class1 = new Taxonomy("Chlorobi_Class1", Rank.CLASS);
    chlorobi.addChild(chlorobi_class1);
    taxonomyMap.put("Chlorobi_Class1", chlorobi_class1);


    // chloroflexi classes
    Taxonomy chloroflexi_class1 = new Taxonomy("Chloroflexi_Class1", Rank.CLASS);
    chloroflexi.addChild(chloroflexi_class1);
    taxonomyMap.put("Chloroflexi_Class1", chloroflexi_class1);


    // cyanobacteria classes
    Taxonomy cyanobacteria_class1 = new Taxonomy("Cyanobacteria_Class1", Rank.CLASS);
    cyanobacteria.addChild(cyanobacteria_class1);
    taxonomyMap.put("Cyanobacteria_Class1", cyanobacteria_class1);


    // firmicutes classes
    Taxonomy firmicutes_class1 = new Taxonomy("Firmicutes_Class1", Rank.CLASS);
    firmicutes.addChild(firmicutes_class1);
    taxonomyMap.put("Firmicutes_Class1", firmicutes_class1);


    // fusobacteria classes
    Taxonomy fusobacteria_class1 = new Taxonomy("Fusobacteria_Class1", Rank.CLASS);
    fusobacteria.addChild(fusobacteria_class1);
    taxonomyMap.put("Fusobacteria_Class1", fusobacteria_class1);


    // proteobacteria classes
    Taxonomy proteobacteria_class1 = new Taxonomy("Proteobacteria_Class1", Rank.CLASS);
    proteobacteria.addChild(proteobacteria_class1);
    taxonomyMap.put("Proteobacteria_Class1", proteobacteria_class1);


    // spirochaetes classes
    Taxonomy spirochaetes_class1 = new Taxonomy("Spirochaetes_Class1", Rank.CLASS);
    spirochaetes.addChild(spirochaetes_class1);
    taxonomyMap.put("Spirochaetes_Class1", spirochaetes_class1);


    // synergistetes classes
    Taxonomy synergistetes_class1 = new Taxonomy("Synergistetes_Class1", Rank.CLASS);
    synergistetes.addChild(synergistetes_class1);
    taxonomyMap.put("Synergistetes_Class1", synergistetes_class1);


    // tm7 classes
    Taxonomy tm7_class1 = new Taxonomy("TM7_Class1", Rank.CLASS);
    tm7.addChild(tm7_class1);
    taxonomyMap.put("TM7_Class1", tm7_class1);


    // verrucomicrobia classes
    Taxonomy verrucomicrobia_class1 = new Taxonomy("Verrucomicrobia_Class1", Rank.CLASS);
    verrucomicrobia.addChild(verrucomicrobia_class1);
    taxonomyMap.put("Verrucomicrobia_Class1", verrucomicrobia_class1);


    // fungi classes

    // ascomycota classes
    Taxonomy ascomycota_class1 = new Taxonomy("Ascomycota_Class1", Rank.CLASS);
    ascomycota.addChild(ascomycota_class1);
    taxonomyMap.put("Ascomycota_Class1", ascomycota_class1);


    // basidiomycota classes
    Taxonomy basidiomycota_class1 = new Taxonomy("Basidiomycota_Class1", Rank.CLASS);
    basidiomycota.addChild(basidiomycota_class1);
    taxonomyMap.put("Basidiomycota_Class1", basidiomycota_class1);


    // chytridiomycota classes
    Taxonomy chytridiomycota_class1 = new Taxonomy("Chytridiomycota_Class1", Rank.CLASS);
    chytridiomycota.addChild(chytridiomycota_class1);
    taxonomyMap.put("Chytridiomycota_Class1", chytridiomycota_class1);


    // glomeromycota classes
    Taxonomy glomeromycota_class1 = new Taxonomy("Glomeromycota_Class1", Rank.CLASS);
    glomeromycota.addChild(glomeromycota_class1);
    taxonomyMap.put("Glomeromycota_Class1", glomeromycota_class1);


    // mucoromycota classes
    Taxonomy mucoromycota_class1 = new Taxonomy("Mucoromycota_Class1", Rank.CLASS);
    mucoromycota.addChild(mucoromycota_class1);
    taxonomyMap.put("Mucoromycota_Class1", mucoromycota_class1);


    // zygomycota classes
    Taxonomy zygomycota_class1 = new Taxonomy("Zygomycota_Class1", Rank.CLASS);
    zygomycota.addChild(zygomycota_class1);
    taxonomyMap.put("Zygomycota_Class1", zygomycota_class1);

    // archaea classes

    // crenarchaeota classes
    Taxonomy crenarchaeota_class1 = new Taxonomy("Crenarchaeota_Class1", Rank.CLASS);
    crenarchaeota.addChild(crenarchaeota_class1);
    taxonomyMap.put("Crenarchaeota_Class1", crenarchaeota_class1);


    // euryarchaeota classes
    Taxonomy euryarchaeota_class1 = new Taxonomy("Euryarchaeota_Class1", Rank.CLASS);
    euryarchaeota.addChild(euryarchaeota_class1);
    taxonomyMap.put("Euryarchaeota_Class1", euryarchaeota_class1);


    // thaumarchaeota classes
    Taxonomy thaumarchaeota_class1 = new Taxonomy("Thaumarchaeota_Class1", Rank.CLASS);
    thaumarchaeota.addChild(thaumarchaeota_class1);
    taxonomyMap.put("Thaumarchaeota_Class1", thaumarchaeota_class1);


    // korarchaeota classes
    Taxonomy korarchaeota_class1 = new Taxonomy("Korarchaeota_Class1", Rank.CLASS);
    korarchaeota.addChild(korarchaeota_class1);
    taxonomyMap.put("Korarchaeota_Class1", korarchaeota_class1);


    // nanoarchaeota classes
    Taxonomy nanoarchaeota_class1 = new Taxonomy("Nanoarchaeota_Class1", Rank.CLASS);
    nanoarchaeota.addChild(nanoarchaeota_class1);
    taxonomyMap.put("Nanoarchaeota_Class1", nanoarchaeota_class1);
  }

  public static Map<String, Taxonomy> getTaxonomyMap() {
    return taxonomyMap;
  }
}