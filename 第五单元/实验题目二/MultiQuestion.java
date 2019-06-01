import java.util.Arrays;

public class MultiQuestion extends Question{
    private char[] answers;

    public MultiQuestion(){}
    public MultiQuestion(String text, String[] options, char[] answers){
        super(text, options);
        this.answers = answers;
    }

    public boolean check(char[] answers){
        boolean res = false;
        int search_index = -1;
        if(answers.length != this.answers.length){
            res = false;
        } else {
            for(int i=0;i<answers.length;i++){
                answers[i] = Character.toUpperCase(answers[i]);
                search_index = Arrays.binarySearch(this.answers, answers[i]);
                if(search_index == -1){
                    break;
                }
                res = true;
            }
        }
        return res;
    }
}