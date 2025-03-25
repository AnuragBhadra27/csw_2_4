class AnonymousObject {
    String name;
    AnonymousObject(String name) { this.name = name; }

    public void finalize() {
        System.out.println(name + " collected");
    }

    public static void main(String[] args) {
        new AnonymousObject("Anon");  // Anonymous object
        System.gc();
    }
}
