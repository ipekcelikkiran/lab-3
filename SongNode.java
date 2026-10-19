/**
 * SongNode.java
 *
 * Represents a song of a playlist.
 *
 * Your Name:        İpek Çelikkıran
 * Your Student ID:  250444020
 * Your Date:        19.10.2026
 */

public class SongNode {

    String title;

    SongNode prev;
    SongNode next;

    public SongNode(String title) {
        this.title = title;
        this.prev = null;
        this.next = null;
    }
}
