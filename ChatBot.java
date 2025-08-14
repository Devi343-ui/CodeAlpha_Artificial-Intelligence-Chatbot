import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChatBot {

    private static Map<String, String> responses = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Predefined rule-based responses
        responses.put("hi", "Hello! How can I help you today?");
        responses.put("hello", "Hi there! What can I do for you?");
        responses.put("how are you", "I'm just a program, but I'm doing great!");
        responses.put("bye", "Goodbye! Have a great day!");
        responses.put("what is your name", "I'm your friendly Java Chatbot!");
        responses.put("help", "I can answer greetings, tell my name, and say goodbye.");

        System.out.println("Java ChatBot: Hello! Type 'bye' to exit.");
        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().toLowerCase().trim();

            if (userInput.equals("bye")) {
                System.out.println("ChatBot: " + responses.get("bye"));
                break;
            }

            String reply = responses.getOrDefault(userInput, 
                "I'm not sure about that. Can you try asking something else?");
            System.out.println("ChatBot: " + reply);
        }

        scanner.close();
    }
}
