package net.java.textilej.parser.markup.confluence.phrase;

import net.java.textilej.parser.DocumentBuilder.SpanType;

public class SimplePhraseModifier extends SimpleWrappedPhraseModifier {

	public SimplePhraseModifier(String delimiter, SpanType spanType, boolean nesting) {
		super(delimiter,delimiter,spanType, nesting);
	}

}
