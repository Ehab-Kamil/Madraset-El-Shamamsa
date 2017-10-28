/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screenObject;

import javax.faces.model.SelectItem;
import javax.servlet.http.Part;

import Enums.ContentType;

/**
 *
 * @author Ehab
 */
public class ContentSO implements ScreenObject {

	private String contentCode;
	private String contentName;
	private int durationInHours;
	private boolean isParent;
	private String parentContentCode;
	private ContentType type;
	private Part audioFile;
	private String pdfFilePath;
	private String audioFilePath;
	private Part pdfFile;

	public Part getAudioFile() {
		return audioFile;
	}

	public void setAudioFile(Part audioFile) {
		this.audioFile = audioFile;
		this.audioFilePath = getPathFromPart(audioFile);
	}

	public String getPdfFilePath() {
		return pdfFilePath;
	}

	public void setPdfFilePath(String pdfFilePath) {
		this.pdfFilePath = pdfFilePath;
	}

	public String getAudioFilePath() {
		return audioFilePath;
	}

	public void setAudioFilePath(String audioFilePath) {
		this.audioFilePath = audioFilePath;
	}

	public Part getPdfFile() {
		return pdfFile;
	}

	public void setPdfFile(Part pdfFile) {
		this.pdfFile = pdfFile;
		this.pdfFilePath = getPathFromPart(pdfFile);
	}

	public String getContentCode() {
		return contentCode;
	}

	public void setContentCode(String contentCode) {
		this.contentCode = contentCode;
	}

	public String getContentName() {
		return contentName;
	}

	public void setContentName(String contentName) {
		this.contentName = contentName;
	}

	public String getParentContentCode() {
		return parentContentCode;
	}

	public void setParentContentCode(String parentContentCode) {
		this.parentContentCode = parentContentCode;
	}

	@Override
	public String toString() {
		return getContentCode();
	}

	public int getDurationInHours() {
		return durationInHours;
	}

	public void setDurationInHours(int durationInHours) {
		this.durationInHours = durationInHours;
	}

	public boolean isParent() {
		return isParent;
	}

	public void setParent(boolean isParent) {
		this.isParent = isParent;
	}

	public SelectItem[] getType() {
		SelectItem[] items = new SelectItem[ContentType.values().length];
		int i = 0;
		for (ContentType g : ContentType.values()) {
			items[i++] = new SelectItem(g, g.toString());
		}
		return items;
	}

	public void setType(ContentType type) {
		this.type = type;
	}

	public ContentType getSelectedType() {
		return this.type;
	}

	public String getPathFromPart(Part part) {
		if (part != null) {
			String header = part.getHeader("content-disposition");
			if (header == null)
				return null;
			for (String headerPart : header.split(";")) {
				if (headerPart.trim().startsWith("filename")) {
					return headerPart.substring(headerPart.indexOf('=') + 1).trim().replace("\"", "");
				}
			}
		}
		return null;

	}

}
