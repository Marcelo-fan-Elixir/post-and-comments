package entities.application_low_level;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private String title;
	private String content;
	private Integer likers;
	
	private List<Comment> comments = new ArrayList<>();

	public Post() {
		
	}
	
	public Post(Date moment, String title, String content, Integer likers) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likers = likers;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikers() {
		return likers;
	}

	public void setLikers(Integer likers) {
		this.likers = likers;
	}

	public List<Comment> getComments() {
		return comments;
	}
	
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likers);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments: \n");
		for(Comment c : comments) {
			sb.append(c.getText() + "\n");
		}
		
		return sb.toString();
	}
	
	
	
	

}
