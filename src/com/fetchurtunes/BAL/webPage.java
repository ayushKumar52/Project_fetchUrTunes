package com.fetchurtunes.BAL;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;

public class webPage {
	private anchor webPageAnchor;
	private String webPageHash;
	private int anchorParseStatus;
	private int emailPartseStatus;
	private Document document; // Document(web documents) class

	public webPage(anchor a) { // constructor(webPageAnchor)
		webPageAnchor = a;
	}

	public void crawlAndFetchDocuments() {
		try {
			System.setProperty("https.proxyHost", "10.3.100.207");
			System.setProperty("https.proxyPort", "8080");
			document = Jsoup.connect(webPageAnchor.getAnchorUrl()).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// getters for all private fields
	public anchor getWebPageAnchor() {
		return webPageAnchor;
	}

	public String getWebPageHash() {
		return webPageHash;
	}

	public int getAnchorParseStatus() {
		return anchorParseStatus;
	}

	public int getEmailPartseStatus() {
		return emailPartseStatus;
	}

	public Document getDocument() {
		return document;
	}

	// setters for all private fields
	public void setWebPageAnchor(anchor webPageAnchor) {
		this.webPageAnchor = webPageAnchor;
	}

	public void setWebPageHash(String webPageHash) {
		this.webPageHash = webPageHash;
	}

	public void setAnchorParseStatus(int anchorParseStatus) {
		this.anchorParseStatus = anchorParseStatus;
	}

	public void setEmailPartseStatus(int emailPartseStatus) {
		this.emailPartseStatus = emailPartseStatus;
	}

	public void setDocument(Document document) {
		this.document = document;
	}
}
