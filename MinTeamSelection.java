import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MinTeamSelection {
    public static List<Integer> minTeam(String req, String[] cands) {
        Set<Character> need = new HashSet<>();
        for (char ch : req.toCharArray()) need.add(ch);
        List<Set<Character>> candSkills = new ArrayList<>();
        for (String s : cands) {
            Set<Character> set = new HashSet<>();
            for (char ch : s.toCharArray()) set.add(ch);
            candSkills.add(set);
        }
        Set<Character> left = new HashSet<>(need);
        List<Integer> res = new ArrayList<>();
        while (!left.isEmpty()) {
            int best = -1, max = 0;
            for (int i = 0; i < candSkills.size(); i++) {
                Set<Character> inter = new HashSet<>(left);
                inter.retainAll(candSkills.get(i));
                if (inter.size() > max) {
                    max = inter.size();
                    best = i;
                }
            }
            if (best == -1) break;
            res.add(best);
            left.removeAll(candSkills.get(best));
        }
        if (!left.isEmpty()) return Collections.emptyList();
        Collections.sort(res);
        return res;
    }
    public static void main(String[] args) {
        String req = "abc";
        String[] cands = {"a", "bc", "c"};
        List<Integer> team = minTeam(req, cands);
        if (team.isEmpty()) System.out.println("No sufficient candidates");
        else System.out.println(team.toString().replaceAll("[\\[\\] ]", ""));
    
        
    }
    
}
