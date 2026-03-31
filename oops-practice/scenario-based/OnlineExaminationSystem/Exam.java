package scenario_based.OnlineExaminationSystem;

import java.util.*;

public class Exam {
	
	private String examName;
	private List<Question> question=new ArrayList<>();
	private long endTime;
	
	
	Exam(String examName,long endtime){
		this.examName=examName;
		 this.endTime = System.currentTimeMillis() + (endtime * 1000);
	}
	
	void addQuestion(Question q)
    {
        question.add(q);
    }
	
	int submitExam(List<String> ans)throws ExamTimeExpiredException{
		
	  if(System.currentTimeMillis()> endTime) {
		  
		  throw new ExamTimeExpiredException("Exam expired time over");
		  
	  }
	
		  
		  int score=0;
		  
		  
		  for(int i=0;i<question.size();i++)
		  {
			 score+=question.get(i).checkAnswer(ans.get(i));
			  
	
		  }
		  return score;
	 	
	}

	

}
