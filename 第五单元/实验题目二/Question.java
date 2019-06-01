public class Question{
    private String text;
    private String[] Options;

    public Question(){}
    public Question(String text, String[] options){
        this.text = text;
        this.Options = options;
    }

    public boolean check(char[] answers){return true;}
    public void print(){
        System.out.println(text);
        for(int i=0;i<this.Options.length;i++){
            System.out.print(Options[i] + "  \t");
        }
        System.out.print("\nÇëÑ¡Ôñ£º");
    }
}