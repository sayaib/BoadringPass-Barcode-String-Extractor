public class BoardingPass {
    public static void main(String[] args) {
        String input = "M1SHEIKH/FAIZ QADI  EFBDMFD DELKHIPK 0273 171Y022A0084 100";

        String inputString = input.replace("\u00A0", " ");

        int firstSpaceIndex = inputString.indexOf("  ");

        if (firstSpaceIndex != -1) {
            String modifiedString = inputString.substring(0, firstSpaceIndex + 1) + ","
                    + inputString.substring(firstSpaceIndex + 1);

            String[] splitWithComma = modifiedString.split(",");

            String removeMultipleSpace = splitWithComma[1].replaceAll("\\s+", " ");

            String[] modifiedArray = removeMultipleSpace.split(" ");

            // source destination and airlines

            if (modifiedArray[2].length() >= 8) {
                String firstThreeLetters = modifiedArray[2].substring(0, 3);
                String secondThreeLetters = modifiedArray[2].substring(3, 6);
                String lastTwoLetters = modifiedArray[2].substring(6, 8);

                System.out.println("Source: " + firstThreeLetters);
                System.out.println("Destination: " + secondThreeLetters);
                System.out.println("Airlines: " + lastTwoLetters);
            } else {
                System.out.println("Input string does not have enough characters.");
            }

            // flight No

            System.out.println("Flight No: " + modifiedArray[3]);

            char fourthChar = modifiedArray[4].charAt(4);

            String seatNoFullString;

            if (fourthChar != '0') {
                seatNoFullString = modifiedArray[4].substring(0, 4) + '0' + modifiedArray[4].substring(4);

            } else {
                seatNoFullString = modifiedArray[4];

            }

            String seatNumber = seatNoFullString.substring(5, 8);

            // seat no
            System.out.println("Seat No: " + seatNumber);

        } else {
            System.out.println("No space found in the input string.");
        }

    }
}
