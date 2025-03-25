class UnreachableObject {
    String name;
    UnreachableObject(String name) { this.name = name; }

    public void finalize() { 
        System.out.println(name + " collected"); 
    }

    void show() {
        new UnreachableObject("Obj1").display();
    }

    void display() {
        new UnreachableObject("Obj2");
    }

    public static void main(String[] args) {
        new UnreachableObject("Main").show();
        System.gc();
    }
}
