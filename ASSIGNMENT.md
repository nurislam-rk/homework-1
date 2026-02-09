# Homework 1: Detailed Assignment Instructions

## Background Story
You've been hired by a game studio to design the character creation and equipment system for their new RPG. The game director has these requirements:

### Character System Requirements
- Support multiple character classes (Warrior, Mage, Archer at minimum)
- Each class has unique base stats (health, mana, strength, intelligence)
- Each class has a special ability
- **Must be easy to add new character classes without modifying existing code**

### Equipment System Requirements
- Characters can equip weapons and armor
- Equipment comes in **thematic sets** (Medieval, Magic, Ranger)
- Items in a set should work together thematically
- **Must guarantee that weapon and armor from same theme are created together**
- **Must be easy to add new equipment themes**

### Why Design Patterns?
Without patterns, you'd have code like:
```java
if (type.equals("warrior")) {
    character = new Warrior();
} else if (type.equals("mage")) {
    character = new Mage();
} // ... violates Open/Closed Principle!
```

Your job: **Use Factory Method and Abstract Factory to solve these problems elegantly.**

---

## Part 1: Character Creation (Factory Method Pattern)

### The Problem
You need to create different character types, but:
- The exact character class isn't known until runtime (player chooses)
- Adding new character classes should NOT require modifying existing code
- Character creation logic should be encapsulated

### Your Tasks

#### 1.1 Design the Character Hierarchy
- Create a `Character` interface or abstract class
- Implement at least 3 concrete character classes:
  - **Warrior**: High health, high strength, low mana, low intelligence
  - **Mage**: Low health, low strength, high mana, high intelligence
  - **Archer**: Medium stats across the board
- Each character should have:
  - Attributes: `name`, `health`, `mana`, `strength`, `intelligence`
  - Methods: `getStats()`, `useSpecialAbility()`

#### 1.2 Implement Factory Method Pattern
- Design a factory structure that creates characters
- Make it easy to add new character types (e.g., Rogue, Paladin) later
- **Hint**: Think about what should vary vs what should stay the same

#### 1.3 Questions to Guide You
- What is the "product" in this scenario?
- Who decides which concrete character to create?
- Where should the `new Warrior()` code live?

---

## Part 2: Equipment System (Abstract Factory Pattern)

### The Problem
You need to create equipment sets where:
- Each set has a **Weapon** AND **Armor** that match thematically
- You must guarantee items from the same theme are created together
- Adding new themes should be straightforward

### Example Equipment Sets

**Medieval Theme:**
- Weapon: Iron Sword (damage: 25)
- Armor: Plate Armor (defense: 30)

**Magic Theme:**
- Weapon: Wizard Staff (damage: 15, mana boost: 20)
- Armor: Enchanted Robes (defense: 10, mana boost: 25)

**Ranger Theme:**
- Weapon: Longbow (damage: 30, range: "long")
- Armor: Leather Armor (defense: 20, agility bonus)

### Your Tasks

#### 2.1 Design Equipment Interfaces
- Create `Weapon` interface with methods like `getWeaponInfo()`, `getDamage()`
- Create `Armor` interface with methods like `getArmorInfo()`, `getDefense()`

#### 2.2 Implement Concrete Equipment
- Create at least 3 weapons (one per theme)
- Create at least 3 armors (one per theme)
- Add unique attributes to make each theme distinctive

#### 2.3 Implement Abstract Factory Pattern
- Design a factory structure that creates **families** of equipment
- Each factory should create matching weapon + armor pairs
- **Hint**: What ensures a Medieval weapon always pairs with Medieval armor?

#### 2.4 Questions to Guide You
- What is a "product family" here?
- How do you guarantee consistency within a family?
- How would you add a "Dragon Slayer" theme later?

---

## Part 3: Integration & Demonstration

### 3.1 Complete Main.java
Your `Main.java` should demonstrate:

```java
// Example output structure (your implementation will differ):

=== RPG Character Creation System ===

Creating Warrior...
[Character stats display]
Special Ability: [Ability description]

Equipping with Medieval Set...
Weapon: Iron Sword (Damage: 25)
Armor: Plate Armor (Defense: 30)

---

Creating Mage...
[Character stats display]
Special Ability: [Ability description]

Equipping with Magic Set...
Weapon: Wizard Staff (Damage: 15, Mana Boost: 20)
Armor: Enchanted Robes (Defense: 10, Mana Boost: 25)

---

[Continue for at least 3 characters with different equipment]
```

### 3.2 Demonstrate Extensibility
In comments or a brief demo, show how easy it is to:
- Add a new character class (e.g., Rogue)
- Add a new equipment theme (e.g., Undead)

---

## Part 4: UML Diagrams

Create UML class diagram(s) showing:
1. **Factory Method structure**: Character hierarchy and creation mechanism
2. **Abstract Factory structure**: Equipment families and factory hierarchy
3. **Relationships**: Associations, dependencies, inheritance

### UML Requirements
- Show all classes, interfaces, and abstract classes
- Show relationships (inheritance, implementation, association)
- Include key methods and attributes
- Use proper UML notation

**Tools you can use:**
- draw.io (diagrams.net)
- Lucidchart
- PlantUML
- Even hand-drawn (if clear and legible!)

---

## Grading Rubric (Total: 100 points)

### Code Implementation (60 points)
- **Factory Method (25 points)**
  - Character interface/abstract class: 5 pts
  - 3+ character implementations: 10 pts
  - Proper factory structure: 10 pts

- **Abstract Factory (25 points)**
  - Equipment interfaces: 5 pts
  - 3+ themed equipment families: 10 pts
  - Proper abstract factory structure: 10 pts

- **Code Quality (10 points)**
  - Follows Java conventions: 3 pts
  - Proper encapsulation: 3 pts
  - Code organization: 2 pts
  - No redundancy: 2 pts

### UML Diagrams (25 points)
- Factory Method diagram: 10 pts
- Abstract Factory diagram: 10 pts
- Clarity and correctness: 5 pts

### Demonstration (15 points)
- Main.java demonstrates all features: 10 pts
- Output is clear and informative: 5 pts

---

## Common Pitfalls to Avoid

❌ **Using if-else chains for object creation**
```java
// This defeats the purpose!
if (type == "warrior") return new Warrior();
```

❌ **Mixing equipment themes accidentally**
```java
// Abstract Factory should prevent this!
weapon = new MagicStaff();
armor = new PlateArmor(); // Mismatch!
```

❌ **Tight coupling**
```java
// Don't do this:
MageFactory factory = new MageFactory();
// Do this:
CharacterFactory factory = getFactory(type);
```

❌ **Not using interfaces**
- Everything should be "programmed to an interface"

---

## Tips for Success

1. **Start Small**: Get one character and one equipment set working first
2. **Research First**: Understand the patterns before coding
3. **Draw First**: Sketch your class hierarchy before writing code
4. **Test Often**: Run Main.java frequently to catch issues early
5. **Refactor**: Your first design won't be perfect - that's okay!
6. **Ask "Why"**: Understand WHY each pattern solves a specific problem

---

## Submission Checklist

Before submitting, ensure:
- [ ] All TODOs are completed
- [ ] Code compiles without errors
- [ ] Main.java demonstrates all features
- [ ] At least 3 character classes implemented
- [ ] At least 3 equipment themes implemented
- [ ] UML diagrams are included (PDF or image)
- [ ] Factory Method pattern correctly applied
- [ ] Abstract Factory pattern correctly applied
- [ ] Code follows Java naming conventions
- [ ] No hardcoded if-else chains for object creation

---

## Academic Integrity

This is an individual assignment. You may:
- Research design patterns online
- Discuss concepts with classmates
- Ask instructor for clarification

You may NOT:
- Copy code from classmates
- Share your implementation with others
- Use AI to write the code for you

**Learning happens when YOU struggle with the design decisions!**

---

## Resources

### Design Pattern References
- "Head First Design Patterns" - Chapter on Factory patterns
- Refactoring Guru: Factory Method
- Refactoring Guru: Abstract Factory
- GeeksforGeeks Java Design Patterns

### Java Documentation
- Java Interfaces
- Java Abstract Classes
- Java Inheritance

### UML Resources
- UML Class Diagram Tutorial
- draw.io UML templates

---

Good luck! Remember: The goal isn't just to complete the assignment, but to **understand** why these patterns exist and when to use them.

**The patterns you learn here will serve you throughout your entire software engineering career.** 🚀
