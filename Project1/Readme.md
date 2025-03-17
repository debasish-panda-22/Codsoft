# Number Guessing Game

## Overview
The **Number Guessing Game** is a simple Java console application where the player tries to guess a randomly generated number between 1 and 100. The game provides feedback on whether the guess is too high or too low and limits the number of attempts. The player can play multiple rounds, and a score is maintained based on remaining attempts.

## Features
- Generates a random number between 1 and 100.
- User has **5 attempts** to guess the number.
- Provides hints if the guess is too high or too low.
- Allows multiple rounds of gameplay.
- Displays the total score at the end.

## How to Play
1. Run the program.
2. Enter a number between 1 and 100.
3. Receive feedback on whether the guess is correct, too high, or too low.
4. Repeat until the correct number is guessed or attempts run out.
5. Choose whether to play another round.
6. View your total score at the end.

## Installation & Running the Program
1. Ensure you have **Java JDK** installed.
2. Clone or download the project files.
3. Open a terminal or command prompt in the project folder.
4. Compile the program:
   ```sh
   javac NumberGuessingGame.java
   ```
5. Run the program:
   ```sh
   java NumberGuessingGame
   ```

## Example Output
```
I have chosen a number between 1 and 100. Can you guess it?
Enter your guess: 50
Too high! Try again.
Attempts left: 4
Enter your guess: 25
Too low! Try again.
Attempts left: 3
Enter your guess: 37
Congratulations! You guessed the correct number.
Do you want to play again? (yes/no):
```

## Contribution
Feel free to fork this repository and improve the game. You can add:
- Difficulty levels.
- Leaderboards.
- A GUI version.

## License
This project is open-source and free to use under the MIT License.

