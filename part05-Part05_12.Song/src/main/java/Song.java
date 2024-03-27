
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }


    public boolean equals(Object obj){

        if (obj instanceof Song) {
            return this.artist.equals(((Song) obj).artist)
                    && this.name.equals(((Song) obj).name)
                    && this.durationInSeconds == (((Song) obj).durationInSeconds);
        }

            return false;


    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}

