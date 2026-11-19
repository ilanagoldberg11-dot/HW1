public class Assignment01Q01 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String character = args[i];
            if (character.length() > 0) {
                char firstChar = character.charAt(0);
                if (firstChar % 5 == 0) {
                    System.out.println(firstChar);
                }
            }
        }
    }
}
