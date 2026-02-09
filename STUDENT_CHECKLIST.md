# Student Progress Checklist

Use this checklist to track your progress and ensure you've completed all requirements.

## Phase 1: Understanding (Day 1)
- [ ] Read `README.md` completely
- [ ] Read `ASSIGNMENT.md` completely
- [ ] Research Factory Method pattern
  - [ ] Understand the problem it solves
  - [ ] Understand the structure (Creator, ConcreteCreator, Product)
  - [ ] Find at least 2 example implementations online
- [ ] Research Abstract Factory pattern
  - [ ] Understand the problem it solves
  - [ ] Understand product families concept
  - [ ] Find at least 2 example implementations online
- [ ] Study the provided example files:
  - [ ] `Warrior.java`
  - [ ] `IronSword.java`
  - [ ] `FACTORY_HINTS.md`

## Phase 2: Planning (Day 1-2)
- [ ] Sketch class hierarchy on paper
  - [ ] Character hierarchy
  - [ ] Equipment hierarchy
  - [ ] Factory structures
- [ ] Decide on your implementation approach:
  - [ ] How will you implement Factory Method?
  - [ ] How will you implement Abstract Factory?
- [ ] List all classes you need to create
- [ ] Start rough UML diagram (will refine later)

## Phase 3: Character System Implementation (Day 2-3)
- [ ] Complete `Character` interface/abstract class
  - [ ] Define all necessary methods
  - [ ] Consider what's common vs what varies
- [ ] Implement concrete character classes:
  - [ ] Mage (high intelligence/mana, low strength/health)
  - [ ] Archer (balanced stats)
  - [ ] (Optional) Additional character types
- [ ] Implement Factory Method pattern:
  - [ ] Create factory structure
  - [ ] Ensure no if-else chains in client code
  - [ ] Test character creation in `Main.java`

**Checkpoint:** Can you create different characters without using if-else chains?

## Phase 4: Equipment System Implementation (Day 3-4)
- [ ] Complete `Weapon` interface
  - [ ] Define all necessary methods
- [ ] Complete `Armor` interface
  - [ ] Define all necessary methods
- [ ] Implement Medieval equipment set:
  - [ ] Medieval Weapon (IronSword provided as example)
  - [ ] Medieval Armor (create PlateArmor)
- [ ] Implement Magic equipment set:
  - [ ] Magic Weapon (create WizardStaff)
  - [ ] Magic Armor (create EnchantedRobes)
- [ ] Implement Ranger equipment set:
  - [ ] Ranger Weapon (create Longbow)
  - [ ] Ranger Armor (create LeatherArmor)
- [ ] (Optional) Additional equipment themes

**Checkpoint:** Do you have at least 3 complete equipment sets?

## Phase 5: Abstract Factory Implementation (Day 4)
- [ ] Create Abstract Factory structure:
  - [ ] Define factory interface/abstract class
  - [ ] Methods: `createWeapon()`, `createArmor()`
- [ ] Implement concrete factories:
  - [ ] MedievalEquipmentFactory
  - [ ] MagicEquipmentFactory
  - [ ] RangerEquipmentFactory
- [ ] Test equipment creation in `Main.java`

**Checkpoint:** Can you guarantee weapon and armor from same theme are created together?

## Phase 6: Integration (Day 4-5)
- [ ] Add equipment support to Character:
  - [ ] Fields for weapon and armor
  - [ ] Methods to equip items
  - [ ] Methods to display equipment
- [ ] Complete `Main.java`:
  - [ ] Create multiple characters using factories
  - [ ] Equip characters with different themed sets
  - [ ] Display character stats and equipment
  - [ ] Make output clear and informative
- [ ] Test thoroughly:
  - [ ] All characters create correctly
  - [ ] All equipment sets work
  - [ ] No mismatched equipment possible
  - [ ] Code compiles without errors

**Checkpoint:** Does your demo showcase both patterns clearly?

## Phase 7: UML Diagrams (Day 5)
- [ ] Create Factory Method UML diagram:
  - [ ] Show Character hierarchy
  - [ ] Show factory structure
  - [ ] Show relationships (inheritance, implementation)
  - [ ] Include key methods
- [ ] Create Abstract Factory UML diagram:
  - [ ] Show Equipment hierarchies (Weapon, Armor)
  - [ ] Show factory hierarchy
  - [ ] Show product families
  - [ ] Include key methods
- [ ] Ensure diagrams are clear and properly formatted
- [ ] Export as PDF or image

## Phase 8: Code Quality Review (Day 5)
- [ ] Code follows Java naming conventions:
  - [ ] Classes: PascalCase
  - [ ] Methods/variables: camelCase
  - [ ] Constants: UPPER_SNAKE_CASE
  - [ ] Packages: lowercase
- [ ] Proper encapsulation:
  - [ ] Fields are private
  - [ ] Public methods where appropriate
  - [ ] No unnecessary public access
- [ ] No code duplication
- [ ] Clear and consistent formatting
- [ ] Meaningful variable/method names
- [ ] All TODOs completed or removed

## Phase 9: Final Testing (Day 5)
- [ ] Compile the project: `mvn compile`
- [ ] Run the demo: `mvn exec:java -Dexec.mainClass="com.narxoz.rpg.Main"`
- [ ] Verify all features work as expected
- [ ] Check output is professional and informative
- [ ] Test adding a new character type (verify extensibility)
- [ ] Test adding a new equipment theme (verify extensibility)

## Phase 10: Submission Preparation (Day 5)
- [ ] All code files are complete
- [ ] UML diagrams are included in project folder
- [ ] Code compiles without errors or warnings
- [ ] No leftover TODO comments in final submission
- [ ] (Optional) Add comments explaining design decisions
- [ ] Review grading rubric in ASSIGNMENT.md
- [ ] Ensure academic integrity (original work)

## Self-Assessment Questions

Before submitting, answer these questions honestly:

### Factory Method Pattern
1. Can you explain WHY Factory Method is better than if-else chains?
2. Can you add a new character type without modifying existing code?
3. Where does the `new Warrior()` code live in your implementation?

### Abstract Factory Pattern
4. Can you explain what a "product family" is in your implementation?
5. How does your design prevent mismatched equipment (e.g., Magic weapon + Medieval armor)?
6. Can you add a new equipment theme without modifying existing factories?

### Design Principles
7. Does your code follow the Open/Closed Principle?
8. Are you "programming to interfaces" rather than concrete classes?
9. Can you explain the difference between Factory Method and Abstract Factory?

If you can confidently answer all these questions, you're ready to submit! 🎯

---

## Time Management Tips

**Don't have 5 full days?** Prioritize:
1. **Minimum viable product** (Days 1-3):
   - 3 character types
   - 3 equipment themes
   - Basic factory implementations
   - Simple demo

2. **Polish and diagrams** (Days 4-5):
   - Clean up code
   - Add more features
   - Create UML diagrams
   - Improve demo output

**Stuck on something?**
- Review `FACTORY_HINTS.md`
- Research the specific pattern online
- Draw it out on paper
- Ask instructor for clarification (not implementation!)

**Remember:** The goal is to UNDERSTAND the patterns, not just complete the assignment. Take your time, think critically, and learn! 🚀
