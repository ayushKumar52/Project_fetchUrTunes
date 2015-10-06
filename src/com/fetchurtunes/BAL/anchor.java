package com.fetchurtunes.BAL;

import java.sql.Timestamp;

public class anchor {
	private domain anchorDomain;
	private String anchorHash;
	private String anchorUrl;
	private int scanStatus;
	private boolean activated;
	private Timestamp created;
	private Timestamp modified;

	public anchor(domain anchorDomain, String anchorHash, String anchorUrl) { // constructor(anchorDomain,anchorHash,anchorUrl)
		super();
		this.anchorDomain = anchorDomain;
		this.anchorHash = anchorHash;
		this.anchorUrl = anchorUrl;
	}

	public anchor(domain anchorDomain, String anchorHash, String anchorUrl, int scanStatus, boolean activated,
			Timestamp created, Timestamp modified) { // constructor(all)
		super();
		this.anchorDomain = anchorDomain;
		this.anchorHash = anchorHash;
		this.anchorUrl = anchorUrl;
		this.scanStatus = scanStatus;
		this.activated = activated;
		this.created = created;
		this.modified = modified;
	}

	// getters for all private fields
	public domain getAnchorDomain() {
		return anchorDomain;
	}

	public String getAnchorHash() {
		return anchorHash;
	}

	public String getAnchorUrl() {
		return anchorUrl;
	}

	public int getScanStatus() {
		return scanStatus;
	}

	public boolean isActivated() {
		return activated;
	}

	public Timestamp getCreated() {
		return created;
	}

	public Timestamp getModified() {
		return modified;
	}

	// setters for all private fields
	public void setAnchorDomain(domain anchorDomain) {
		this.anchorDomain = anchorDomain;
	}

	public void setAnchorHash(String anchorHash) {
		this.anchorHash = anchorHash;
	}

	public void setAnchorUrl(String anchorUrl) {
		this.anchorUrl = anchorUrl;
	}

	public void setScanStatus(int scanStatus) {
		this.scanStatus = scanStatus;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public void setModified(Timestamp modified) {
		this.modified = modified;
	}
}
