import java.util.Objects;

public class Range {
    private int start;
    private int end;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    @Override
    public boolean equals(Object range) {
        if (this == range) return true;
        if (!(range instanceof Range)) return false;
        Range that = (Range) range;
        return this.start == that.start && this.end == that.end;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.start, this.end);
    }

    @Override
    public String toString() {
        return "Start: " + start + ", End: " + end;
    }
}
