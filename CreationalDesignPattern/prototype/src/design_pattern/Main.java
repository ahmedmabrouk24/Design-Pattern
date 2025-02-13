package design_pattern;

public class Main {
    public static void main(String[] args) {
        // Original character
        Character originalCharacter = new Character("Warrior", 100, 50);
        System.out.println("Original Character: " + originalCharacter);

        // Copied character
        Character clonedCharacter = (Character) originalCharacter.clone();
        System.out.println("Cloned Character: " + clonedCharacter);

        // Modify copied character
        clonedCharacter = new Character("Mage", 80, 60);
        System.out.println("Modified Cloned Character: " + clonedCharacter);
    }
}
