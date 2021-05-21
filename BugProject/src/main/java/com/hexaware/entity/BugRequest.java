package com.hexaware.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class BugRequest {
	private String emailAddress;
	private String owner;
	private String priority;
	private String status;
	private String ownerProject;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdDate;
	private Date completionDate;
	private String description;
	private boolean attachedfiles;
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOwnerProject() {
		return ownerProject;
	}
	public void setOwnerProject(String ownerProject) {
		this.ownerProject = ownerProject;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getCompletionDate() {
		return completionDate;
	}
	public void setCompletionDate(Date completionDate) {
		this.completionDate = completionDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isAttachedfiles() {
		return attachedfiles;
	}
	public void setAttachedfiles(boolean attachedfiles) {
		this.attachedfiles = attachedfiles;
	}
	@Override
	public String toString() {
		return "BugRequest [emailAddress=" + emailAddress + ", owner=" + owner + ", priority=" + priority + ", status="
				+ status + ", ownerProject=" + ownerProject + ", createdDate=" + createdDate + ", completionDate="
				+ completionDate + ", description=" + description + ", attachedfiles=" + attachedfiles + "]";
	}
	
	
}
