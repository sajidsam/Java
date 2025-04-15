package org.example.chapter8;

public class SetOfInt {
    private boolean[] set;

    public SetOfInt() {
        set = new boolean[101];
    }

    public void insertElement(int k) {
        if (k >= 0 && k <= 100) set[k] = true;
    }

    public void deleteElement(int m) {
        if (m >= 0 && m <= 100) set[m] = false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        boolean isEmpty = true;
        for (int i = 0; i < set.length; i++) {
            if (set[i]) {
                sb.append(i).append(" ");
                isEmpty = false;
            }
        }
        return isEmpty ? "---" : sb.toString().trim();
    }

    public boolean isEqualTo(SetOfInt other) {
        for (int i = 0; i < set.length; i++) {
            if (this.set[i] != other.set[i]) return false;
        }
        return true;
    }

    public static SetOfInt union(SetOfInt s1, SetOfInt s2) {
        SetOfInt result = new SetOfInt();
        for (int i = 0; i < result.set.length; i++) {
            result.set[i] = s1.set[i] || s2.set[i];
        }
        return result;
    }

    public static SetOfInt intersection(SetOfInt s1, SetOfInt s2) {
        SetOfInt result = new SetOfInt();
        for (int i = 0; i < result.set.length; i++) {
            result.set[i] = s1.set[i] && s2.set[i];
        }
        return result;
    }

    public static void main(String[] args) {
        SetOfInt a = new SetOfInt();
        SetOfInt b = new SetOfInt();

        a.insertElement(10);
        a.insertElement(20);
        a.insertElement(30);

        b.insertElement(20);
        b.insertElement(40);

        System.out.println("Set A: " + a);
        System.out.println("Set B: " + b);

        SetOfInt union = SetOfInt.union(a, b);
        SetOfInt intersect = SetOfInt.intersection(a, b);

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersect);

        a.deleteElement(10);
        System.out.println("Set A after deleting 10: " + a);

        System.out.println("A equals B? " + a.isEqualTo(b));
    }
}
