
// Interface defining capabilities
interface Growable {
    void growRoots();
    void photosynthesize();
}
// Abstract class representing a Tree
abstract class Tree implements Growable {
    private int waterLevel = 0;
    private int nutrientLevel = 0;

    // Encapsulated method to absorb water
    public void absorbWater(int amount) {
        waterLevel += amount;
        System.out.println("Absorbing " + amount + " units of water. Total water: " + waterLevel);
    }
    // Encapsulated method to absorb nutrients
    public void absorbNutrients(int amount) {
        nutrientLevel += amount;
        System.out.println("Absorbing " + amount + " units of nutrients. Total nutrients: " + nutrientLevel);
    }
    // Regular method shared by all trees
    public void growLeaves() {
        System.out.println("Growing green leaves...");
    }
    // Abstract method to be implemented by subclasses
    abstract void growFruit();
}
// MangoTree class
class MangoTree extends Tree {
    public void growFruit() {
        System.out.println("Growing sweet mangoes!");
    }
    public void growRoots() {
        System.out.println("Mango tree roots growing deep into the soil.");
    }
    public void photosynthesize() {
        System.out.println("Mango tree converting sunlight into energy.");
    }
}
// AppleTree class
class AppleTree extends Tree {
    public void growFruit() {
        System.out.println("Growing juicy apples!");
    }
    public void growRoots() {
        System.out.println("Apple tree roots spreading wide and strong.");
    }
    public void photosynthesize() {
        System.out.println("Apple tree converting sunlight into energy.");
    }
}

// Main class to test the program
public class TreeTestTwo {
    public static void main(String[] args) {
        Tree mango = new MangoTree();
        Tree apple = new AppleTree();

        System.out.println("--- Mango Tree ---");
        mango.absorbWater(5);
        mango.absorbNutrients(3);
        mango.growRoots();
        mango.photosynthesize();
        mango.growLeaves();
        mango.growFruit();

        System.out.println("--- Apple Tree ---");
        apple.absorbWater(4);
        apple.absorbNutrients(2);
        apple.growRoots();
        apple.photosynthesize();
        apple.growLeaves();
        apple.growFruit();
    }
}

/*
Coding Notes
🔗 The Chain:
-> Growable is an interface — it defines a contract (e.g., growRoots(), photosynthesize()).
-> Tree is an abstract class that implements Growable, meaning it agrees to fulfill the contract.
-> MangoTree is a concrete class that extends Tree.

🔍 So what does MangoTree inherit?
From Tree:
    -> All concrete methods (like growLeaves(), absorbWater(), etc.)
    -> Any abstract methods (like growFruit()) that it must implement
From Growable (via Tree):
    ->The contract to implement growRoots() and photosynthesize()

So yes — MangoTree indirectly inherits the interface Growable through Tree, but it still has to implement the methods from Growable unless Tree already did.

🧠 Important Note:
    -> If Tree does not implement all methods from Growable, then Tree must be abstract, and MangoTree must implement the remaining methods.
    -> If Tree does implement all methods from Growable, then MangoTree doesn’t need to worry about the interface at all—it just inherits the behavior.


*/