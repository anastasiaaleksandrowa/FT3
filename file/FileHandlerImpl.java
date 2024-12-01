package file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import model.FamilyTree;


public class FileHandlerImpl implements FileHandler {


    @Override
    public FamilyTree readFromFile(final String filename) {
        FamilyTree familyTree = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            familyTree = (FamilyTree) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return familyTree;
    }

    /**
     * @param familyTree
     * @param filename
     */
    @Override
    public void writeToFile(final FamilyTree familyTree, final String filename) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'writeToFile'");
    }

    @Override
    public boolean equals(final Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "FileHandlerImpl []";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
}