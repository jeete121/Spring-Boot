package com.bce.chatgtp.model;

import lombok.Data;

@Data
public class Choice {

	private int index;
	private Message message;

	private String finish_reason;

}
