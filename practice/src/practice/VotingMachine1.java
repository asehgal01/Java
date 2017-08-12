package practice;

public class VotingMachine1 {


		private int democratVote;
		private int republicanVote;


		public VotingMachine1()

		{
	
			democratVote = 0;
			republicanVote = 0;
		}
		
		public void voteDemocrat(){
			democratVote++;
		}
		public void voteRepublican(){
			republicanVote++;
		}
		public void clearMachine(){
			democratVote = 0;
			republicanVote = 0;
		}
		public int getTotalRep(){
			return republicanVote;
		}
		public int getTotalDem(){
			return democratVote;
		}
		


	}
