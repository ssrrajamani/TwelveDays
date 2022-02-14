import java.util.ArrayList;
class TwelveDays {
    ArrayList<String> songLyrics = new ArrayList<String>();
    public TwelveDays()
    {
    	songLyrics.add("On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.\n");
    	songLyrics.add("On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.\n");
    	songLyrics.add("On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
    	songLyrics.add("On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
    	songLyrics.add("On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
    	songLyrics.add("On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
    	songLyrics.add("On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
    	songLyrics.add("On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
    	songLyrics.add("On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
    	songLyrics.add("On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
    	songLyrics.add("On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
    	songLyrics.add("On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
    	
    }
    String verse(int verseNumber) {
        return songLyrics.get(verseNumber-1);
    }

    String verses(int startVerse, int endVerse) {
        String output="";
        for (int i=startVerse-1;i<endVerse;i++){
        	output+=songLyrics.get(i);
            if(i==endVerse-1)
                continue;
            else
                output+="\n";
        }
        return output;
    }
    
    String sing() {
    	String output="";
        for (int i=0;i<12;i++){
        	output+=songLyrics.get(i);
            if(i==11)
                continue;
            else
                output+="\n";
        }
        return output;
    }
}
