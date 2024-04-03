public class Main {
    public static void main(String[] args) {
        String text = "type here to search";
        printOddPositionCharacters(text);
    }

    public static void printOddPositionCharacters(String str) {
        // Removing white spaces from the string
        String trimmedStr = str.replaceAll("\\s", "");
        
        // Printing characters at odd positions
        for (int i = 0; i < trimmedStr.length(); i++) {
            if (i % 2 != 0) {
                System.out.print(trimmedStr.charAt(i) + " ");
            }
        }
    }
}
