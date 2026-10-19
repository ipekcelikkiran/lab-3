/**
 * Represents the doubly linked list for the music playlist.
 *
 * Your Name:        İpek Çelikkıran
 * Your Student ID:  250444020
 * Your Date:        19.10.2026
 */

public class MusicPlaylist {

    private SongNode head;
    private SongNode tail;
    private SongNode current;

    public MusicPlaylist() {
        head = null;
        tail = null;
        current = null;

    }

    public void addSong(String title) {

        SongNode newNode = new SongNode(title);
        if (head == null) {
            head = newNode;
            tail = newNode;
            current = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }


    public void removeSong(String title) {

        SongNode temp = head;
        while (temp != null && !temp.title.equals(title)) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("The song isn't in the playlist");
            return;
        }
        if (temp == current) {
            if (temp.next != null) {
                current = temp.next;
            } else {
                current = temp.prev;
            }
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        } else {
            head = temp.next;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        } else {
            tail = temp.prev;
        }
        if (head != null) {
            head.prev = null;
        }
        if (tail != null) {
            tail.next = null;
        }
        temp.prev = null;
        temp.next = null;
        System.out.println("Removed: " + title);
    }


    public void nextSong() {

        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Playing: " + current.title);
        } else {
            System.out.println("Already at the last song of the playlist.");
        }
    }


    public void previousSong() {

        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Playing: " + current.title);
        } else {
            System.out.println("Already at the first song of the playlist.");
        }
    }


    public void displayCurrentSong() {

        if (current != null) {
            System.out.println("Current Song: " + current.title);
        } else {
            System.out.println("The playlist is empty.");
        }
    }


    public void displayPlaylist() {

        SongNode temp = head;
        while (temp != null) {
            System.out.print(temp.title + " <-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
