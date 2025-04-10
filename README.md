
# FallingLetters

FallingLetters is a typing game developed in Java where letters descend from the top of the screen, and the player must type the corresponding letters to prevent them from reaching the bottom.

## Features

- **Dynamic Gameplay:** Letters fall from the top of the window at varying speeds, challenging the player's typing skills and reflexes.
- **Diverse Letter Types:** Encounter different types of letters, each with unique behaviors:
  - **Standard Letters:** Regular letters that fall at a constant speed.
  - **Fast Letters:** Letters that descend more quickly, requiring faster responses.
  - **Upside-Down Letters:** Letters that appear inverted, adding an extra layer of challenge.
- **Themed Categories:** Letters can be grouped into themes such as cities or onomatopoeic words, enhancing the learning experience.

## How to Play

1. **Launch the Game:** Run the `FallingLetters` Java application.
2. **Start Typing:** As letters fall from the top of the screen, type the corresponding key on your keyboard to eliminate them.
3. **Score Points:** Successfully typing a letter before it reaches the bottom increases your score.
4. **Avoid Mistakes:** Allowing letters to reach the bottom or typing incorrect keys may result in a loss of points or game over.

## Classes Overview

- **`FallingLetters`:** The main class that initializes and runs the game.
- **`Window`:** Manages the game window and rendering of graphics.
- **`Game`:** Contains the core game loop and logic for updating game state.
- **`Letter`:** Represents a generic letter in the game.
- **`FastLetter`:** A subclass of `Letter` that falls at a faster rate.
- **`UpsideDown`:** A subclass of `Letter` that appears inverted.
- **`Cities`:** Manages a collection of city names used as letter sequences.
- **`Onomatopoeia`:** Manages a collection of onomatopoeic words used as letter sequences.
- **`Cannon`:** Controls which letters get shot when a key is pressed.

## Requirements

- Java Development Kit (JDK) 8 or higher.

## Setup and Installation

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/bagel786/FallingLetters.git
