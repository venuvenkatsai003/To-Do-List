# To-Do List

A simple full-stack To-Do List application built using **React** (frontend) and **Spring Boot** (backend).  
The React build folder is placed inside the Spring Boot project so both frontend and backend run together as a single deployable application.

## 📌 About

This project allows users to add, update, delete, and mark tasks as completed.  
The React app is built and placed inside the Spring Boot `static/` directory, allowing Spring Boot to serve the frontend automatically.

---

## 🚀 Tech Stack

### **Frontend**
- React (Create React App)
- JavaScript / JSX
- HTML, CSS
- tailWindCSS

### **Backend**
- Java
- Spring Boot
- Spring Web
- (Optional) Spring Data JPA + H2/MySQL (if you configure)

### **Build & Tools**
- Maven
- Node.js + npm
- React build served from Spring Boot `/static` folder

---

## 📂 Project Structure

```
To-Do-List/
├── frontend/                 # React source code
│   ├── src/
│   ├── public/
│   └── build/                # Generated build folder after npm run build
├── backend/                  # Spring Boot project
│   ├── src/main/java/
│   ├── src/main/resources/
│   │   └── static/           # React build files copied here
│   ├── pom.xml
│   └── application.properties
└── README.md
```

---

## 🛠️ Prerequisites

Make sure you have the following installed:

- **Java 11+**
- **Node.js + npm**
- **Maven 3+**
- **Git**

---

## 📥 Installation & Setup

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/venuvenkatsai003/To-Do-List.git
cd To-Do-List
```

---

## ⚛️ 2️⃣ Setup & Build the React Frontend

If your React frontend is inside a folder like `/frontend`:

```bash
cd frontend
npm install
npm run build
```

This will generate a `build/` folder.

---

## 📁 3️⃣ Move the React Build Into Spring Boot

Copy the **contents of the build folder** into:

```
backend/src/main/resources/static/
```

Example command (adjust paths if needed):

```bash
cp -r build/* ../backend/src/main/resources/static/
```

---

## 🔧 4️⃣ Run the Spring Boot Backend

Navigate to the backend folder:

```bash
cd ../backend
```

Run using Maven wrapper:

```bash
./mvnw spring-boot:run
```

Or with local Maven:

```bash
mvn spring-boot:run
```

---

## ▶️ 5️⃣ Access the Application

Open your browser:

```
http://localhost:8080/
```

Your React app (served by Spring Boot) will appear.

---

## 📘 Features

- Add tasks  
- Edit tasks  
- Delete tasks  
- Mark tasks as complete/incomplete  
- Fully integrated frontend + backend  
- Simple and fast UI  

---

## 👤 Contact

**Venu Venkatsai**  
GitHub: https://github.com/venuvenkatsai003

---

