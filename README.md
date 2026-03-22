# 🏭 Design Patterns Lab — Lecture 2: Factory Pattern

![Topic](https://img.shields.io/badge/Topic-Factory%20Pattern-blue)
![Week](https://img.shields.io/badge/Week-2-green)
![Language](https://img.shields.io/badge/Language-Java-orange)
![Focus](https://img.shields.io/badge/Focus-Creational%20Patterns-purple)

---

## 🎥 Lecture Video

This repository accompanies the lecture video explaining the Factory Pattern, including real-world examples, design reasoning, and activities.

▶️ Watch on YouTube: [Lecture Video](#)

---

## 📌 Overview

In previous lectures, we focused on **understanding and modeling systems** using UML class diagrams and relationships. Now, we take the next step: **designing systems in a scalable and maintainable way**.  

The **Factory Pattern** is a **creational design pattern** that helps us:

- Centralize object creation logic
- Reduce code duplication
- Decouple classes from concrete implementations
- Improve scalability for growing systems

Rather than memorizing patterns, students learn to **recognize recurring design problems** and apply the Factory Pattern as a solution.

---

## 🧠 Learning Goals

By the end of this lecture, students will be able to:

1. Identify when repeated `if-else` statements signal a design problem.
2. Understand the risks of tight coupling and code duplication in object creation.
3. Apply the Factory Pattern to centralize object instantiation.
4. Connect Factory Pattern usage to UML concepts:
   - **Realization**: interface vs. concrete class
   - **Dependency**: client classes depending on a factory
   - **Encapsulation**: hiding creation logic
5. Think critically about system design rather than just coding.

---

## ⚠️ Why Factory Pattern Matters

### Common Problems in Real Systems

- Multiple classes creating similar objects independently
- Repeated conditional logic (`if-else`) scattered across the code
- Tight coupling to concrete classes
- Hard-to-maintain code as new types are added
- Inconsistent behavior when updates are made in some places but not others

### Benefits of Using Factory Pattern

- **Centralization**: Object creation logic exists in a single, dedicated place  
- **No Duplication**: Avoid repeating logic across multiple classes  
- **Better Maintainability**: Updates are made in one place only  
- **Clear Responsibilities**: Classes focus on their main task, not creating objects  
- **Scalability**: Adding new types requires minimal changes  

> **Key Insight:** Good design is not about removing complexity—it’s about placing it in the right place.

---

## 🧩 Key Concepts

1. **Product** – The common interface or abstract class shared by all objects created by the factory.  
2. **Concrete Products** – Implementations of the product interface.  
3. **Factory** – A dedicated class responsible for creating objects based on input or conditions.  
4. **Client** – Uses the factory instead of directly instantiating objects.

---

## 📚 Examples

Examples are provided in the [`/examples`](/example) folder and illustrate:

- **Without Factory:** Traditional object creation using multiple `if-else` statements.  
- **Basic Factory:** Centralized creation logic in a single class.  
- **Improved Factory:** Polymorphism-based factories for flexible extension.  

Each example includes:

- UML diagrams highlighting the structure
- Explanation of dependencies and relationships
- Step-by-step reasoning behind design decisions

---

## 🧪 Activities

### 1️⃣ School System Factory

**Scenario:**  
A school system where multiple classes (School, Teacher, SchoolEvent) need to create different types of students.  

**Tasks:**

- Identify repeated object creation logic
- Design a `StudentFactory` class
- Refactor the system to use the Factory Pattern

---

### 2️⃣ Advanced Backend System

**Scenario:**  
A growing system where multiple modules handle different operations:

- Payment processing (cash, credit card, PayPal)  
- Notifications (email, SMS, push)  
- File handling (PDF, image, video)

**Tasks:**

- Analyze the system for repeated `if-else` logic
- Centralize object creation using a Factory
- Ensure scalability, maintainability, and flexibility
- Focus on design, not syntax

---

## 🚀 How to Use This Repository

1. Fork the repository  
2. Clone it locally  
3. Explore [`/examples`](/example) for reference implementations  
4. Complete activities inside [`/activities`](/activities)  
5. Submit your solutions via Pull Request for review

---

## 💡 Tips for Students

- Identify **design problems**, not just code problems  
- Ask: *“Is object creation repeated? Should it be centralized?”*  
- Think in terms of **responsibility, abstraction, and maintainability**  
- UML diagrams are not just drawings—they reflect **design decisions**

---

## 📎 Final Note

The Factory Pattern is a **mindset shift**, not just a class. Mastering it enables you to:

- Control object creation  
- Organize your system for future growth  
- Avoid unnecessary complexity and duplication  

From now on, whenever you see:

```java
if (...) new Something()
```

Pause and ask:

> “Is this a design problem? Should I use a Factory?”

That question marks the transition from **programmer** to **software engineer**.
