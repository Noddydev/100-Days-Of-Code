// An improved version of the "Decision Maker"
// program from chapter 9. This version uses an 
// enum, rather than interface variables, to 
// represent the answers.

import java.util.Random;

// An enumeration of the possible answers.
enum Answers {
	NO, YES, MAYBE, LATER, SOON, NEVER
}

class Question {
	Random rand = new Random();
	Answers ask() {
		int prob = (int) (100 * rand.nextDouble());

		if(prob < 15)
			return Answers.MAYBE;	// 15%
		else if(prob < 30)
			return Answers.NO;		// 15%
		else if(prob < 60)
			return Answers.YES;		// 30%
		else if(prob < 75)
			return Answers.LATER;	// 15%
		else if(prob < 98)
			return Answers.NEVER;	// 2%				
	}
}
class AskMe {
	static void answer(Answers result) {
		switch(result) {
			case NO:
				System.out.println("NO");
				break;
			case YES:
				System.out.println("YES");
				break;
			case MAYBE:
				System.out.println("MAYBE");
				break;
			case LATER:
				System.out.println("LATER");
				break;
			case SOON:
				System.out.println("SOON");
				break;
			case NEVER:
				System.out.println("NEVER");
				break;					
		}
	}

	public static void main(String args[]) {
		Question q = new Question();
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
	}
}