# Dragon Killer Game

Welcome to the Dragon Killer game This Java-based application is designed to engage players in a unique challenge where their names play a pivotal role. The game generates a series of odd numbers based on the player's full name and then tests the player's ability to guess one of these numbers correctly. 

## How It Works

1. **Name Input**: Players begin by entering their full name. This name is processed to remove any spaces, transforming it into a sequence of characters without gaps.

2. **Number Generation**: The game then creates a list of odd numbers between 10 and 50, each representing a "dragon." These numbers are derived from the characters in the player's name, with each character potentially corresponding to a different dragon.

3. **Guessing Phase**: Players are prompted to guess an odd number between 10 and 50. If the guessed number matches one of the dragons in the list, it is marked as "killed" (represented by '0').

4. **Results Display**: After guessing, the game reveals the results, showing which dragons were successfully killed.

## Key Features

- **Interactive User Experience**: Utilizes `JOptionPane` for dynamic interaction, allowing for real-time feedback and prompts.
- **Dynamic Number Generation**: Numbers are generated based on the player's name, adding a personal touch to the game.
- **Error Handling**: Includes robust error handling to ensure valid inputs and guide players through the game smoothly.

## Getting Started

To play the Dragon Killer game, you'll need:

- Java Development Kit (JDK) installed on your system.
- A basic understanding of Java programming.

Simply clone the repository, open the project in your favorite IDE, and run the `DragonKiller` class. Follow the on-screen instructions to participate in the game!

## Contributing

Contributions to enhance the game, fix bugs, or add new features are welcome. Feel free to fork the repository, make your changes, and submit a pull request for review.

## Author

**Tertius Denis Liebenberg**  

For any questions or feedback, please contact [tertiusliebenberg7@gmail.com].