# 🏭 Design Patterns Lab — Lecture 2: Factory Pattern

![Topic](https://img.shields.io/badge/Topic-Factory%20Pattern-blue)
![Week](https://img.shields.io/badge/Week-2-green)
![Language](https://img.shields.io/badge/Language-Java-orange)
![Focus](https://img.shields.io/badge/Focus-Creational%20Patterns-purple)

---

## 🎥 Lecture Video

This repository accompanies the lecture video explaining the Factory Pattern through **real-world problems, design reasoning, and practical examples**.

▶️ Watch on YouTube: 

[Lecture Video](https://youtu.be/He2Rp9AZ4qE)

---

## 📌 Overview

In previous lectures, we focused on **understanding and modeling systems** using UML class diagrams and relationships.

In this lecture, we move to the next level:  
👉 **Designing systems that are scalable, maintainable, and flexible.**

The **Factory Pattern** is a **creational design pattern** that addresses a very common real-world problem:

> Repeated object creation logic across multiple parts of a system.

Instead of creating objects directly using `new` in many places, we introduce a **centralized factory** responsible for object creation.

---

## 🧠 Learning Goals

By the end of this lecture, students will be able to:

1. Recognize when repeated `if-else` logic indicates a design issue  
2. Understand the risks of:
   - tight coupling  
   - duplicated object creation logic  
3. Apply the Factory Pattern to centralize object creation  
4. Connect Factory Pattern to UML concepts:
   - **Realization** (interface implementation)  
   - **Dependency** (client → factory, factory → concrete classes)  
   - **Encapsulation** (hiding creation logic)  
5. Think in terms of **design decisions**, not just code implementation  

---

## ⚠️ Why Factory Pattern Matters

### Common Problems in Real Systems

- Multiple classes creating the same objects independently  
- Repeated `if-else` or `switch` logic across the system  
- Tight coupling to concrete classes (`new Dog()`, `new Cat()`, etc.)  
- Difficult maintenance when adding new types  
- Inconsistent updates across different parts of the system  

---

### ✅ Benefits of Using Factory Pattern

- **Centralization** → One place for object creation  
- **No Duplication** → Avoid repeating logic in multiple classes  
- **Maintainability** → Update logic in one place only  
- **Separation of Concerns** → Classes focus on their main responsibility  
- **Scalability** → Easy to extend with new types  

> 💡 **Key Insight:**  
> Good design is not about removing complexity —  it is about *placing it in the right place*.

---

## 🧩 Key Concepts

- **Product** → Common interface (e.g., `Animal`)  
- **Concrete Products** → Implementations (`Dog`, `Cat`, `Cow`)  
- **Factory** → Class responsible for creating objects (`AnimalFactory`)  
- **Client** → Uses the factory (`Zoo`, `AnimalShow`)  

---

## 📚 Examples

Examples are provided in the [`/examples`](/examples) folder.

### 🔹 What You Will Find

#### 1. Naïve Solution (Before Factory)
- Object creation using `if-else` inside multiple classes  
- Demonstrates:
  - duplication  
  - tight coupling  
  - poor scalability  

#### 2. Factory Pattern Solution
- Centralized creation logic in `AnimalFactory`  
- Multiple classes (`Zoo`, `AnimalShow`) reuse the same factory  
- Demonstrates:
  - clean design  
  - reduced duplication  
  - better maintainability  

---

### 🔹 Scenario Used

We simulate a **Zoo System** where:

- Different animal types exist (`Dog`, `Cat`, `Cow`)  
- Multiple parts of the system need to create animals  
- Without Factory → logic is duplicated  
- With Factory → creation is centralized  

---

## 🧪 Activities

### 1️⃣ School System Factory

**Scenario:**  
A school system where multiple classes (School, Teacher, SchoolEvent) need to create different types of students.

**Goal:**  
Design a better structure to avoid repeated object creation.

---

### 2️⃣ Advanced System Design

**Scenario:**  
A growing system that handles different types of user actions:

- Payments  
- Orders  
- Requests  

Each action requires:
- different objects  
- different processing logic  

Over time, the system suffers from:
- repeated object creation  
- inconsistent behavior  
- difficult maintenance  

**Goal:**  
Redesign the system to improve:
- scalability  
- maintainability  
- flexibility  

> ⚠️ Focus on **design thinking**, not only code.

---

## 💾 Solutions

📁 [`solutions/`](solutions/)

**Note:** All activity solutions are now available in the `/solutions` folder. Each solution includes:
- UML diagrams (README)
- Clean Java implementation
- Notes on relationships and key design points
- Optional bonus methods

> Students can use these as references after completing the activities to compare their implementations or understand design decisions.

---

## 🚀 How to Use This Repository

1. Fork the repository  
2. Clone it locally  
3. Explore [`/examples`](/examples) for reference implementations  
4. Complete tasks inside [`/activities`](/activities)  
5. Submit your solution via Pull Request  

---

## 💡 Tips for Students

- Look for **repeated patterns in code**  
- Ask:
  > “Am I creating objects in multiple places?”  
- Focus on:
  - responsibility  
  - abstraction  
  - maintainability  
- Use UML to **visualize your design before coding**  

---

## 📎 Final Note

The Factory Pattern is not just a class.

It is a **design mindset**.

It helps you:
- control object creation  
- reduce duplication  
- build systems that scale  

---

Whenever you see:

```java
if (...) new Something()
```

Stop and ask:

> “Is this a design problem?”

That question is the beginning of **real software engineering thinking.**
