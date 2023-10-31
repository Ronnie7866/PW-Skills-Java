public class MethodOverloadingDemo {

        // Method with no parameters
        public void printMessage() {
            System.out.println("No parameters provided");
        }

        // Method with an integer parameter
        public void printMessage(int num) {
            System.out.println("Integer parameter: " + num);
        }

        // Method with two string parameters
        public void printMessage(String str1, String str2) {
            System.out.println("String parameters: " + str1 + " and " + str2);
        }

        public static void main(String[] args) {
            MethodOverloadingDemo demo = new MethodOverloadingDemo();

            // Call the overloaded methods
            demo.printMessage();
            demo.printMessage(42);
            demo.printMessage("Hello", "World");
        }
    }
