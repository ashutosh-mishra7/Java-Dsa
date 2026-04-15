public class sum {

    public static void main(String[] args) {

        int[] marks = { 57, 78, 84, 55 };
        String[] subjects = { "Maths", "Physics", "Hindi", "English" };

        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
            sum = sum + marks[i];
        }

        System.out.println("Total Marks: " + sum);
    }
}
