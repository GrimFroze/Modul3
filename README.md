# Modul3
# Number Guessing Game (Java)

A simple **console-based number guessing game** written in Java.  
The player selects a difficulty level (Easy, Medium, or Hard) and tries to guess the random number within a limited number of attempts.

---

## Project Overview

This project demonstrates:
- The use of **interfaces** (`StartInfo`)
- Basic **object-oriented design**
- Random number generation and user input handling
- The use of **JavaDoc documentation** for classes and methods

---

## Project Structure

| File | Description |
|------|--------------|
| `MainApp.java` | Entry point of the program. Initializes the game and handles setup. |
| `StartGame.java` | Contains the main game logic, difficulty settings, and guessing mechanism. |
| `StartInfo.java` | Interface that defines the `displayInfo()` method used to display game instructions. |

---

## ⚙️ How the Program Works

1. The program starts with **`MainApp`**, which displays the introduction and difficulty options.
2. The user chooses a difficulty level:
   - **Easy** → Range 1–50, 10 tries  
   - **Medium** → Range 1–100, 8 tries  
   - **Hard** → Range 1–200, 6 tries
3. The program generates a **random number** within the chosen range.
4. The player makes guesses — the program gives hints (“Too high!” / “Too low!”).
5. The game ends when the player **guesses correctly** or **runs out of tries**.

---

## Example Gameplay

Here’s what a full gameplay session might look like:

  ```sh
          === Welcome to the Number Guessing Game ===
      Choose difficulty: 1 - Easy, 2 - Medium, 3 - Hard
      Choose: 2
      
      Medium difficulty selected!
      I'm thinking of a number between 1 and 100.
      You have 8 tries to guess it.
      
      Guess: 45
      Too low!
      
      Guess: 75
      Too high!
      
      Guess: 60
      Too low!
      
      Guess: 68
      Too high!
      
      Guess: 64
      🎉 Correct! You guessed the number in 5 tries!
      
      --- GAME OVER ---
      Thank you for playing!
```


If the player fails to guess in time:

```sh
  You lost! The correct number was 72.
  Better luck next time!
```

## YAML
---

## How to Compile and Run

Make sure you have **Java (JDK)** installed on your system.

### Step 1 — Compile the code
```sh
javac MainApp.java StartGame.java StartInfo.java
```

Step 2 — Run the program
```sh
java MainApp
```
