package scenario_based.OnlineExaminationSystem;

public class Objective  implements  EvaluationStrategy {

	@Override
	public int evaluate(String correctAnswer, String submitAnswer) {
		// TODO Auto-generated method stub
		
		if(correctAnswer.equalsIgnoreCase(submitAnswer)) {
			return 1;
		}
		
		return 0;
	}

}
