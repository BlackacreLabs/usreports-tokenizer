package org.blackacrelabs.usreports.tokenizer;

import java.lang.reflect.Type;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class TokenSerializer implements JsonSerializer<Token> {
	@Override
	public JsonElement serialize(Token src, Type typeOfSrc,
			JsonSerializationContext context) {
		JsonArray a = new JsonArray();
		a.add(new JsonPrimitive(src.type.toString()));
		if (src.text != null)
			a.add(new JsonPrimitive(src.text.toString()));
		return a;
	}
}
