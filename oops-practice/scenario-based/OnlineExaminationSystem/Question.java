package scenario_based.OnlineExaminationSystem;

public class Question{
	
	private String question;
	private String correctAnswer; 
	private EvaluationStrategy eval;

	public Question(String question, String correctAnswer, EvaluationStrategy eval) {
	
		this.question = question;
		this.correctAnswer = correctAnswer;
		this.eval = eval;
	}

	
	 
	public int checkAnswer(String answer)
    {
        return eval.evaluate(answer, correctAnswer);
    }

    public String getQuestion()
    {
        return question;
    }
	
	

}
