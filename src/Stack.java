public class Stack {
    // Fields
    Object[] objects;
    int Number = 0;

    // Constructors
    Stack() {
        objects = new Object[100];
    }

    // Methods
    void put(Object newObj) {
        if (Number < 100) {
            objects[Number] = newObj;
            Number = Number + 1;
        } else {
            System.out.println("Put() failed.  Get() some.");
            return;
        }
    }

    Object get() {
        if (Number > 0) {
            Number = Number - 1;
            return objects[Number];
        } else {
            System.out.println("Get() failed.  Put() some.");
            return null;
        }
    }
}

