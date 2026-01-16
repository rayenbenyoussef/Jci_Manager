# Jci Management System (Android App)

An Android application developed in **Java** and **XML** to manage club activities, member registrations, and administrative tasks.

> ⚠️ **Project Status:** Under Development. The core logic and UI are currently being implemented based on the UML specifications.

## 🏗️ System Architecture

### Use Case Diagram
The following diagram defines the functional scope and user interactions for the mobile application.

<img src="./uml%20diagram/use_case.png" width="70%" />

### Logic Overview
* **Identity Management**: Visitors can use the **Create Account** feature to become Members.
* **Hierarchical Access**: Admins and Moderators inherit all standard Member permissions.
* **Security Layer**: All protected actions (like managing members or news) trigger an `«include»` relationship to the **LogIn** and **Authentication** modules.
* **Feature Extensions**: Event registration allows for optional flows like **Payment** (via external API) and **Attendance Confirmation**.

## Class Diagram
The following diagram defines the structural blueprint and data relationships governing the application.

<img src="./uml%20diagram/class.png" width="70%" />

### Logic Overview
* **Role-Based Access Control (RBAC):** The system utilizes a centralized `Member` class with a `Role` attribute to manage permissions.
* **Hierarchical Oversight:** Dedicated "manage" associations allow **Admins** and **Moderators** to perform CRUD operations on News, Events, and Member profiles.
* **Association Class Implementation:** The `Participation` class acts as a bridge between `Member` and `Event`, storing interaction-specific data such as `AttendanceStatus` and `EventRole`.
* **Unified Payment System:** A streamlined `Payment` class uses `PaymentType` and `ReferenceId` to handle both club registrations and event fees through a single data structure.
* **Data Accountability:** Every `News` item is linked to a `Member` via an `AuthorId`, ensuring all content is traceable to a specific creator.
* **Encapsulation:** All entities follow strict Object-Oriented principles, using private attributes and public methods to ensure data integrity.

## 🛠️ Tech Stack
* **Language:** Java (JDK 17+)
* **UI Layouts:** XML (Android Layouts)
* **Architecture:** Following MVC/MVVM patterns
* **Modeling:** UML 2.0 (Stored in `/uml diagram`)

## 📂 Project Structure
* `/app/src/main/java`: Java source files for Activities, Fragments, and Logic.
* `/app/src/main/res/layout`: XML files defining the app's user interface.
* `/uml diagram`: Documentation of the system's design and architecture.

## 🚀 Roadmap
- [x] Finalize Use Case Diagram.
- [ ] Complete Class Diagram (Attributes & Methods).
- [ ] Finalize sequence Diagram.
- [ ] Implement XML Layouts for Sign-Up/Log-In/Home screens.
- [ ] Develop Oracle/mySql integration for Authentication.

## ⚖️ License
This project is licensed under the Apache 2.0 License - see the [LICENSE](LICENSE) file for details.
