import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class TaxonomyGUI extends JFrame {

    private JComboBox<String> domainComboBox;
    private JComboBox<String> kingdomComboBox;
    private JComboBox<String> phylumComboBox;
    private JComboBox<String> classComboBox;

    private Map<String, Taxonomy> taxonomyMap;

    public TaxonomyGUI(Map<String, Taxonomy> taxonomyMap) {
        this.taxonomyMap = taxonomyMap;
        setTitle("Taxonomy GUI");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initializeComponents();

        setVisible(true);
    }

    private void initializeComponents() {
        setLayout(new GridLayout(4, 2)); // Update GridLayout to accommodate class ComboBox

        // Domain ComboBox
        domainComboBox = new JComboBox<>();
        domainComboBox.addItem("Select Domain");
        domainComboBox.addItem("Eukarya");
        domainComboBox.addItem("Archaea");
        domainComboBox.addItem("Bacteria");
        domainComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedDomain = (String) domainComboBox.getSelectedItem();
                updateKingdomComboBox(selectedDomain);
            }
        });
        add(new JLabel("Domain:"));
        add(domainComboBox);

        // Kingdom ComboBox
        kingdomComboBox = new JComboBox<>();
        kingdomComboBox.addItem("Select Kingdom");
        kingdomComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedKingdom = (String) kingdomComboBox.getSelectedItem();
                updatePhylumComboBox(selectedKingdom);
            }
        });
        add(new JLabel("Kingdom:"));
        add(kingdomComboBox);

        // Phylum ComboBox
        phylumComboBox = new JComboBox<>();
        phylumComboBox.addItem("Select Phylum");
        phylumComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedPhylum = (String) phylumComboBox.getSelectedItem();
                updateClassComboBox(selectedPhylum);
            }
        });
        add(new JLabel("Phylum:"));
        add(phylumComboBox);

        // Class ComboBox
        classComboBox = new JComboBox<>();
        classComboBox.addItem("Select Class");
        add(new JLabel("Class:"));
        add(classComboBox);
    }

    private void updateKingdomComboBox(String domain) {
        kingdomComboBox.removeAllItems();
        kingdomComboBox.addItem("Select Kingdom");

        Taxonomy selectedDomain = taxonomyMap.get(domain);
        if (selectedDomain != null) {
            for (Taxonomy child : selectedDomain.getChildren()) {
                if (child.getRank() == Rank.KINGDOM) {
                    kingdomComboBox.addItem(child.getName());
                }
            }
        }
    }

    private void updatePhylumComboBox(String kingdom) {
        phylumComboBox.removeAllItems();
        phylumComboBox.addItem("Select Phylum");

        Taxonomy selectedKingdom = taxonomyMap.get(kingdom);
        if (selectedKingdom != null) {
            for (Taxonomy child : selectedKingdom.getChildren()) {
                if (child.getRank() == Rank.PHYLUM) {
                    phylumComboBox.addItem(child.getName());
                }
            }
        }
    }

    private void updateClassComboBox(String phylum) {
        classComboBox.removeAllItems();
        classComboBox.addItem("Select Class");

        Taxonomy selectedPhylum = taxonomyMap.get(phylum);
        if (selectedPhylum != null) {
            for (Taxonomy child : selectedPhylum.getChildren()) {
                if (child.getRank() == Rank.CLASS) {
                    classComboBox.addItem(child.getName());
                }
            }
        }
    }

    public static void main(String[] args) {
        TaxonomyBuilder.buildTaxonomyTree();
        new TaxonomyGUI(TaxonomyBuilder.getTaxonomyMap());
    }
}
