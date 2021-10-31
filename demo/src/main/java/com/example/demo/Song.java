package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Song {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String title;
        private int length;
        private int trackNumber;
        private String album;

        public String getTitle() {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public int getLength() {
                return length;
        }

        public void setLength(int length) {
                this.length = length;
        }

        public int getTrackNumber() {
                return trackNumber;
        }

        public void setTrackNumber(int trackNumber) {
                this.trackNumber = trackNumber;
        }

        public String getAlbum() {
                return album;
        }

        public void setAlbum(String album) {
                this.album = album;
        }

        public Song(String title, int length, int trackNumber, String album) {
                this.title = title;
                this.length = length;
                this.trackNumber = trackNumber;
                this.album = album;
        }


        public String toString(){
                String song=" ";
                song+=this.title+" length "+this.length+" sec with "+this.trackNumber+" trac number from "+this.album;
                return song;
        }
}
