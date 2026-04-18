# 📝 AppNotes

AppNotes is a simple CLI note management system built in Java.

## 🚀 Features

- Create notes
- List notes
- View note details
- Edit notes
- Delete notes
- File persistence (data saved locally)

## 🏗️ Architecture

The project follows a layered structure:

- `model` → Note entity
- `service` → Business logic
- `repository` → File persistence (save/load)
- `ui` → User interaction (CLI)

## 💾 Persistence

Notes are stored in a local `.txt` file using a custom serialization format:

title;text

The system loads all notes on startup and saves automatically after changes.

## 🛠️ Technologies

- Java
- File I/O (BufferedReader / BufferedWriter)
- ArrayList
- OOP principles

## 📌 Version

Current version: **v3.0**
- Added file persistence
- Implemented repository layer
- Automatic load on startup

---

## 🤖 AI Assistance Disclaimer

This project was developed by me as a learning exercise.

AI tools were used **only for conceptual guidance, explanations, and architectural direction**.  
All code was written, structured, and understood by me.

The goal of using AI was to enhance learning — not to copy solutions.

---

## 📈 Future Improvements

- Better exception handling
- Input validation improvements
- Migration to database
- REST API version (Spring Boot)
- Security improvements

---

Developed by Apolo.
