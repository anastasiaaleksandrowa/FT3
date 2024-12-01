package file;

import model.FamilyTree;

public interface FileHandler {
    void writeToFile(FamilyTree familyTree, String filename);
    FamilyTree readFromFile(String filename);
}