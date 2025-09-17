//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//This method counts the No. of vowels in the input string
public class Main {
    public static int countAllVowels(String input){
        int count = 0;

        for (int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            switch(c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println(countAllVowels("Empty"));
    }
}