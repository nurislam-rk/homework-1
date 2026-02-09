# Frequently Asked Questions (FAQ)

## General Questions

### Q: How much code do I need to write?
**A:** There's no specific line count requirement. Focus on:
- At least 3 character classes
- At least 3 equipment themes (6 equipment items total)
- Factory Method implementation
- Abstract Factory implementation
- A working demo in Main.java

Quality > Quantity. Clean, well-designed code is better than lots of messy code.

### Q: Can I use enums?
**A:** Yes! Enums can be useful for things like:
- Character types: `enum CharacterType { WARRIOR, MAGE, ARCHER }`
- Equipment themes: `enum EquipmentTheme { MEDIEVAL, MAGIC, RANGER }`

However, don't let enums replace the design patterns. You still need proper factories.

### Q: Can I add features beyond the requirements?
**A:** Absolutely! Some ideas:
- Character levels and experience
- Equipment stats bonuses
- Combat system
- Inventory management
- Character skills/talents

But make sure you complete the core requirements first!

### Q: Should I use abstract classes or interfaces?
**A:** Great question! Consider:
- **Interface**: When you have no common implementation to share
- **Abstract class**: When you have shared implementation (fields, methods)

For example:
- `Character` might be abstract class (shared: name, stats, equipment fields)
- `Weapon` might be interface (implementations are too different)

Research and decide based on your design!

---

## Factory Method Questions

### Q: What exactly is a "factory method"?
**A:** It's a method that creates objects. Key characteristics:
- Returns a Product (e.g., Character)
- Subclasses override it to return specific concrete products
- Defers object creation to subclasses

Example structure:
```java
abstract class CharacterFactory {
    abstract Character createCharacter(String name);
}

class WarriorFactory extends CharacterFactory {
    Character createCharacter(String name) {
        return new Warrior(name);
    }
}
```

### Q: Can I use a simple factory instead?
**A:** A "Simple Factory" (parameterized factory with if-else) is NOT the Factory Method pattern:
```java
// This is Simple Factory (NOT Factory Method pattern):
class SimpleFactory {
    Character create(String type, String name) {
        if (type.equals("warrior")) return new Warrior(name);
        if (type.equals("mage")) return new Mage(name);
        // ... violates Open/Closed!
    }
}
```

Factory Method uses **inheritance** and **polymorphism** to eliminate if-else chains.

### Q: Where should the factory selection happen?
**A:** The client code needs to somehow get the right factory. Options:

**Option 1: Registry pattern**
```java
Map<String, CharacterFactory> registry = new HashMap<>();
registry.put("warrior", new WarriorFactory());
registry.put("mage", new MageFactory());

CharacterFactory factory = registry.get(userInput);
```

**Option 2: Configuration**
```java
CharacterFactory factory = FactoryProvider.getFactory(configType);
```

Some coupling is inevitable at SOME point. The key is localizing it.

### Q: Do I need a separate factory class for each character?
**A:** That's one approach (and very aligned with Factory Method). But there are others:
- One factory class per character (WarriorFactory, MageFactory)
- One factory with subclass methods
- Static factory methods on Character class

Research different approaches and choose what makes sense!

---

## Abstract Factory Questions

### Q: What's the difference between Factory Method and Abstract Factory?
**A:**

**Factory Method:**
- Creates ONE product type
- Uses inheritance (subclasses)
- Example: Different character creators

**Abstract Factory:**
- Creates FAMILIES of related products
- Uses composition (factory objects)
- Example: Equipment sets (weapon + armor together)

### Q: Why do I need Abstract Factory? Can't I just use Factory Method twice?
**A:** You could, but you'd lose the guarantee of consistency:

```java
// Without Abstract Factory (BAD - possible mismatch):
Weapon weapon = weaponFactory.create("medieval");
Armor armor = armorFactory.create("magic"); // MISMATCH!

// With Abstract Factory (GOOD - guaranteed match):
EquipmentFactory factory = new MedievalEquipmentFactory();
Weapon weapon = factory.createWeapon();  // Medieval sword
Armor armor = factory.createArmor();     // Medieval armor - GUARANTEED MATCH!
```

### Q: How many methods should my Abstract Factory have?
**A:** At minimum: `createWeapon()` and `createArmor()`

But you could add more:
- `createAccessory()` (shields, rings, etc.)
- `createConsumable()` (potions matching theme)

The key is that all products from one factory belong to the same family.

### Q: Can one factory create products for another factory?
**A:** No! That defeats the purpose. Each concrete factory should create its own complete family:

```java
// WRONG:
class MedievalFactory implements EquipmentFactory {
    Weapon createWeapon() { return new IronSword(); }
    Armor createArmor() {
        return magicFactory.createArmor(); // NO! Wrong family!
    }
}

// RIGHT:
class MedievalFactory implements EquipmentFactory {
    Weapon createWeapon() { return new IronSword(); }
    Armor createArmor() { return new PlateArmor(); } // Same family!
}
```

---

## Implementation Questions

### Q: Should Character know about Weapon and Armor?
**A:** Yes! Characters need to be equipped:

```java
class Warrior implements Character {
    private Weapon equippedWeapon;
    private Armor equippedArmor;

    void equipWeapon(Weapon weapon) { this.equippedWeapon = weapon; }
    void equipArmor(Armor armor) { this.equippedArmor = armor; }
}
```

This is composition: Character HAS-A Weapon, HAS-A Armor.

### Q: How do I display character equipment?
**A:** Add a method to Character:

```java
void displayEquipment() {
    if (equippedWeapon != null) {
        System.out.println("Weapon: " + equippedWeapon.getWeaponInfo());
    }
    if (equippedArmor != null) {
        System.out.println("Armor: " + equippedArmor.getArmorInfo());
    }
}
```

### Q: Should I validate input in Main.java?
**A:** For this assignment, you don't need complex validation. Focus on demonstrating the patterns. You can assume:
- User inputs are valid
- Hardcode demonstrations are fine
- Focus on pattern implementation, not UI/UX

### Q: What should my Main.java output look like?
**A:** Make it clear and informative:

```
=== RPG Character & Equipment System ===

--- Creating Characters ---
Character created: Thor (Warrior)
  Health: 150 | Mana: 30 | Strength: 80 | Intelligence: 20
  Special Ability: Berserker Rage

Character created: Gandalf (Mage)
  Health: 70 | Mana: 150 | Strength: 20 | Intelligence: 90
  Special Ability: Arcane Blast

--- Equipping Characters ---
Equipping Thor with Medieval equipment...
  Weapon: Iron Sword (Damage: 25)
  Armor: Plate Armor (Defense: 30)

Equipping Gandalf with Magic equipment...
  Weapon: Wizard Staff (Damage: 15, Mana Boost: 20)
  Armor: Enchanted Robes (Defense: 10, Mana Boost: 25)

[etc...]
```

---

## UML Diagram Questions

### Q: What tool should I use for UML diagrams?
**A:** Many options:
- **draw.io** (diagrams.net) - Free, web-based
- **Lucidchart** - Free tier available
- **PlantUML** - Code-based diagrams
- **Visual Paradigm** - Professional tool (free community edition)
- **Hand-drawn** - Acceptable if clear and legible!

### Q: How detailed should my UML diagrams be?
**A:** Include:
- All classes, interfaces, abstract classes
- Relationships: inheritance (▷), implementation (▷ dashed), association (→)
- Key attributes (fields)
- Key methods (at least method signatures)

You don't need:
- Private helper methods
- Every getter/setter
- Implementation details

### Q: Should I make one UML diagram or separate ones?
**A:** Recommended: **Two separate diagrams**
1. Factory Method diagram (Character creation)
2. Abstract Factory diagram (Equipment creation)

This makes it clearer. But one comprehensive diagram is also acceptable if well-organized.

### Q: What format should I submit UML diagrams in?
**A:** PDF or image formats (PNG, JPG) are fine. Just make sure:
- Text is readable
- Relationships are clear
- Proper UML notation is used

---

## Design Questions

### Q: Is it okay to have if-else in my factory selection?
**A:** At SOME point, you need to decide which factory to use. This is acceptable:

```java
// In Main.java or config class:
EquipmentFactory factory;
if (theme.equals("medieval")) {
    factory = new MedievalEquipmentFactory();
} else if (theme.equals("magic")) {
    factory = new MagicEquipmentFactory();
}
```

The key is:
- This logic is LOCALIZED (one place)
- The rest of your code works with EquipmentFactory interface
- You're not using if-else to create products themselves

### Q: Should I use Singleton for factories?
**A:** Singleton is a separate pattern not required for this assignment. Focus on Factory Method and Abstract Factory.

But if you want extra credit, you could make factories singletons since you only need one instance of each factory.

### Q: How do I make my design "extensible"?
**A:** Extensible means easy to add new types WITHOUT modifying existing code (Open/Closed Principle).

Test your design:
- Can you add a new character class without changing existing character classes? ✓
- Can you add a new equipment theme without changing existing factories? ✓
- Does adding new types require only creating new classes (not modifying old ones)? ✓

### Q: What if my design doesn't follow the patterns exactly?
**A:** There are variations of these patterns. What matters:
- You understand the PROBLEM each pattern solves
- Your solution demonstrates the key concepts:
  - Factory Method: Delegation to subclasses
  - Abstract Factory: Families of related objects
- You can explain your design decisions

---

## Submission Questions

### Q: Where do I put my UML diagrams?
**A:** Create a folder in project root:
```
homework-1/
├── diagrams/
│   ├── factory-method-uml.pdf
│   └── abstract-factory-uml.pdf
└── [other files...]
```

### Q: Do I need to remove TODO comments?
**A:** Yes, remove or complete all TODOs before submission. Replace them with:
- Actual implementation
- Or explanatory comments if you made design decisions

### Q: Should I include a written report?
**A:** Not required unless specified by instructor. Your code and UML diagrams should speak for themselves.

If you want to add a brief design decisions document, that's a bonus!

### Q: What if my code doesn't compile?
**A:** **Code MUST compile to receive credit.** Before submitting:
```bash
mvn clean compile
```

If there are errors, fix them. Use IDE error messages to guide you.

---

## Common Mistakes

### ❌ Mistake 1: Using if-else chains for product creation
```java
// DON'T DO THIS:
Character create(String type) {
    if (type.equals("warrior")) return new Warrior();
    // This violates Open/Closed Principle!
}
```

### ❌ Mistake 2: Not using interfaces/abstractions
```java
// DON'T DO THIS:
MedievalEquipmentFactory factory = new MedievalEquipmentFactory();

// DO THIS:
EquipmentFactory factory = new MedievalEquipmentFactory();
```

### ❌ Mistake 3: Creating mismatched equipment
```java
// Your Abstract Factory should make this IMPOSSIBLE:
Weapon weapon = medievalFactory.createWeapon();
Armor armor = magicFactory.createArmor(); // MISMATCH!
```

### ❌ Mistake 4: Too much in Main.java
```java
// Don't put all your logic in Main:
class Main {
    public static void main(String[] args) {
        // 500 lines of code...
    }
}
```

Extract helper methods or create a Game class.

### ❌ Mistake 5: Not demonstrating both patterns
Your submission must clearly show:
- Factory Method being used (character creation)
- Abstract Factory being used (equipment creation)
- How they work together

---

## Still Stuck?

1. **Re-read the documentation**
   - ASSIGNMENT.md
   - FACTORY_HINTS.md
   - QUICKSTART.md

2. **Research the patterns**
   - Refactoring Guru
   - Head First Design Patterns
   - GeeksforGeeks

3. **Draw it out**
   - Sketch class hierarchy
   - Draw object relationships
   - Plan before coding

4. **Start smaller**
   - Get one character working
   - Get one equipment set working
   - Then expand

5. **Ask for help**
   - Clarification on requirements
   - Conceptual understanding
   - Design decisions

**Remember: Struggling with design decisions IS the learning process!** 💪

Don't give up - the patterns will "click" once you work through the problems they solve.
