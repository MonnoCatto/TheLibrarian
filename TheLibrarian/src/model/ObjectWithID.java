package model;

public abstract class ObjectWithID {

    private static int staticID = 0;
    protected final int id;

    ObjectWithID() {
        id = staticID;
        staticID += 1;
    }

    public int getID() {
        return id;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (this.getClass() != other.getClass()) {
            return false;
        }
        return false;
    }
}
