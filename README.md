# 📚 Book Management System

## 📖 Overview
The **Book Management System** is a simple Java console application designed to manage a collection of books using **File I/O operations** and **Serialization**. The system allows users to **create files, list files, create directories, rename directories, copy files between directories, delete files, and serialize/deserialize book objects**.

---

## 🛠️ Features

✅ Create sample book files in a directory.  
✅ List all files and directories inside a folder.  
✅ Create a new directory.  
✅ Rename an existing directory.  
✅ Copy all files from one directory to another.  
✅ Delete a specific file from a directory.  
✅ Serialize and deserialize a `Book` object to/from a file.

---

## 📂 Project Structure

```
src/
├── Book.java                  // Book class with Serializable implementation
├── DirectoryManager.java      // Manages directories and files
├── FileCreator.java           // Utility for creating sample book files
├── Main.java                   // Main application entry point
```

---

## 📄 How It Works

### 1. Creating Sample Files (Books)
- Sample books are stored in `myBooks` directory.
- Each book has a title, author, and content written into individual text files.

### 2. Listing Files and Directories
- Displays all files in a specified directory (e.g., `myBooks`).

### 3. Creating a Directory
- Creates a new directory (e.g., `myBooksBackup`).

### 4. Renaming a Directory
- Renames an existing directory (e.g., `myBooksBackup` to `BooksBackupDirectory`).

### 5. Copying Files
- Copies all files from one directory to another.

### 6. Deleting a File
- Deletes a specific book file (e.g., `1984.txt`).

### 7. Serialization & Deserialization
- Serializes a `Book` object into a file (`book.ser`).
- Deserializes a `Book` object from the file.

---

## 💻 Technologies Used

| Technology | Purpose |
|---|---|
| **Java** | Core programming language |
| **File I/O (java.io & java.nio.file)** | Reading/writing files and directories |
| **Serialization (java.io.Serializable)** | Saving and loading object state |

---

## 📋 Prerequisites
- Java Development Kit (JDK) 8 or higher
- IDE like IntelliJ IDEA, Eclipse, or VSCode (optional)

---

## 🚀 Running the Project
1. Clone the repository or copy the files to your project folder.
2. Ensure your project has the correct directory structure:
   - `src` folder contains your `.java` files.
   - Create a `myBooks` directory manually (or let the program create it for you).
3. Compile and run `Main.java`.
4. Uncomment the relevant code blocks in `Main.java` to test each feature.

---

## 🔗 Example Workflow
1. Create a `myBooks` folder and sample files using `FileCreator`.
2. List all books using `DirectoryManager.listFilesAndDirectories()`.
3. Create a backup folder using `DirectoryManager.createDirectory()`.
4. Copy files from `myBooks` to `BooksBackupDirectory`.
5. Serialize a `Book` object to `book.ser`.
6. Deserialize the `Book` object and display its details.

---

## 📚 Learning Outcomes
This project helps you practice:
- File and directory handling using **java.io** and **java.nio.file**.
- Object Serialization and Deserialization.
- Applying object-oriented programming principles.
- Error handling using `try-catch` and `try-with-resources`.

---

## 📦 Sample Directory Structure After Running
```
myBooks/
├── 1984.txt
├── The Great Gatsby.txt
├── To Kill a Mockingbird.txt

BooksBackupDirectory/
├── 1984.txt
├── The Great Gatsby.txt
├── To Kill a Mockingbird.txt

myBooks/
├── book.ser  // Serialized Book object
```

---

## 🧰 Future Enhancements
✅ Add a user-friendly menu interface.  
✅ Allow dynamic input of book details from the user.  
✅ Implement search functionality to find books by title or author.

---

## 📜 Author
Hlanganani Hlongwane  
Diploma in Software Development  
Book Management System - File I/O & Serialization Practice

https://github.com/Msawekho/Book_Management_System
