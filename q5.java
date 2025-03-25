public class MemoryDemo {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("Total Memory: " + rt.totalMemory());
        System.out.println("Free Memory: " + rt.freeMemory());

        int[] arr = new int[100000];  // Allocate memory
        System.out.println("Memory after allocation: " + rt.freeMemory());

        arr = null;  // Make unreachable
        System.gc();
        
        System.out.println("Memory after GC: " + rt.freeMemory());
    }
}
