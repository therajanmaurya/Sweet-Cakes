import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Emorticons {

    public static void main(String[] args) {
       System.out.println(Arrays.toString(parseEmoticons("How is It going? :) You are almost :-) !").toArray()));
    }

    public static List<InlinedEmoticon> parseEmoticons(String text) {
        List<InlinedEmoticon> inlinedEmoticons = new ArrayList<>();
        int position;
        int i = 0;
        System.out.println(inlinedEmoticons.toString());
        while (i < text.length()) {
            if (text.charAt(i) == ':') {
                position = i;
                i++;
                if (text.charAt(i) == ')') {
                    inlinedEmoticons.add(new InlinedEmoticon(1, position, 2));
                } else if (text.charAt(i) == '-') {
                    i++;
                    if (text.charAt(i) == ')') {
                        inlinedEmoticons.add(new InlinedEmoticon(1, position, 2));
                    } else {
                        inlinedEmoticons.add(new InlinedEmoticon(3, position, 3));
                    }
                } else if (text.charAt(i) == '/') {
                    inlinedEmoticons.add(new InlinedEmoticon(2, position, 2));
                } else if (text.charAt(i) == '(') {
                    inlinedEmoticons.add(new InlinedEmoticon(3, position, 2));
                }
            }
            i++;
        }
        return inlinedEmoticons;
    }

    public static class InlinedEmoticon {
        int emoticonId;
        int position;
        int length;

        public InlinedEmoticon(int emoticonId, int position, int length) {
            this.emoticonId = emoticonId;
            this.position = position;
            this.length = length;
        }

        @Override
        public String toString() {
            return emoticonId + "" + position + "" + length + "";
        }
    }

}
