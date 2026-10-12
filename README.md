# Java Centigrade Thermodynamic Phase Calculator (GUI)

![Java](https://img.shields.io/badge/Language-Java%20SE-ED8B00?logo=openjdk&logoColor=white)
![UI](https://img.shields.io/badge/UI-Java%20Swing%20%2F%20Nimbus-blue)
![Build](https://img.shields.io/badge/Build-Apache%20Ant%20%2F%20NetBeans-E05D44)
![License](https://img.shields.io/badge/License-MIT-green)

A graphical Java desktop application built with **Java Swing** and NetBeans GUI Builder that determines the thermodynamic physical state of matter for water (Solid / Ice, Liquid, Gas / Vapor) based on user-entered temperature values in degrees Celsius (°C).

---

## Technical Overview

- **Thermodynamic Phase Logic:**
  - $T \le 0^\circ\text{C}$: Solid state (Frozen / متجمدة)
  - $0^\circ\text{C} < T < 100^\circ\text{C}$: Liquid state (Liquid / سائلة)
  - $T \ge 100^\circ\text{C}$: Gaseous state (Steam / Vapor / غازية)
- **GUI Controls:** Implemented via `JFrame`, `JTextField`, `JLabel`, and `JButton` with action listener event dispatching and Nimbus look-and-feel styling.

---

## Project Structure

```
java-centigrade-phase-calculator/
├── src/
│   └── degree/
│       └── centigrade/
│           ├── DegreeCentigrade.java        # Main entry point class
│           ├── DegreeCentigradeGUI.java     # Swing JFrame implementation & logic
│           └── DegreeCentigradeGUI.form     # NetBeans visual form descriptor
├── build.xml                                # Apache Ant build script
└── nbproject/                               # NetBeans project configuration
```

---

## Compilation & Execution

```bash
# Compile
javac -d bin src/degree/centigrade/*.java

# Run GUI
java -cp bin degree.centigrade.DegreeCentigradeGUI
```

---

## Author & License

- **Developer:** Hossam Ahmed ([@HossamAhmedSoft](https://github.com/HossamAhmedSoft))
- **License:** MIT
