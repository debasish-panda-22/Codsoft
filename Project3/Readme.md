# Currency Converter

## Description
This is a simple **Currency Converter** program written in Java. It allows users to convert an amount from one currency to another using real-time exchange rates fetched from the **ExchangeRate-API**.

## Features
- User can select a **base currency** (e.g., USD, EUR).
- User can select a **target currency** (e.g., INR, GBP).
- Fetches real-time exchange rates without external JSON libraries.
- Converts the entered amount based on the latest exchange rate.
- Displays the converted amount to the user.

## How to Run
1. **Ensure you have Java installed** on your system (Java 8 or later).
2. **Compile the program** using the following command:
   ```sh
   javac CurrencyConverter.java
   ```
3. **Run the program** using:
   ```sh
   java CurrencyConverter
   ```
4. **Follow the prompts** to enter the base currency, target currency, and amount to convert.

## Example Usage
```
Enter base currency (e.g., USD, EUR): USD
Enter target currency (e.g., INR, GBP): INR
Enter amount to convert: 100
100.00 USD = 8300.50 INR
```
(Note: The exchange rate will vary based on real-time data.)

## Dependencies
- This program **does not require any external dependencies** or JSON libraries.
- It uses **Java's built-in HttpURLConnection** to fetch exchange rate data.

## Error Handling
- If an **invalid currency code** is entered, the program will display an error message.
- If there's an issue **fetching exchange rates**, the program will notify the user.

## License
This project is open-source and free to use.


