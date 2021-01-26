package com.agencevoyage.jackson;

import java.io.IOException;
import java.time.LocalDate;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class LocalDateDeserializer extends StdDeserializer<LocalDate> {

	private static final long serialVersionUID = 1L;

	protected LocalDateDeserializer() {
		super(LocalDate.class);
	}

	public LocalDate deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		return LocalDate.parse(jp.readValueAs(String.class));
	}

}

///**
// * Deserialization of java.time.LocalDate "dd/MM/yyyy"
// *
// */
//public class LocalDateDeserializer extends JsonDeserializer<LocalDate> {
//	@Override
//	public LocalDate deserialize(JsonParser parser, DeserializationContext context) throws IOException {
//
//		return LocalDate.parse(parser.getText(), DateTimeFormatter.ISO_LOCAL_DATE);
//	}
