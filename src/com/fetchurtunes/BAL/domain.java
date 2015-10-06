package com.fetchurtunes.BAL;

import java.sql.Timestamp;

public class domain {
	private String domainHash;
	private String domainUrl;
	private boolean activated;
	private Timestamp created;
	private Timestamp modified;

	public domain(String domainHash, String domainUrl) { // constructor(domainHash,domainUrl)
		super();
		this.domainHash = domainHash;
		this.domainUrl = domainUrl;
	}

	public domain(String domainHash, String domainUrl, boolean activated, Timestamp created, Timestamp modified) { // constructor(all)
		super();
		this.domainHash = domainHash;
		this.domainUrl = domainUrl;
		this.activated = activated;
		this.created = created;
		this.modified = modified;
	}

	// getters for all private fields
	public String getDomainHash() {
		return domainHash;
	}

	public String getDomainUrl() {
		return domainUrl;
	}

	public boolean getActivated() {
		return activated;
	}

	public Timestamp getCreated() {
		return created;
	}

	public Timestamp getModified() {
		return modified;
	}

	// setters for all private fields
	public void setDomainHash(String domainHash) {
		this.domainHash = domainHash;
	}

	public void setDomainUrl(String domainUrl) {
		this.domainUrl = domainUrl;
	}

	public void setActivated(boolean isActive) {
		this.activated = isActive;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public void setModified(Timestamp modified) {
		this.modified = modified;
	}
}
