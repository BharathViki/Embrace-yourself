package com.bharath.restApi.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bharath.restApi.model.MessageBean;

public class InitialService {
	private Map<Integer, MessageBean> messageMap;
	
	public InitialService() {
		
		MessageBean bean1  = new MessageBean();
		bean1.setId(1);
		bean1.setContent("Congrats Da");
		bean1.setDate(new Date());
		
		MessageBean bean2  = new MessageBean();
		bean2.setId(2);
		bean2.setContent("Happy Birthday Da");
		bean2.setDate(new Date());
		messageMap = new HashMap<Integer, MessageBean>();
		messageMap.put(1,bean1);
		messageMap.put(2,bean2);
		
	}
	
	public String getMessage() {
		return "Hi, Hello";
	}
	
	
	public List<MessageBean> getMessageDetails() {
		
		return new ArrayList<MessageBean>(messageMap.values());
	}

	public MessageBean getMessageForId(int messageId) {
		// TODO Auto-generated method stub
		if(messageMap.containsKey(messageId)) {
			return messageMap.get(messageId);
		} else {
			return null;
		}
		
		
	}
}
