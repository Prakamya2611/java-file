# Campus Course & Records Manager (CCRM)

## 📌 Project Overview
Campus Course & Records Manager (CCRM) is a **console-based Java SE application** that helps institutes manage students, courses, enrollments, grades, transcripts, and file utilities.  
This project demonstrates core Java concepts, OOP principles, exception handling, Streams API, NIO.2, Date/Time API, and design patterns.

---

## 🚀 How to Run
1. Install **Java JDK 17+**.
2. Clone the repository:
   ```bash
   git clone https://github.com/example/ccrm-java.git
   cd ccrm-java
   ```
3. Compile the project:
   ```bash
   javac -d bin src/**/*.java
   ```
4. Run the main class:
   ```bash
   java -cp bin edu.ccrm.cli.Main
   ```

---

## 📖 Evolution of Java (Short Timeline)
- **1995** – Java 1.0 released (Sun Microsystems).
- **2004** – Java 5 introduced Generics, Annotations.
- **2011** – Java 7 introduced NIO.2.
- **2014** – Java 8 introduced Lambdas, Streams API.
- **2017** – Java 9 introduced Modules (Project Jigsaw).
- **2021+** – Java 17 (LTS) with pattern matching, records, sealed classes.

---

## ☕ Java Editions: ME vs SE vs EE
| Feature | Java ME | Java SE | Java EE |
|---------|---------|---------|---------|
| Platform | Mobile/Embedded | Desktop/General-purpose | Enterprise/Web apps |
| Scope | Lightweight | Core Java libraries | Adds APIs for Servlets, EJB, JPA |
| Example Use | Smartcards, IoT | Standalone apps, utilities | Web servers, banking systems |

---

## 🔧 Java Architecture
- **JDK (Java Development Kit):** Tools + JRE for development.  
- **JRE (Java Runtime Environment):** JVM + libraries for running apps.  
- **JVM (Java Virtual Machine):** Executes Java bytecode on any OS.  

Flow: **Source Code → Compiler → Bytecode → JVM → OS Execution**

---

## 🖥️ Setup & Configuration (Windows)
1. Download JDK from [Oracle](https://www.oracle.com/java/technologies/javase-downloads.html).
2. Install and set `JAVA_HOME` in Environment Variables.
3. Verify installation:
   ```bash
   java -version
   javac -version
   ```
4. Install **Eclipse IDE** → Create New Java Project → Add packages (`edu.ccrm.*`).  
5. Run Main class from Eclipse.

---

## 📦 Suggested Package Structure
```
edu.ccrm
 ├─ cli/        # Menu, input loop
 ├─ domain/     # Student, Instructor, Course, Enrollment, Grade, Semester
 ├─ service/    # StudentService, CourseService, TranscriptService
 ├─ io/         # Import/Export, Backup
 ├─ util/       # Validators, Comparators, Recursion utils
 └─ config/     # AppConfig (Singleton), Builders
```

---

## ⚡ Features Implemented
- Student Management (Add, Update, Deactivate, Print Transcript).  
- Course Management (Add, Update, Search with Streams API).  
- Enrollment with business rules & GPA calculation.  
- File Operations (Import/Export CSV, Backups using NIO.2).  
- CLI with switch-case menus, loops, and recursion utilities.  
- Demonstrates OOP (Encapsulation, Inheritance, Abstraction, Polymorphism).  
- Design Patterns: **Singleton, Builder**.  
- Custom Exceptions: `DuplicateEnrollmentException`, `MaxCreditLimitExceededException`.  

---

## 🧪 Sample Demo Flow
1. Launch application → AppConfig (Singleton) loads config.  
2. CLI Menu → Manage Students, Courses, Enrollment, Grades.  
3. Perform enrollments, record marks, compute GPA.  
4. Print transcripts using `toString()` overrides.  
5. Import/Export data → Backup folder created with timestamp.  
6. Reports: GPA distribution using Streams API.  

---

## 📑 Mapping Table (Topics → Implementation)
| Concept | File/Class |
|---------|------------|
| Encapsulation | `Student.java` (private fields + getters/setters) |
| Inheritance | `Person.java` → `Student.java`, `Instructor.java` |
| Abstraction | `Person.java` (abstract) |
| Polymorphism | `TranscriptService.java` (interface + impls) |
| Singleton | `AppConfig.java` |
| Builder Pattern | `Course.Builder` |
| Custom Exceptions | `DuplicateEnrollmentException.java` |
| Streams API | `CourseService.java` (filter/search) |
| NIO.2 | `BackupService.java` |
| Recursion | `FileUtils.java` (directory size) |

---

## ⚠️ Errors vs Exceptions
- **Errors:** Serious issues (e.g., OutOfMemoryError) → Not recoverable.  
- **Exceptions:** Issues in code flow (e.g., FileNotFoundException) → Recoverable.  

---

## 📌 Notes on Assertions
Enable assertions while running:  
```bash
java -ea -cp bin edu.ccrm.cli.Main
```

---

## 📂 Project Deliverables
- ✅ Source Code  
- ✅ README.md (this file)  
- ✅ Screenshots folder (JDK installation, Eclipse setup, Program run, Backup)  
- ✅ Test-data folder (sample CSVs)  
- 🔗 [Optional Demo Video Link]  

---

## 🙏 Acknowledgements
- Oracle Java Documentation  
- Baeldung Java Tutorials  
- Official Eclipse Docs  

---


