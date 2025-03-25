class NullifiedReference {
    String name;
    NullifiedReference(String name) { this.name = name; }

    public void finalize() {
        System.out.println(name + " collected");
    }

    public static void main(String[] args) {
        NullifiedReference obj = new NullifiedReference("Obj1");
        obj = null;  // Nullify reference
        System.gc();
    }
}
