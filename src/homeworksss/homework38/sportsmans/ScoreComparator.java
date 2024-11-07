package homeworksss.homework38.sportsmans;

import java.util.Comparator;

public class ScoreComparator implements Comparator<Sportsman> {
    @Override
    public int compare(Sportsman s1, Sportsman s2) {
        return Integer.compare(s1.getScore(), s2.getScore()); // Сортировка по рейтингу (score)
    }
}