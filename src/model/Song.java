package model;

import java.io.Serializable;
import java.util.Comparator;

public class Song implements Serializable, Comparable<Song>, Comparator<Song> {

	private static final long serialVersionUID = 4898115281270251697L;

	private final String path;
	private String name;
	private String album;
	private String artist;
	private int trackNumber;

	public Song(String path, String name, String album, String artist, int trackNumber) {
		this.path = path;
		this.name = name;
		this.album = album;
		this.artist = artist;
		this.trackNumber = trackNumber;
	}

	public String getPath() {
		return path;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getTrackNumber() {
		return trackNumber;
	}

	public void setTrackNumber(int trackNumber) {
		this.trackNumber = trackNumber;
	}

	@Override
	public int compareTo(Song s) {
		return trackNumber - s.getTrackNumber();
	}

	@Override
	public int compare(Song s1, Song s2) {
		return s1.getTrackNumber() - s2.getTrackNumber();
	}

}