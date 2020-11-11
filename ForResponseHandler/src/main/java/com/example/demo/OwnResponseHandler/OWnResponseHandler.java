package com.example.demo.OwnResponseHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
@Component
public class OWnResponseHandler {
	
	public ResponseEntity<Object> response(HttpStatus httpStatus, Boolean isError, String message,
			int errorCode, String description, String responseCode) {
		Map<String, Object> map = new HashMap<>();
		map.put("timestamp", new Date().getTime());
		map.put("httpStatus", httpStatus.value());
		map.put("isError", isError);

		if (isError) {
			Error error = new Error(errorCode, description, message);
			map.put("error", error);
			map.put("errorCode", errorCode);
		}
		map.put("message", message);
		map.put("responseCode", responseCode);
		return new ResponseEntity<>(map, httpStatus);

	}

	public  ResponseEntity<Object> response(HttpStatus httpStatus, Boolean isError, String message,
			Object responseObject) {
		Map<String, Object> map = new HashMap<>();
		map.put("timestamp", new Date().getTime());
		map.put("httpStatus", httpStatus.value());
		map.put("isError", isError);
		map.put("message", message);
		map.put("data", responseObject);
		return new ResponseEntity<>(map, httpStatus);
	}

	public  ResponseEntity<Object> response(HttpStatus httpStatus, boolean isError, String message,
			String Description) {
		Map<String, Object> map = new HashMap<>();
		map.put("timestamp", new Date().getTime());
		map.put("httpStatus", httpStatus.value());
		map.put("isError", isError);
		map.put("message", message);
		map.put("Description", Description);
		return new ResponseEntity<>(map, httpStatus);
	}
	
	
	

}
