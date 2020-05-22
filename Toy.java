package com.example.agendiario;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "toys")

public class Toy {


    @PrimaryKey (autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "ToyId")
    private int mID;

    @NonNull
    @ColumnInfo(name = "ToyCreationDate")
    private String mCreationDate;

    @Nullable
    @ColumnInfo(name = "ToyNickname")
    private String mNickname;

    @ColumnInfo(name = "ToyStateOfUSe")
    private int mStateOfUse;

    @ColumnInfo(name = "ToyName")
    private String mName;

    public Toy(@NonNull String mCreationDate, @Nullable String mNickname, int mStateOfUse, String mName) {
        this.mCreationDate = mCreationDate;
        this.mNickname = mNickname;
        this.mStateOfUse = mStateOfUse;
        this.mName = mName;
    }

    public int getmID() {
        return mID;
    }

    public void setmID(int mID) {
        this.mID = mID;
    }

    public String getmCreationDate() {
        return mCreationDate;
    }

    public void setmCreationDate(String mCreationDate) {
        this.mCreationDate = mCreationDate;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmNickname() {
        return mNickname;
    }

    public void setmNickname(String mNickname) {
        this.mNickname = mNickname;
    }

    public int getmStateOfUse() {
        return mStateOfUse;
    }

    public void setmStateOfUse(int mStateOfUse) {
        this.mStateOfUse = mStateOfUse;
    }

}



//muito bem


