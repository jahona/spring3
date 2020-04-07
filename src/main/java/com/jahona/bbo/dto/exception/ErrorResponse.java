package com.jahona.bbo.dto.exception;

import java.util.HashMap;
import java.util.Map;

public class ErrorResponse {
    private Map<String, Object> map;
    private String message;
    private int code;

    public ErrorResponse(String message, int code) {
        this.message = message;
        this.code = code;

        update();
    }

    private void update() {
        map = new HashMap<String, Object>();
        map.put("error", new HashMap<String, Object>() {{
            put("message", message);
            put("code", code);
        }});
    }

    public Map<String, Object> getMap() {
        return map;
    }
}