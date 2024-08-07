package LeetCodeOnCollections;

import java.util.*;

public class PermutationDifferenceBetweenTwoStrings {

        public int findPermutationDifference(String s, String t) {
            if (s.length() != t.length()) {
                throw new IllegalArgumentException("Strings must be of the same length and permutations of each other");
            }
            List<Integer> indicesS = new ArrayList<>();
            List<Integer> indicesT = new ArrayList<>();

            for (int i = 0; i < s.length(); i++) {
                indicesS.add(i);
            }
            for (int i = 0; i < t.length(); i++) {
                indicesT.add(i);
            }
            Collections.sort(indicesS, (i1, i2) -> Character.compare(s.charAt(i1), s.charAt(i2)));
            Collections.sort(indicesT, (i1, i2) -> Character.compare(t.charAt(i1), t.charAt(i2)));
            int ans = 0;
            for (int i = 0; i < indicesS.size(); i++) {
                ans += Math.abs(indicesS.get(i) - indicesT.get(i));
            }

            return ans;

        }

}
