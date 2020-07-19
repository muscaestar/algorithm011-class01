import java.util.*;

/**
 * Created by muscaestar on 7/19/20
 *
 * @author muscaestar
 */
public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)) return 0;
        wordSet.remove(beginWord);
        int cnt = 1;

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        Set<String> visited = new HashSet<>();
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                String currWord = queue.poll();
                for (int j = 0; j < currWord.length(); j++) {
                    char currC = currWord.charAt(j);
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == currC) continue;
                        char[] temp = currWord.toCharArray();
                        temp[j] = c;
                        String newWord = String.valueOf(temp);
                        if (wordSet.contains(newWord) && !visited.contains(newWord)) {
                            if (newWord.equals(endWord)) return ++cnt;
                            queue.offer(newWord);
                            visited.add(newWord);
                        }
                    }
                }
            }
            cnt++;
        }
        return 0;


    }
}
