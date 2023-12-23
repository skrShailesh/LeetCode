import java.util.HashSet;
import java.util.Set;

public class PathCrossing_1496 {
    public static void main(String[] args) {
        String path = "NES";
        System.out.println(isPathCrossing(path)); // Output should be false

        path = "NESWW";
        System.out.println(isPathCrossing(path)); // Output should be true
    }

    public static boolean isPathCrossing(String path) {
        // Use a HashSet to store visited coordinates as strings
        Set<String> set = new HashSet<>();
        int x = 0; // Initial x-coordinate
        int y = 0; // Initial y-coordinate
        set.add(0 + "," + 0); // Add the initial coordinates to the set as a string

        for (char c : path.toCharArray()) {
            // Update coordinates based on the direction
            if (c == 'N') {
                y++;
            } else if (c == 'S') {
                y--;
            } else if (c == 'E') {
                x++;
            } else if (c == 'W') {
                x--;
            }

            // Convert current coordinates to a string representation
            String coo = x + "," + y;

            // Check if the current coordinates have been visited before
            if (set.contains(coo)) {
                return true; // Path is crossing
            }

            // Add the current coordinates to the set as a string
            set.add(coo);
        }

        return false; // Path is not crossing
    }
}

/*

import java.util.HashSet;
import java.util.Set;

public class PathCrossing_1496 {
    public static void main(String[] args) {
        String path = "NES";
        System.out.println(isPathCrossing(path)); // Output should be false

        path = "NESWW";
        System.out.println(isPathCrossing(path)); // Output should be true
    }

    public static boolean isPathCrossing(String path) {
        // Use a HashSet to store visited coordinates
        Set<Integer> visited = new HashSet<>();
        int x = 0; // Initial x-coordinate
        int y = 0; // Initial y-coordinate
        int hash = 0; // Single integer to represent coordinates

        visited.add(hash); // Add the initial coordinates to the set

        for (char c : path.toCharArray()) {
            // Update coordinates based on the direction
            switch (c) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
            }

            // Calculate a hash value to represent the current coordinates
            // Assuming coordinate values are within [-10000, 10000]
            hash = x * 20001 + y;

            // Check if the current coordinates have been visited before
            if (visited.contains(hash)) {
                return true; // Path is crossing
            }

            // Add the current coordinates to the set
            visited.add(hash);
        }

        return false; // Path is not crossing
    }
}


 */