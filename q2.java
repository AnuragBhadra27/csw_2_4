class ReassigningReference {
    String name;
    ReassigningReference(String name) { this.name = name; }

    public void finalize() {
        System.out.println(name + " collected");
    }

    public static void main(String[] args) {
        ReassigningReference r1 = new ReassigningReference("Obj1");
        ReassigningReference r2 = new ReassigningReference("Obj2");
        r1 = r2;  // Reassign reference
        System.gc();
    }
}
