package sentences;

public class SentenceTransformer {
    public String shortenSentence(String sentence){
        StringBuilder sb = new StringBuilder();

        String[] words = sentence.split(" ");


        if (sentence.charAt(0) != sentence.toUpperCase().charAt(0)){
            throw new IllegalArgumentException("Must start with capital letter!");
        }
        if (!(sentence.endsWith("!") || sentence.endsWith("?") || sentence.endsWith("."))){
            throw new IllegalArgumentException("Must end with . ! or ?");
        }
        if (words.length >= 5){
            sb.append(words[0])
                    .append(" ... ")
                    .append(words[words.length - 1]);
        }else{
            sb.append(sentence);
        }
        return sb.toString();
    }
}
