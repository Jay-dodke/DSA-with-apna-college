# 📅 Day 2 — Java Basics & Fundamental Concepts  
**Date:** 11 January 2026  
**Topic:** Output, Variables, Memory, Data Types & Input Handling  
**Course:** Apna College (Shraddha Khapra)

---

## 📚 Overview
Today’s session introduced the foundational building blocks of Java —  
from printing your first output to understanding how data lives inside memory.

---

## 🎯 Key Takeaways
- Difference between `print` and `println`
- What variables are and how they store values
- Types of data Java supports
- How memory allocation works at runtime
- Using the `Scanner` class for user input
- Hands-on exercises: Sum, Product & Area calculator
- Understanding Type Conversion & Type Promotion
- Real execution flow: JDK → JRE → JVM

---

## 🖨 Output in Java
- `System.out.print()` → prints on same line  
- `System.out.println()` → prints with a new line  
- Simple star pattern printing to build familiarity

---

## 🔤 Variables, Identifiers & Literals
A **variable** represents a named memory location.
```java
int number = 10;
```
- `number` → Identifier  
- `10` → Literal  
- `int` → Data Type

Identifiers must:
✔ Begin with letter or `_`  
✔ Not use keywords (`int`, `class`, `public`, etc.)  
✔ Be meaningful for readability

---

## 🧩 Data Types in Java

### 🔹 Primitive Types
| Type | Size | Notes |
|------|------|-------|
| byte | 1 B | -128 to 127 |
| short | 2 B | Small integers |
| char | 2 B | Stores a single character |
| boolean | 1 B | true / false |
| int | 4 B | Default integer |
| long | 8 B | Larger integers (`10000000000L`) |
| float | 4 B | Decimal + `f` suffix |
| double | 8 B | Default decimal |

### 🔸 Non-Primitive Types
- `String`
- `Array`
- `Class`
- `Object`
- `Interface`

These grow dynamically and are stored differently in memory.

---

## 🧠 Memory Representation
Each variable takes a dedicated slot in RAM.

Example:
```
int a = 10;
int b = 5;
int sum = a + b;
```
Memory stores:
```
a → 10
b → 5
sum → 15
```

---

## ⌨️ Taking Input — Scanner Class
```java
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println(a + b);
```

### Problems Solved
- ✔ Sum of two integers  
- ✔ Product of two integers  
- ✔ Area of a circle using `πr²`

---

## 🔁 Type Conversion (Widening Conversion)
Java automatically converts when:
1. Types are compatible  
2. Destination type size > Source type size

Order:
```
byte → short → int → long → float → double
```
No data loss occurs.

---

## ⬆️ Type Promotion in Expressions
- `byte`, `short`, `char` → promoted to `int`
- If any operand is `long`, `float`, or `double`
  → entire expression becomes that type

Example:
```java
byte a = 5;
byte b = 10;
int result = a * b;  // NOT byte
```

---

## ⚙️ How Java Code Runs Internally
```
JDK = JRE + Compiler + Developer Tools
JRE = JVM + Standard Libraries
JVM = Executes compiled bytecode (.class files)
```
You write `.java` → compiler generates `.class` → JVM runs it 🔥

---

## 📁 Assets
All reference screenshots stored in:  
`/screenshots/day2/`

---

## 📝 Notes
Detailed notes summarizing every topic available in:  
`notes.txt`

---

## 💡 Daily Motivation
> “The harder you work, the luckier you get.”  
> “Tiny progress every single day compounds into mastery.”

---

## 🚀 Moving Forward
Next chapter: **Conditionals + Loops + Flow Control**  
Time to turn logic into real working programs 💻🔥
