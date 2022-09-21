package com.bean;
	

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.jdbc.core.JdbcTemplate;
	import org.springframework.stereotype.Repository;
	

	@Repository
	public class FeedbackDao {
	

		@Autowired
		private JdbcTemplate template;
		
		public int addFedback(Feedback fb) {
			
			return template.update("insert into feedback (name,email,feedback) values (?,?,?)", 
					fb.getName(),fb.getEmail(),fb.getFeedback());
		}
}