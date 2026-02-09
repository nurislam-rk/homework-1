# Homework 1: RPG Character & Equipment System

## Overview
Build a fantasy RPG system that creates characters and equips them with thematic gear using **Factory Method** and **Abstract Factory** design patterns.

## Your Mission
You are designing a game where:
1. Players can create different character classes (Warrior, Mage, Archer, etc.)
2. Characters can be equipped with themed equipment sets (weapons + armor that match)
3. The system must be easily extensible to add new character classes and equipment themes

## What You'll Learn
- When to use Factory Method vs Abstract Factory
- How to design flexible, extensible systems
- The power of "programming to interfaces"
- How design patterns solve real architectural problems

## Requirements
- ✅ Implement at least 3 character classes using **Factory Method** pattern
- ✅ Implement at least 3 equipment themes using **Abstract Factory** pattern
- ✅ Characters must have distinct attributes and abilities
- ✅ Equipment sets must be thematically consistent (Medieval, Magic, Ranger, etc.)
- ✅ Demonstrate your system in `Main.java`
- ✅ Create UML diagram(s) showing your design

## Deliverables
1. **Working Java code** - All TODOs completed, system runs without errors
2. **UML Class Diagram(s)** - Show your factory implementations (PDF or image)
3. **Demo output** - Your Main.java should demonstrate:
   - Creating different character types
   - Equipping characters with different themed sets
   - Showing character stats and equipment details

## Time Estimate
4-5 days of focused work

## Getting Started
1. Read `ASSIGNMENT.md` for detailed instructions
2. Research Factory Method and Abstract Factory patterns
3. Plan your class hierarchy (sketch it out!)
4. Start with the interfaces and work your way up
5. Test frequently using `Main.java`

## Running the Project
```bash
# Compile
mvn compile

# Run
mvn exec:java -Dexec.mainClass="com.narxoz.rpg.Main"
```

## Hints
- Start by understanding the PROBLEM before jumping to the SOLUTION
- Factory Method: "Let subclasses decide which class to instantiate"
- Abstract Factory: "Create families of related objects without specifying concrete classes"
- Draw diagrams as you go - it helps clarify your thinking!

## Questions?
If you're stuck, ask yourself:
- What is the problem I'm trying to solve?
- Which objects need to be created together?
- What should be easy to extend in the future?

Good luck! 🎮⚔️
