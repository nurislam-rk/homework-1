# Quick Start Guide

## Prerequisites
- Java 17 or higher installed
- Maven installed
- IDE of your choice (IntelliJ IDEA, Eclipse, VS Code, etc.)

## Setup

### 1. Verify Java Installation
```bash
java -version
# Should show Java 17 or higher
```

### 2. Verify Maven Installation
```bash
mvn -version
# Should show Maven 3.x
```

### 3. Open Project in IDE

#### IntelliJ IDEA
1. Open IntelliJ IDEA
2. File → Open
3. Navigate to `homework-1` folder
4. Select `pom.xml` → Open as Project
5. Wait for Maven dependencies to download

#### VS Code
1. Open VS Code
2. File → Open Folder
3. Select `homework-1` folder
4. Install "Extension Pack for Java" if not already installed

#### Eclipse
1. Open Eclipse
2. File → Import → Existing Maven Projects
3. Select `homework-1` folder
4. Finish

## Building the Project

### Command Line
```bash
# Navigate to project directory
cd homework-1

# Compile the project
mvn compile

# Clean and compile (if you need fresh build)
mvn clean compile
```

### IDE
- **IntelliJ**: Build → Build Project
- **Eclipse**: Project → Build Project
- **VS Code**: Usually builds automatically

## Running the Demo

### Command Line
```bash
# Run Main.java
mvn exec:java -Dexec.mainClass="com.narxoz.rpg.Main"
```

### IDE
- Right-click `Main.java` → Run 'Main.main()'
- Or use the green play button next to the main method

## Project Structure

```
homework-1/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── narxoz/
│                   └── rpg/
│                       ├── Main.java              # Your demo starts here
│                       ├── character/             # Character classes go here
│                       │   ├── Character.java     # Interface to complete
│                       │   └── Warrior.java       # Example implementation
│                       ├── equipment/             # Equipment classes go here
│                       │   ├── Weapon.java        # Interface to complete
│                       │   ├── Armor.java         # Interface to complete
│                       │   └── IronSword.java     # Example weapon
│                       ├── factory/               # Your factory classes go here
│                       │   └── FACTORY_HINTS.md   # Read this!
│                       └── game/                  # (Optional) Game logic
├── pom.xml                                        # Maven configuration
├── README.md                                      # Project overview
├── ASSIGNMENT.md                                  # Detailed instructions
├── STUDENT_CHECKLIST.md                          # Track your progress
└── QUICKSTART.md                                 # This file!
```

## Development Workflow

### Recommended Order
1. **Day 1**: Read all documentation, research patterns, plan your design
2. **Day 2-3**: Implement character system with Factory Method
3. **Day 3-4**: Implement equipment system with Abstract Factory
4. **Day 4-5**: Complete integration, create UML diagrams, test thoroughly

### Testing Your Changes
```bash
# After making changes, compile and run:
mvn clean compile
mvn exec:java -Dexec.mainClass="com.narxoz.rpg.Main"
```

### Common Issues

#### "Java version not supported"
- Ensure you have Java 17 or higher
- Update `pom.xml` if you need to use different Java version

#### "mvn command not found"
- Maven is not installed or not in PATH
- Install Maven or use IDE's built-in Maven

#### "Cannot find symbol" errors
- You're using a class/method that doesn't exist yet
- Complete the required interfaces and classes first
- Or fix the typo in class/method name

#### "Main class not found"
- Ensure Main.java is in correct package: `com.narxoz.rpg`
- Check that package declaration matches directory structure

## Tips for Success

### 1. Start Small
Don't try to implement everything at once. Start with:
- One character type (Warrior is provided)
- One equipment set (Medieval is started)
- Basic factory structure

Then expand from there.

### 2. Test Frequently
After each small change:
```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.narxoz.rpg.Main"
```

### 3. Use TODOs
Search for "TODO" in your IDE to find what needs to be completed:
- **IntelliJ**: View → Tool Windows → TODO
- **VS Code**: Search "TODO" across workspace
- **Eclipse**: Search → File Search → "TODO"

### 4. Draw Before Coding
Before writing code:
- Sketch class hierarchy on paper
- Draw relationships between classes
- Plan which pattern goes where

### 5. Read Example Code
Study the provided examples:
- `Warrior.java` shows character structure
- `IronSword.java` shows equipment structure
- `FACTORY_HINTS.md` guides factory implementation

## Need Help?

### Resources
- `FACTORY_HINTS.md` - Pattern implementation guidance
- `ASSIGNMENT.md` - Detailed requirements and rubric
- `STUDENT_CHECKLIST.md` - Track your progress
- Refactoring Guru (website) - Pattern explanations
- "Head First Design Patterns" (book) - Great examples

### Ask Yourself First
Before asking for help:
1. Have I read all the provided documentation?
2. Have I researched the pattern online?
3. Have I drawn my design on paper?
4. What specifically am I stuck on?

### Questions for Instructor
- Clarification on requirements
- Conceptual understanding of patterns
- Design decisions and trade-offs

### NOT for Instructor
- "Can you write this code for me?"
- "Is my implementation correct?" (test it yourself!)
- "What class should I create?" (that's part of the learning!)

## Final Checklist Before Submission

```bash
# 1. Clean and compile
mvn clean compile

# 2. Run and verify output
mvn exec:java -Dexec.mainClass="com.narxoz.rpg.Main"

# 3. Check for errors or warnings
# Should have ZERO compilation errors

# 4. Verify UML diagrams are in project folder

# 5. Review STUDENT_CHECKLIST.md - all items checked?
```

---

Happy coding! Remember: **The goal is to understand WHY these patterns exist, not just to complete the assignment.** 🚀

The patterns you learn here will be valuable throughout your entire career as a software engineer!
