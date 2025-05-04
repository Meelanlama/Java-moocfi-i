/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meelan
 */
public class Archive {

    private String name;
    private String identifier;

    public Archive(String identifier, String name) {
        this.name = name;
        this.identifier = identifier;
    }

    public String getName() {
        return this.name;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Archive)) {
            return false;
        }

        Archive objectType = (Archive) obj;
        if (identifier.equals(objectType.identifier)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
