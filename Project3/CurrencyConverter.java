import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class CurrencyConverter {
    private static final String API_URL = "https://api.exchangerate-api.com/v4/latest/";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter base currency (e.g., USD, EUR): ");
        String baseCurrency = scanner.next().toUpperCase();
        
        System.out.print("Enter target currency (e.g., INR, GBP): ");
        String targetCurrency = scanner.next().toUpperCase();
        
        System.out.print("Enter amount to convert: ");
        double amount = scanner.nextDouble();
        
        double exchangeRate = getExchangeRate(baseCurrency, targetCurrency);
        
        if (exchangeRate != -1) {
            double convertedAmount = amount * exchangeRate;
            System.out.printf("%.2f %s = %.2f %s\n", amount, baseCurrency, convertedAmount, targetCurrency);
        } else {
            System.out.println("Error fetching exchange rates. Please check currency codes and try again.");
        }
        
        scanner.close();
    }
    
    private static double getExchangeRate(String base, String target) {
        try {
            String urlString = API_URL + base;
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();
            
            // Extract exchange rate without using external libraries
            String jsonResponse = response.toString();
            String searchKey = "\"" + target + "\":"; 
            int startIndex = jsonResponse.indexOf(searchKey) + searchKey.length();
            int endIndex = jsonResponse.indexOf(",", startIndex);
            if (endIndex == -1) { 
                endIndex = jsonResponse.indexOf("}", startIndex);
            }
            
            return Double.parseDouble(jsonResponse.substring(startIndex, endIndex));
        } catch (Exception e) {
            return -1;
        }
    }
}