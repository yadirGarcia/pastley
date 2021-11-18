package com.pastley.models.dto;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

import com.pastley.util.PastleyValidate;

public class AlertDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<FacesMessage> messages;
	private boolean next;
	private int count;
	private int size;

	@PostConstruct
	public void init() {
		initMessages();
		next = false;
	}

	/**
	 * Method that allows to initialize the list of messages.
	 */
	public void initMessages() {
		messages = new ArrayList<FacesMessage>();
		count = -1;
		size = -1;
	}

	/**
	 * Method that allows verifying that the list of messages is not null.
	 */
	public void isMessages() {
		if (!PastleyValidate.isList(messages))
			initMessages();
	}

	/**
	 * Method that allows you to verify if it contains a message.
	 * 
	 * @return true if it has a message false if not.
	 */
	public boolean containsMessages() {
		return (PastleyValidate.isList(messages));
	}

	/**
	 * Method that allows inserting a message to the list.
	 * 
	 * @param type,        Represents the type of message.
	 * @param title,       Represents the title of the message.
	 * @param description, Represents the description of the message.
	 * @return true if I add it false if not.
	 */
	public boolean insert(Severity type, String title, String description) {
		isMessages();
		if (type != null && title != null && PastleyValidate.isChain(description)) {
			messages.add(new FacesMessage(type, title, description));
			return true;
		}
		return false;
	}

	/**
	 * Method that allows adding the messages of an alert to this alert.
	 * 
	 * @param alert, represents the alert.
	 * @return true if I add them false if not.
	 */
	public boolean add(AlertDTO alert) {
		return (alert != null) ? add(alert.getMessages()) : false;
	}

	/**
	 * Method that allows messages to be added to this alert.
	 * 
	 * @param list, represents the messages.
	 * @return true if i add them false if not.
	 */
	public boolean add(List<FacesMessage> list) {
		if (list != null) {
			isMessages();
			int size = list.size();
			int count = 0;
			for (FacesMessage mg : list) {
				if (mg != null) {
					messages.add(mg);
					count++;
				}
			}
			if (count == size)
				return true;
		}
		return false;
	}

	public boolean success(String description) {
		return insert(FacesMessage.SEVERITY_INFO, "", description);
	}

	public boolean warn(String description) {
		return insert(FacesMessage.SEVERITY_WARN, "", description);
	}

	public boolean error(String description) {
		return insert(FacesMessage.SEVERITY_ERROR, "", description);
	}

	public boolean fatal(String description) {
		return insert(FacesMessage.SEVERITY_FATAL, "", description);
	}

	/**
	 * Method that allows messages to be printed.
	 * 
	 * @param list, Represents the list of messages.
	 */
	public void toPrintln(List<FacesMessage> list) {
		if (PastleyValidate.isList(list)) {
			for (FacesMessage mg : list)
				toPrintln(mg);
		}
	}

	/**
	 * Method that allows a message to be printed.
	 * 
	 * @param message, represents the message.
	 */
	public void toPrintln(FacesMessage message) {
		if (message != null)
			FacesContext.getCurrentInstance().addMessage(null, message);
	}

	/**
	 * Method that allows messages to be printed.
	 */
	public void toPrintln(boolean init) {
		toPrintln(messages);
		if (init)
			initMessages();
	}

	public List<FacesMessage> getMessages() {
		return messages;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setMessages(List<FacesMessage> messages) {
		this.messages = messages;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
