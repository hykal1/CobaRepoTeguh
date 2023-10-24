package com.example.tiket;

import android.os.Parcel;
import android.os.Parcelable;

public class TiketFilm implements Parcelable {
    private String name;
    private int rating;
    private String tahun;
    private String genre;
    private String penjelasan;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPenjelasan() {
        return penjelasan;
    }

    public void setPenjelasan(String penjelasan) {
        this.penjelasan = penjelasan;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeInt(this.rating);
        dest.writeString(this.tahun);
        dest.writeString(this.genre);
        dest.writeString(this.penjelasan);
    }

    public void readFromParcel(Parcel source) {
        this.name = source.readString();
        this.rating = source.readInt();
        this.tahun = source.readString();
        this.genre = source.readString();
        this.penjelasan = source.readString();
    }

    public TiketFilm() {
    }

    protected TiketFilm(Parcel in) {
        this.name = in.readString();
        this.rating = in.readInt();
        this.tahun = in.readString();
        this.genre = in.readString();
        this.penjelasan = in.readString();
    }

    public static final Parcelable.Creator<TiketFilm> CREATOR = new Parcelable.Creator<TiketFilm>() {
        @Override
        public TiketFilm createFromParcel(Parcel source) {
            return new TiketFilm(source);
        }

        @Override
        public TiketFilm[] newArray(int size) {
            return new TiketFilm[size];
        }
    };
}
