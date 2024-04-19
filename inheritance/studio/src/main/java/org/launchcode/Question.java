import java.util.ArrayList;

public abstract class Question {
    private String questionPrompt;
    private String answer;

    public void setQuestionPrompt(String questionPrompt) {
        this.questionPrompt = questionPrompt;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public void displayQuestion() {
        System.out.println(questionPrompt);
    }

    public abstract void displayAnswers();
}
