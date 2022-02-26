import java.util.ArrayList;

class TwelveDays {
    private final ArrayList<String> SONG_LYRICS = new ArrayList<>();
    private final ArrayList<String> DAYS = new ArrayList<>();
    private final String PREFIX = " of Christmas my true love gave to me:";

    public TwelveDays() {
        DAYS.add("first");
        DAYS.add("second");
        DAYS.add("third");
        DAYS.add("fourth");
        DAYS.add("fifth");
        DAYS.add("sixth");
        DAYS.add("seventh");
        DAYS.add("eighth");
        DAYS.add("ninth");
        DAYS.add("tenth");
        DAYS.add("eleventh");
        DAYS.add("twelfth");


        SONG_LYRICS.add(" a Partridge in a Pear Tree.\n");
        SONG_LYRICS.add(" two Turtle Doves,");
        SONG_LYRICS.add(" three French Hens,");
        SONG_LYRICS.add(" four Calling Birds,");
        SONG_LYRICS.add(" five Gold Rings,");
        SONG_LYRICS.add(" six Geese-a-Laying,");
        SONG_LYRICS.add(" seven Swans-a-Swimming,");
        SONG_LYRICS.add(" eight Maids-a-Milking,");
        SONG_LYRICS.add(" nine Ladies Dancing,");
        SONG_LYRICS.add(" ten Lords-a-Leaping,");
        SONG_LYRICS.add(" eleven Pipers Piping,");
        SONG_LYRICS.add(" twelve Drummers Drumming,");

    }

    protected String verse(int verseNumber) {
        StringBuilder output = new StringBuilder("On the " + DAYS.get(verseNumber - 1) + " day" + PREFIX);
        if (verseNumber == 1)
            output.append(SONG_LYRICS.get(0));
        else {
            for (int i = verseNumber; i > 0; i--) {
                if (i == 1)
                    output.append(" and");
                output.append(SONG_LYRICS.get(i - 1));
            }
        }
        return output.toString();
    }

    protected String verses(int startVerse, int endVerse) {
        StringBuilder output = new StringBuilder();
        for (int line = startVerse; line <= endVerse; line++) {
            String lyrics = getLyrics(line);
            if (line != endVerse)
                output.append(lyrics).append("\n");
            else
                output.append(lyrics);
        }
        return output.toString();
    }

    private String getLyrics(int line) {
        StringBuilder lyrics = new StringBuilder("On the " + DAYS.get(line - 1) + " day" + PREFIX);
        if (line == 1)
            lyrics.append(SONG_LYRICS.get(0));
        else {
            for (int j = line; j > 0; j--) {
                if (j == 1)
                    lyrics.append(" and");
                lyrics.append(SONG_LYRICS.get(j - 1));
            }
        }
        return lyrics.toString();
    }

    protected String sing() {
        StringBuilder output = new StringBuilder();
        for (int line = 1; line <= 12; line++) {
            String lyrics = getLyrics(line);
            if (line != 12)
                output.append(lyrics).append("\n");
            else
                output.append(lyrics);
        }
        return output.toString();
    }
}
