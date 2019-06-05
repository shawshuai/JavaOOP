public class SingleQuestion extends Question{
    private char answer;

    public SingleQuestion(){}
    public SingleQuestion(String text, String[] options, char answer){
        super(text, options);
        this.answer = answer;
    }

    public boolean check(char[] answers){
        boolean res = false;
        for(int i=0;i<answers.length;i++){
            answers[i] = Character.toUpperCase(answers[i]);
        }
        if(answers.length != 1){
            res = false;
        } else if(answers[0] == this.answer){
            res = true;
        }
        return res;
    }
}