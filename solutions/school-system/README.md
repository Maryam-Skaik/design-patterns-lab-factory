# 🎓 Activity 1: School System Factory - Solution

## 🎯 Objective

This solution demonstrates how to apply the **Factory Pattern** to improve object creation and system design in a School System.

The design focuses on:

* Centralized object creation
* Reduced duplication
* Loose coupling
* Better maintainability
* Scalability for future student types

---

## 🧠 Solution Explanation

### Step 1: Identified Common Abstraction

We identified that all student types share common behavior:

* Studying

So we created a common interface:

* `Student`

This allows all student types to be treated uniformly using polymorphism.

---

### Step 2: Created Concrete Student Classes

We implemented multiple student types:

* `ScienceStudent`
* `ArtStudent`
* `SportsStudent`

Each class provides its own implementation of:

```java
study()
```

This keeps behaviors separated and organized.

---

### Step 3: Identified the Main Design Problem

Without the Factory Pattern, every class needing student objects would contain duplicated logic like:

```java
if(type.equalsIgnoreCase("science")){
    student = new ScienceStudent();
}
```

Problems with this approach:

* Repeated if-else logic
* Tight coupling
* Difficult maintenance
* Hard scalability
* Inconsistent object creation

---

### Step 4: Applied Factory Pattern

We introduced:

* `StudentFactory`

Its responsibility is ONLY:

* Creating Student objects

This centralizes all creation logic in one place.

---

## 🏗 UML Diagram Representation

```text
                          <<interface>>
+----------------------------------+
|             Student              |
+----------------------------------+
| + study()                        |
+----------------------------------+
              ▲
              |
    -----------------------------------------
    |                  |                    |
    |                  |                    |
+----------------+ +----------------+ +----------------+
| ScienceStudent | |   ArtStudent  | | SportsStudent |
+----------------+ +----------------+ +----------------+
| + study()      | | + study()      | | + study()     |
+----------------+ +----------------+ +----------------+


+------------------------------------------------------+
|                 StudentFactory                       |
+------------------------------------------------------+
| + createStudent(type: String): Student               |
+------------------------------------------------------+
              |
              | creates / dependency
              ▼

    ScienceStudent / ArtStudent / SportsStudent


+----------------------+        uses        +----------------------+
|        School        |------------------->|    StudentFactory    |
+----------------------+                    +----------------------+

+----------------------+        uses        +----------------------+
|       Teacher        |------------------->|    StudentFactory    |
+----------------------+                    +----------------------+

+----------------------+        uses        +----------------------+
|     SchoolEvent      |------------------->|    StudentFactory    |
+----------------------+                    +----------------------+
```

---

## Step 5: Key Design Decisions

### Common Abstraction

Using the `Student` interface allows:

* Polymorphism
* Flexible design
* Easier extension

---

### Centralized Object Creation

`StudentFactory` handles all object creation.

Benefits:

* Cleaner code
* Less duplication
* Easier maintenance

---

### Loose Coupling

Classes like:

* `School`
* `Teacher`
* `SchoolEvent`

do NOT know how student objects are created.

They only:

* Request a student object
* Use the object

This reduces dependency between system components.

---

### Scalability

Adding a new student type later becomes easier.

Examples:

* `MedicalStudent`
* `EngineeringStudent`
* `BusinessStudent`

Only the factory and new class need updates.

---

## 📏 Multiplicity & Relationships

### Relationships

* `ScienceStudent`, `ArtStudent`, `SportsStudent`
  → Realization relationship with `Student`

* `StudentFactory`
  → Dependency relationship with student classes

* `School`, `Teacher`, `SchoolEvent`
  → Dependency relationship with `StudentFactory`

---

## ✅ Key Concepts Demonstrated

* Factory Pattern
* Interfaces
* Polymorphism
* Encapsulation
* Centralized object creation
* Dependency relationship
* Loose coupling
* Maintainability
* Scalability
