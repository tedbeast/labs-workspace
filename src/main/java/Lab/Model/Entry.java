package Lab.Model;

import java.util.Objects;

/**
 * Just a regular old model class.
 * No need to change anything here.
 */
public class Entry {
    private String time;
    private String text;
    public Entry(String time, String text){
        this.time = time;
        this.text = text;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "time='" + time + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entry entry = (Entry) o;
        return Objects.equals(time, entry.time) && Objects.equals(text, entry.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, text);
    }
}
