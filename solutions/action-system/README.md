# ⚙️ Activity 2: Action Processing System - Solution

## 🎯 Objective

This solution demonstrates how to apply the **Factory Pattern** to build a clean and scalable backend action processing system.

The design focuses on:

* Centralized object creation
* Reduced duplication
* Loose coupling
* Better maintainability
* Scalability for future action types

---

## 🧠 Solution Explanation

### Step 1: Identified Common Abstraction

We identified that all system actions share a common behavior:

* Processing / executing an action

So we created a common interface:

* `Action`

This allows all actions to be treated uniformly using polymorphism.

---

### Step 2: Created Concrete Action Classes

We implemented multiple action types:

* `PaymentAction`
* `OrderAction`
* `SupportAction`

Each class provides its own implementation of:

```java
execute()
```

This keeps behaviors separated and organized.

---

### Step 3: Identified the Main Design Problem

Without the Factory Pattern, every class needing actions would contain duplicated logic like:

```java
if(type.equalsIgnoreCase("payment")){
    action = new PaymentAction();
}
```

Problems with this approach:

* Repeated if-else logic
* Tight coupling
* Difficult maintenance
* Hard scalability
* Violates clean design principles

---

### Step 4: Applied Factory Pattern

We introduced:

* `ActionFactory`

Its responsibility is ONLY:

* Creating Action objects

This centralizes all creation logic in one place.

---

## 🏗 UML Diagram Representation

```text
                          <<interface>>
+----------------------------------+
|             Action               |
+----------------------------------+
| + execute()                      |
+----------------------------------+
              ▲
              |
    -----------------------------------------
    |                  |                    |
    |                  |                    |
+----------------+ +----------------+ +----------------+
| PaymentAction  | |  OrderAction  | | SupportAction |
+----------------+ +----------------+ +----------------+
| + execute()    | | + execute()    | | + execute()   |
+----------------+ +----------------+ +----------------+


+------------------------------------------------------+
|                 ActionFactory                        |
+------------------------------------------------------+
| + createAction(type: String): Action                 |
+------------------------------------------------------+
              |
              | creates / dependency
              ▼

        PaymentAction / OrderAction / SupportAction


+----------------------+        uses        +----------------------+
|    BackendSystem     |------------------->|    ActionFactory     |
+----------------------+                    +----------------------+

+----------------------+        uses        +----------------------+
|      AdminPanel      |------------------->|    ActionFactory     |
+----------------------+                    +----------------------+
```

---

## Step 5: Key Design Decisions

### Common Abstraction

Using the `Action` interface allows:

* Polymorphism
* Flexible system design
* Easier extension

---

### Centralized Object Creation

`ActionFactory` handles all object creation.

Benefits:

* Cleaner code
* Less duplication
* Easier maintenance

---

### Loose Coupling

Classes like:

* `BackendSystem`
* `AdminPanel`

do NOT know how actions are created.

They only:

* Request an action
* Use the action

This reduces dependency between system components.

---

### Scalability

Adding a new action later becomes easier.

Example:

* `RefundAction`
* `LoginAction`
* `NotificationAction`

Only the factory and new class need updates.

---

## 📏 Multiplicity & Relationships

### Relationships

* `PaymentAction`, `OrderAction`, `SupportAction`
  → Realization with `Action`

* `ActionFactory`
  → Dependency relationship with action classes

* `BackendSystem` and `AdminPanel`
  → Dependency relationship with `ActionFactory`

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
