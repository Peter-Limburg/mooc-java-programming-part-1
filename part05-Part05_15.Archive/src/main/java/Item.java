public class Item {

    private String Identifier;
    private String Name;

    public Item(String identifier, String name) {
        this.Identifier = identifier;
        this.Name = name;
    }

    public String getIdentifier() {
        return this.Identifier;
    }

    public String getName() {
        return this.Name;
    }

    public void setIdentifier(String identifier) {
        Identifier = identifier;
    }

    public void setName(String name) {
        Name = name;
    }

    public boolean equals(Object compared){
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Item)) {
            return false;
        }

        Item comparedItem = (Item) compared;

        if (this.Identifier.equals(comparedItem.Identifier)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return
                Identifier + ": " + Name;
    }
}
