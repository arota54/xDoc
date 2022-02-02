/*
* generated by Xtext
*/
package org.eclipse.xtext.xdoc.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.xdoc.services.XdocGrammarAccess;

public class XdocParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private XdocGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_SL_COMMENT");
	}
	
	@Override
	protected org.eclipse.xtext.xdoc.parser.antlr.internal.InternalXdocParser createParser(XtextTokenStream stream) {
		return new org.eclipse.xtext.xdoc.parser.antlr.internal.InternalXdocParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "XdocFile";
	}
	
	public XdocGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(XdocGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
