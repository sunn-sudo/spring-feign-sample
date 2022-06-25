package com.restfull.httpcom.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.restfull.httpclient.HelloClient;
import com.restfull.httpcom.HelloCom;

@Component
public class HelloComImpl implements HelloCom {

	@Autowired
	private HelloClient helloClient;

	@Override
	public String customHello() {
		/* httpclient(hello)から取得した文字を編集 */
		String customMessage = helloClient.Hello() + " → これは編集対象です。";
		return customMessage;
	}

}
