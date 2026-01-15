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
- [ ] Finalize Use Activity Diagram.
- [ ] Finalize Use sequence Diagram.
- [ ] Complete Class Diagram (Attributes & Methods).
- [ ] Implement XML Layouts for Sign-Up/Log-In/Home screens.
- [ ] Develop Oracle/mySql integration for Authentication.
