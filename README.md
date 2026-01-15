# Club Management System

A comprehensive platform designed to manage club memberships, events, and news updates with a hierarchical role-based access system.

## 🏗️ System Architecture

### Use Case Diagram
This diagram represents the functional requirements of the system and the relationships between various actors and use cases.

![Use Case Diagram](./uml%20diagram/use_case.png)

> **Note:** If the image does not appear, ensure the file name in the `uml diagram` folder matches the path above exactly.

### Functional Logic
* **Actor Hierarchy**: The system uses inheritance where **Admin** and **Moderator** inherit capabilities from the **Member** actor.
* **Access Control**: All sensitive operations (Managing events, news, or members) `«include»` a **LogIn** requirement.
* **Security**: The **LogIn** process `«includes»` an **Authentication** use case to verify credentials before granting access.
* **Event Workflow**: Members can register for events, which can optionally `«extend»` into **Payment** via an external Payment System or **Attendance Confirmation**.

## 👥 Roles defined in the Diagram
| Role | Description |
| :--- | :--- |
| **Visiteur** | Can create an account and consult news/events. |
| **Member** | Can register for events and manage their personal profile. |
| **Moderator** | Can verify attendance and manage club news. |
| **Admin** | Has full authority to manage members and system events. |

## 📂 Repository Structure
* `/uml diagram`: Contains all UML design assets (Use Case, and future Class/Sequence diagrams).
* `/src`: [Placeholder for your source code]
