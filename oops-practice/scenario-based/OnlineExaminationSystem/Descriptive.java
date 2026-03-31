package scenario_based.OnlineExaminationSystem;

public class Descriptive implements  EvaluationStrategy{

	@Override
	public int evaluate(String correctAnswer, String submitAnswer) {
		// TODO Auto-generated method stub
		
		if(submitAnswer.length()>50)
		{
			return 1;
		}
		
		return 0;
	}

}
